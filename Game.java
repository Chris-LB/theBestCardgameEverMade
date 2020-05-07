/*
 * author alex torres
 * this is the games class that will run the game. this class will create the deck, player, and hand. this class
 * will also will run each step of the game 
 */
public class Game {
	
	Deck deck;
	
	Hand playerHand;
	Hand computerHand;
	
	Player p1;
	ComputerPlayer c1;
	
	int playerChoosenIndex;
	
	//this method will set up a game
	public void gameSetup() {
		
		//create deck
		deck = CreateDeck.fullDeck();
		
		//shuffle deck
		deck.shuffleDeck();
		
		//create hands
		
		//hand for player. half the deck is delt
		 playerHand = new Hand( deck.dealFirstHalf());
		
		//hand for computer player. second half is delt
		 computerHand = new Hand( deck.dealSecondhalf());
		
		//add hand to players
		
		//player
		 p1 = new Player( playerHand);
		
		//computer
		 c1 = new ComputerPlayer( computerHand);
			
			
	}
	
	//this method is the player turn. this method will remove a card from the computer hand based on an index
	public void playerTurn() {
		//removing card from index given from combo box action listener
		
		Card tempCard = c1.hand.getCard(playerChoosenIndex);
		c1.removeCard(playerChoosenIndex);
		
		//put card into player deck
		p1.hand.addCard(tempCard);
		
		//check for pairs
		p1.removePairs();
		
	}
	
	
	

}
