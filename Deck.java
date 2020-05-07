/*
 * Author: alex torres 
 * this class will store a deck of cards. this class has an array list that will store a deck of cards.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	//arraylist that stores cards
	private ArrayList <Card> deck = null;
	
	//constructor that creates a deck of empty cards
	public Deck() {
		//arraylist initalized to 53 (52 = joker)
		deck = new ArrayList<Card>(53);
	}
	
	//method that adds card to deck
	public void addCard(Card card) {
		deck.add(card);
	}
	
	//method that will shuffle deck
	public void shuffleDeck() {
		Collections.shuffle(deck);
	}
	//deal first half of deck cards 1-26
	public ArrayList<Card> dealFirstHalf (){
		
		//creating an array list 
		ArrayList<Card> tempHand = new ArrayList<Card> ();
		
		//for loop that will copy the first half of the deck to the array list 
		for (int i =0; i < 26; i++) {
		Card tempCard = deck.get(i);
		tempHand.add(tempCard);
		}
		
		return tempHand;
	}
	
	//deal second half of the deck 27-53
	public ArrayList<Card> dealSecondhalf() {
		//creating a temp array list
		ArrayList <Card> tempHand = new ArrayList<Card> ();
		
		//for loop that will copy secound half of deck to the temp arrayList
		for (int i =26; i<53; i++) {
			//temp card
			Card tempCard = deck.get(i);
			tempHand.add(tempCard);
		}
		return tempHand;
	}
	
	@Override
	public String toString () {
		return deck.toString();
	}
	
	
}
