//https://youtu.be/ogxywettnIo

import java.util.Scanner;

import java.util.Random;

public class ProjectEliza {
	
	static Scanner keyboard = new Scanner (System.in);
	
	public static void printGreeting() {
		
		System.out.println("Hello, my name is Eliza. What is your name?");
		
	}
	
	public static void printWhatsOnYourMind(String name) {
		
		System.out.println("Hello, " + name + ". Tell me what is on your mind today in 1 sentence.");
		
	}
	
	public static String [] takeFirstAndLast(String line) {
		
		String [] firstAndLast = new String [2];
		
		boolean isOneWord = true;
		
		for(int i = 0; i < line.length(); ++i) {
			
			if(line.charAt(i) == ' ') {
				
				isOneWord = false;
				
			}
		}
			
			if(isOneWord == false) {
				
				firstAndLast [0] = line.substring(0, line.indexOf(" "));
				
				firstAndLast [1] = line.substring(line.lastIndexOf(" ") + 1);
				
				return firstAndLast;
				
			}
			
			if (isOneWord == true) {
				
				firstAndLast [0] = line;
				
				firstAndLast [1] = line;
				
			}
		
		return firstAndLast;

	}
	
	public static String readLine(){
		
		String line = keyboard.nextLine();
		
		return line;
		
	}
	
	
	public static void main (String [] args) {
		
		Random random = new Random();  
		
		boolean outerRepeat = true;
		
		while(outerRepeat == true) {
		
		printGreeting();
		
		String name = keyboard.next();
		
		printWhatsOnYourMind(name);
		
		String tempString = keyboard.nextLine();
		
		boolean innerRepeat = true;
		
		while(innerRepeat == true) {
		
		String answer = keyboard.nextLine();
		
		if(answer.equalsIgnoreCase("EXIT")){
			
			System.out.println("Would you like to run the session again?");
			
			String runAgain = keyboard.next();
			
			if(runAgain.equalsIgnoreCase("Yes")) {
				
				innerRepeat = false;
				
				break;
			}
			
			if(runAgain.equalsIgnoreCase("No")) {
				
				innerRepeat = false;
				
				outerRepeat = false;
				
				System.out.println("Goodbye, until next time :)");
				
				break;
			}
			
		}
		
		String [] takeStrings = new String [2];
		
		takeStrings = takeFirstAndLast(answer);

		PromptBank responses = new PromptBank();
		
		responses.populateStatementsArray(takeStrings [0], takeStrings[1] , name);
		
		responses.populateQuestionsArray(takeStrings [0], takeStrings[1], name);
		
		if(answer.isBlank()) {
		
		while(answer.isBlank()) {
			
			System.out.println("I didn't quite catch that. Try again");
			
			break;
		}
		
		}
		
		else if(answer.charAt(answer.length() - 1) == '?') {
			
				System.out.println(responses.getRandomQuestionTrunk(random.nextInt(21)));
				
			}
			
		else if(answer.charAt(answer.length() - 1) == '!') {
				
				System.out.println("WOW! Dramatic! " + responses.getRandomStatementTrunk(random.nextInt(13)));
					
			}
		
		else {
			
			System.out.println(responses.getRandomStatementTrunk(random.nextInt(13)));
				
		}
		
		}
		
		}
			
			
		
}
}
		
		

		
