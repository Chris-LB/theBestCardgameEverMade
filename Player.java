/*
 * author: alex torres
 * this class is the player class. this player class has a hand that will store cards.
 */
public class Player {
	//hand of player that will holds the cards
	Hand hand;
	
	//constructor that receives an hand
	public Player(Hand h) {
		hand = h;
	}
	
	//takes card from hand base on index
	public Card removeCard(int index) {
		Card tempCard = hand.removeCard(index);
		return tempCard;
	}
	
	//add card to hand
	public void addCard(Card card ) {
		hand.addCard(card);
	}
	
	
	//toString 
	@Override 
	public String toString() {
		return hand.toString();
	}
}
