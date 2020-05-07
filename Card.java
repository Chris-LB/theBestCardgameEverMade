/*
 * author : alex Torres
 * this class is the card class that will hold the suit, value and image of the card.
 * this class contains a comparator that will compare the values of 2 cards
 * 
 */
import java.util.Comparator;

import javax.swing.ImageIcon;

public class Card  {
	
	//instance variables for cards
	
	private String suit;
	private int rank;
	private ImageIcon cardImage;
	
	//preset suits for when making cards
	public final static String hearts = "h";
	public final static String diamonds = "d";
	public final static String spade ="s";
	public final static String club ="c";
	
	//preset rank for when making cards
	public final static int ace = 1;
	public final static int two = 2;
	public final static int three =3;
	public final static int four = 4;
	public final static int five =5;
	public final static int six = 6;
	public final static int seven = 7;
	public final static int eight =8;
	public final static int nine =9;
	public final static int ten = 10;
	public final static int jack = 11;
	public final static int queen = 12;
	public final static int king = 13;
	public final static int joker = 14;
	
	//constructor that takes in a suit, rank and in image for the card
	public Card(String suit, int rank, ImageIcon image) {
		this.suit = suit;
		this.rank = rank;
		cardImage= image;
	}
		
	//get suit of the card
	public String getSuit() {
		return suit;
	}
	
	//gets the rank of the card
	public int getRank() {
		return rank;
	}
	
	//gets the rank of the card
	public ImageIcon getImage() {
		return cardImage;
	}

	//comparator that will compare card by value
	public static Comparator <Card> compareByValue = new Comparator<Card>() {
	//this method will compare the cards by the value.
	@Override
	public int compare (Card o1, Card o2) {
		return o1.rank - o2.rank ;
		}
	};

	//toString method
	@Override 
	public String toString() {
		return rank + " of " + suit + "\n";
	}
	
}
