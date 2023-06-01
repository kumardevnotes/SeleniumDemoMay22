package com.controlstructures;

public class MultipleIfElseDemo {

	public static void main(String[] args) {
		
		// xyz != XYZ

		int personAge = 15;

		if (personAge >= 18 && personAge <= 60) {  // 15 >= 18 && 15 <= 60 --> false && true --> false
			System.out.println("Person is eligible to Vote at Voting station");
		} else if (personAge >= 18 && personAge > 60) { // 15 >= 18 && 15 > 60 --> false && false --> false
			System.out.println("Person is eligible to Vote from home");
		} else {
			System.out.println("Person is not eligible to vote");
		}
		
		/*
		 * AND Operator &&
		 * true && true --> true
		 * true && false --> false
		 * false && true --> false
		 * false && false --> false*/
		
		String day = "Sunday";

		if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
				day.equals("Thursday") || day.equals("Friday") ) {
			// false || false || false || false || false --> false
			System.out.println("Its not weekend. Just go and work :)");
		}
		else
		{
			System.out.println("If you see this message, you are wasting your time. Just go and enjoy. Its weekend :)");
		}
		
		/*
		 * OR Operator ||
		 * true || true --> true
		 * true || false --> true
		 * false || true --> true
		 * false || false --> false*/

	}

}
