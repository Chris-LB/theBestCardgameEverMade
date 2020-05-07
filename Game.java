/*
 * author alex torres
 * this is the games class that will run the game. this class will create the deck, player, and hand. this class
 * will also will run each step of the game 
 */
public class Game {
	
	public static void startGame() {
		
		//create deck
		Deck deck = CreateDeck.fullDeck();
		
		//shuffle deck
		deck.shuffleDeck();
		
		//create hands
		
		//hand for player. half the deck is delt
		Hand playerHand = new Hand( deck.dealFirstHalf());
		
		//hand for computer player. second half is delt
		Hand computerHand = new Hand( deck.dealSecondhalf());
		
		//add hand to players
		
		//player
		Player p1 = new Player( playerHand);
		
		//computer
		ComputerPlayer c1 = new ComputerPlayer( computerHand);
		
		
		
		
		//boolean that is false until one player runs out of cards
		boolean noWinner = true;
		
		//loop that will keep the game going
		while (noWinner) {
			
		}
	}

}
