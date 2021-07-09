package com.bae;

import java.util.ArrayList;

public class DoggoCompetition {

	public ArrayList<String> competition = new ArrayList<String>();

	public String placeDoggo(int placing) {
		listDoggo();
		competition.remove(placing - 1);
		return "Competition" + competition;
	}

	public void listDoggo() {

		for (int i = 1; i < 101; i++) {
			if (i == 11 || i == 12 || i == 13) {
				String place = i + "th";
				competition.add(place);
			} else {
				if ((i - 1) % 10 == 0) {
					String place = i + "st";
					competition.add(place);
				} else if ((i - 2) % 10 == 0) {
					String place = i + "nd";
					competition.add(place);
				} else if ((i - 3) % 10 == 0) {
					String place = i + "rd";
					competition.add(place);
				} else {
					String place = i + "th";
					competition.add(place);
				}
			}
		}
//		return "Competition" + competition;
	}

}
