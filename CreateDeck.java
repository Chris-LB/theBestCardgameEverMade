
/*
 * author alex torres
 * this class will create all 53 cards
 * the cards will then be put into a deck. 
 */
import javax.swing.ImageIcon;

//this class has a static method that will return a deck of 53 cards
public class CreateDeck {
	
	

	public static Deck fullDeck() {
		//create cards to add to deck
		
		//ace
		Card heartAce = new Card(Card.hearts,Card.ace,new ImageIcon("FolderOfCards/AH.png"));
		Card diamondAce = new Card(Card.diamonds, Card.ace, new ImageIcon("FolderOfCards/AD.png"));
		Card spadeAce = new Card(Card.spade, Card.ace, new ImageIcon("FolderOfCards/AS.png"));
		Card clubAce = new Card(Card.club, Card.ace, new ImageIcon("FolderOfCards/AC.png"));
		
		
		//two
		Card heartTwo = new Card(Card.hearts, Card.two, new ImageIcon("FolderOfCards/2H.png"));
		Card diamondTwo = new Card(Card.diamonds, Card.two, new ImageIcon("FolderOfCards/2D.png"));
		Card spadeTwo = new Card(Card.spade, Card.two, new ImageIcon("FolderOfCards/2S.png"));
		Card clubTwo = new Card(Card.club, Card.two, new ImageIcon("FolderOfCards/2C.png"));
		
		//three
		Card heartThree = new Card(Card.hearts, Card.three, new ImageIcon("FolderOfCards/3H.png"));
		Card diamondThree = new Card(Card.diamonds, Card.three, new ImageIcon("FolderOfCards/3D.png"));
		Card spadeThree = new Card(Card.spade, Card.three, new ImageIcon("FolderOfCards/3S.png"));
		Card clubThree = new Card(Card.club, Card.three, new ImageIcon("FolderOfCards/3C.png"));
		
		//four
		Card heartFour = new Card(Card.hearts, Card.four, new ImageIcon("FolderOfCards/4H.png"));
		Card diamondFour = new Card(Card.diamonds, Card.four, new ImageIcon("FolderOfCards/4D.png"));
		Card spadeFour = new Card(Card.spade, Card.four, new ImageIcon("FolderOfCards/4S.png"));
		Card clubFour = new Card(Card.club, Card.four, new ImageIcon("FolderOfCards/4C.png"));
		
		//five
		Card heartFive = new Card(Card.hearts ,Card.five, new ImageIcon("FolderOfCards/5H.png"));
		Card diamondFive = new Card(Card.diamonds ,Card.five, new ImageIcon("FolderOfCards/5D.png"));
		Card spadeFive = new Card(Card.spade ,Card.five, new ImageIcon("FolderOfCards/5S.png"));
		Card clubFive = new Card(Card.club ,Card.five, new ImageIcon("FolderOfCards/5C.png"));
		
		//six
		Card heartSix = new Card(Card.hearts , Card.six, new ImageIcon("FolderOfCards/6H.png"));
		Card diamondSix = new Card(Card.diamonds , Card.six, new ImageIcon("FolderOfCards/6D.png"));
		Card spadeSix = new Card(Card.spade , Card.six, new ImageIcon("FolderOfCards/6S.png"));
		Card clubSix = new Card(Card.club , Card.six, new ImageIcon("FolderOfCards/6C.png"));
		
		//seven
		Card heartSeven = new Card(Card.hearts ,Card.seven, new ImageIcon("FolderOfCards/7H.png"));
		Card diamondSeven = new Card(Card.diamonds ,Card.seven, new ImageIcon("FolderOfCards/7D.png"));
		Card spadeSeven = new Card(Card.spade ,Card.seven, new ImageIcon("FolderOfCards/7S.png"));
		Card clubSeven = new Card(Card.club ,Card.seven, new ImageIcon("FolderOfCards/7C.png"));
		
		//eight 
		Card heartEight = new Card(Card.hearts , Card.eight, new ImageIcon("FolderOfCards/8H.png"));
		Card diamondEight = new Card(Card.diamonds , Card.eight, new ImageIcon("FolderOfCards/8D.png"));
		Card spadeEight = new Card(Card.spade , Card.eight, new ImageIcon("FolderOfCards/8S.png"));
		Card clubEight = new Card(Card.club , Card.eight, new ImageIcon("FolderOfCards/8C.png"));
	
		//nine 
		Card heartNine = new Card(Card.hearts , Card.nine, new ImageIcon("FolderOfCards/9H.png"));
		Card diamondNine = new Card(Card.diamonds , Card.nine, new ImageIcon("FolderOfCards/9D.png"));
		Card spadeNine = new Card(Card.spade , Card.nine, new ImageIcon("FolderOfCards/9S.png"));
		Card clubNine = new Card(Card.club , Card.nine, new ImageIcon("FolderOfCards/9C.png"));
		
		//ten
		Card heartTen = new Card (Card.hearts , Card.ten, new ImageIcon("FolderOfCards/10H.png"));
		Card diamondTen = new Card (Card.diamonds , Card.ten, new ImageIcon("FolderOfCards/10D.png"));
		Card spadeTen = new Card (Card.spade , Card.ten, new ImageIcon("FolderOfCards/10S.png"));
		Card clubTen = new Card (Card.club , Card.ten, new ImageIcon("FolderOfCards/10c.png"));
		
		//jack
		Card heartJack = new Card(Card.hearts , Card.jack, new ImageIcon("FolderOfCards/JH.png"));
		Card diamondJack = new Card(Card.diamonds , Card.jack, new ImageIcon("FolderOfCards/JD.png"));
		Card spadeJack = new Card(Card.spade, Card.jack, new ImageIcon("FolderOfCards/JS.png"));
		Card clubJack = new Card(Card.club , Card.jack, new ImageIcon("FolderOfCards/JC.png"));
		
		//queen
		Card heartQueen = new Card(Card.hearts , Card.queen, new ImageIcon("FolderOfCards/QH.png"));	
		Card diamondQueen = new Card(Card.diamonds , Card.queen, new ImageIcon("FolderOfCards/QD.png"));
		Card spadeQueen = new Card(Card.spade , Card.queen, new ImageIcon("FolderOfCards/QS.png"));
		Card clubQueen = new Card(Card.club , Card.queen,new ImageIcon("FolderOfCards/QC.png"));
		
		//king
		Card heartKing = new Card(Card.hearts , Card.king, new ImageIcon("FolderOfCards/KH.png"));
		Card diamondKing = new Card(Card.diamonds , Card.king, new ImageIcon("FolderOfCards/KD.png"));
		Card spadeKing = new Card(Card.spade , Card.king, new ImageIcon("FolderOfCards/KS.png"));
		Card clubKing = new Card(Card.club , Card.king, new ImageIcon("FolderOfCards/KC.png"));
		
		//joker
		Card joker = new Card("joker", Card.joker, new ImageIcon("FolderOfCards/joker.png"));
		
		//create a new deck
		Deck deck = new Deck();
		
		//adding cards to deck
		
		//ace
		deck.addCard(heartAce);
		deck.addCard(diamondAce);
		deck.addCard(spadeAce);
		deck.addCard(clubAce);
		
		//two
		deck.addCard(heartTwo);
		deck.addCard(diamondTwo);
		deck.addCard(spadeTwo);
		deck.addCard(clubTwo);
		
		
		//three
		deck.addCard(heartThree);
		deck.addCard(diamondThree);
		deck.addCard(spadeThree);
		deck.addCard(clubThree);
		
		//four
		deck.addCard(heartFour);
		deck.addCard(diamondFour);
		deck.addCard(spadeFour);
		deck.addCard(clubFour);
		
		//five
		deck.addCard(heartFive);
		deck.addCard(diamondFive);
		deck.addCard(spadeFive);
		deck.addCard(clubFive);
		
		//six
		deck.addCard(heartSix);
		deck.addCard(diamondSix);
		deck.addCard(spadeSix);
		deck.addCard(clubSix);
		
		//seven
		deck.addCard(heartSeven);
		deck.addCard(diamondSeven);
		deck.addCard(spadeSeven);
		deck.addCard(clubSeven);
		
		//eight
		deck.addCard(heartEight);
		deck.addCard(spadeEight);
		deck.addCard(diamondEight);
		deck.addCard(clubEight);
		
		//nine
		deck.addCard(heartNine);
		deck.addCard(diamondNine);
		deck.addCard(spadeNine);
		deck.addCard(clubNine);
		
		//ten
		deck.addCard(heartTen);
		deck.addCard(diamondTen);
		deck.addCard(spadeTen);
		deck.addCard(clubTen);
		
		//jack
		deck.addCard(heartJack);
		deck.addCard(diamondJack);
		deck.addCard(spadeJack);
		deck.addCard(clubJack);
		
		//queen
		deck.addCard(heartQueen);
		deck.addCard(diamondQueen);
		deck.addCard(spadeQueen);
		deck.addCard(clubQueen);
		
		//king
		deck.addCard(heartKing);
		deck.addCard(diamondKing);
		deck.addCard(spadeKing);
		deck.addCard(clubKing);
		
		//joker
		deck.addCard(joker);
		
		return deck;
		
		
	}
}
