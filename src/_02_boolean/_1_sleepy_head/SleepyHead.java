package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend = true;
		// Write code to ask the user what day it is.
        String Day = JOptionPane.showInputDialog(null,"What day of the week is is it?");
		// Set the boolean isWeekend based on the value they enter
		// OOOOOOOOOOOOOOOOOOOOOOOOOOOHHHHHHHHHHHHHHHHHHHHHHHHH
        //Stupid program doesn't understand Kanji ¯\_()_/¯ (can't put face in middle- ruined the entire program too :(
        //nvm works but still can't save
        //¯\_(ツ)_/¯
        //literally did something random. It worked???
        //¯\_(ツ)_/¯ no more pops at least 
        //broke again nvm
        //nvm fixed it
		isWeekend = Day.contentEquals("Saturday") || Day.equals("Sunday") || Day.equals("saturday")|| Day.equals("sunday");
		if(isWeekend) {
			JOptionPane.showMessageDialog(null,"You get to sleep in." );
		} else if (!isWeekend) {
			JOptionPane.showMessageDialog(null,"Get out of bed and go to school!" );
		}
		// If it is the weekend, tell the user they get to sleep in.
			//! checks if false
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		//String Toby = "idiot";
		//if(Toby.equals("idiot")) {
			//JOptionPane.showMessageDialog(null, "Fuck you");
		
		
		
		/************************   STAR STUDENT  **************************/
			boolean passedExam = true;
			// Write code to ask the user what percentage they scored in their last exam
			String test = JOptionPane.showInputDialog(null,"What did you score in your last exam?");
			
			// If they scored more than 70, they passed the exam.
			double test2 = Double.parseDouble(test);
			passedExam = test2 > 70;
			if(passedExam) {
				JOptionPane.showMessageDialog(null, "you passed.");
			} else {
			JOptionPane.showMessageDialog(null, "better luck next time.");
			}
			// Set the boolean passedExam based on their score.
			
			// If the user passed the exam, congratulate them
			
			// otherwise, wish them better luck next time.
			
		/************************  GAME OVER  **************************/
		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes")) {
				gameIsOver = true;
			JOptionPane.showMessageDialog(null, "game is over");
		}
		}
			// If they answer "yes", change gameIsOver to true
			
		// Tell the user "game is over" 
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed = true;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String whatColor = JOptionPane.showInputDialog(null,"what color do you want to draw with (choose red)");
		isRed = whatColor.equalsIgnoreCase("red");
		boolean isSquare = true;	
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		String whatShape = JOptionPane.showInputDialog(null,"what shape do you want to draw (choose square");
		isSquare = whatShape.equalsIgnoreCase("square");
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		if(isRed && isSquare) {
			drawRedSquare();
		} else {
			JOptionPane.showMessageDialog(null, "Cant' you listen twerp?");
		}
			
		// Complete the rest of this method
		}
	private static void drawRedSquare() {
		// TODO Auto-generated method stub
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(50);
		rob.setPenColor(Color.red);
		rob.move(150);
		rob.turn(90);
		rob.move(150);
		rob.turn(90);
		rob.move(150);
		rob.turn(90);
		rob.move(150);
	}
}


