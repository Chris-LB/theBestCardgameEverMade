/*
 * author alex torres
 * this class is the computerPlayer class. this class extends the player class. this 
 * class has a method that will simulate a player choosing a random card.
 */
import java.util.ArrayList;

public class ComputerPlayer extends Player{
	
	//constructor that takes in a hand
	public ComputerPlayer(Hand hand) {
		super(hand);
	}
	
	//method that returns a random int value the simulates a the computer making a choice 
	public int GenerateRandomInt (ArrayList<Card> hand) {
		//finding the size of the hand and setting it as the max value
		int max_value = hand.size() - 1;
		int random = (int) (Math.random() * max_value);  
		return random;
	}

}
