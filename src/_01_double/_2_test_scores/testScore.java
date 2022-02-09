package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testScore {
	public static void main(String[] args) {
		//1.Write code to ask the user for their test score. 
		//Your program MUST allow the user to enter a test score that has a DECIMAL, e.g. 75.5
		//2.Give them a different message according to their score. 
		//Example, for a good score: "Wow! You must have studied really hard for that test!" 
		
	
		
		String testScore = JOptionPane.showInputDialog(null,"Enter your test score");
		double testScoreInt = Double.parseDouble(testScore);
		System.out.println(testScoreInt);
		if(testScoreInt > 99.999) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
		} else {
			String Suffer =
			String.format("You lack disipline. You no study. Ling Ling, he study 40 hours a day, and you study none!!!\n") +
			String.format("You supposed to be doctor. How you be doctor if no 100 on test? Ling Ling already doctor and \n") +
			String.format("have 4 girlfriend. You cant even talk to girl!");
			JOptionPane.showMessageDialog(null, Suffer);
		}
		 //HINT: Think about how you would convert a String to an int and use SIMILAR code to convert their test score to a double

		
		
		
		
		
	}
}