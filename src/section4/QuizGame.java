package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String food = JOptionPane.showInputDialog("What is my favorite food?");
		// 3.  Use an if statement to check if their answer is correct
	if(food.equals("pizza")) {
		// 4.  if the user's answer is correct

		// -- add one to their score 
		score+=1;}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
	String color = JOptionPane.showInputDialog("What is my favorite color?");
	if(color.equals("blue")) {
		score+=1;}
	
	String school = JOptionPane.showInputDialog("What school do I go to?");
	if(school.equals("Mt.Carmel")) {
		score+=1;}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, score);
	}
}
