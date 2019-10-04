package deliverable1;

import java.util.Scanner;

public class WhatToEat {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String eventType;
		String mealSuggestion = null;
		String prepSuggestion = null;
		String result;
		int partySize;

		// Gets user input about event type
		System.out.println("What type of event are you having (casual, semi-formal, or formal)?");

		// user inputs type of event
		eventType = scnr.nextLine();

		// Conditional statement about eventType to mealSuggestion
		if (eventType.equalsIgnoreCase("casual")) {
			mealSuggestion = "sandwiches";
		} else if (eventType.equalsIgnoreCase("semi-formal")) {
			mealSuggestion = "fried chicken";
		} else if (eventType.equalsIgnoreCase("formal")) {
			mealSuggestion = "chicken parmesan";
		} else {
			System.out.println("Input not recognized");
		}

		// Gets user input for number of attendees
		System.out.println("How many people will be attending the event?");

		partySize = scnr.nextInt();

		// Conditional statement about partySize to to prepSuggestion
		if (partySize == 1) {
			prepSuggestion = "in the microwave";
		} else if (partySize > 1 && partySize < 12) {
			prepSuggestion = "in your kitchen";
		}

		else {
			prepSuggestion = "by a caterer";
		}

		// Print out final recommendation
		result = "Since you're hosting a " + eventType + " event for " + partySize + " people, you should serve "
				+ mealSuggestion + " prepared " + prepSuggestion + ".";
		System.out.print(result);

	}
}
