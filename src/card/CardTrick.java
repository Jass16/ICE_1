/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**Modifier. Jaskaran Sekhon, Student Number- 991540540
  
  
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args){
            Card[] magicHand = new Card[7];
        
//for loop to generate 7 random cards
        for (int i=0; i<magicHand.length; i++){
        
            Card c = new Card();
            c.setValue((int) (Math.random()*13+1));
            c.setSuit(Card.SUITS[((int) (Math.random()*4))]);
            magicHand [i]= c;
           //System.out.println (magicHand[i].getSuit()+ " "+ magicHand[i].getValue());
        }
 //asking for user input to enter the card of their choice       
            Scanner input= new Scanner(System.in);
            System.out.println("Please enter one of the following symbol"
                                + " on your chosen card- "
                                +"Diamonds,Clubs,Spades,Clubs");
            System.out.print("Symbol: ");
            String userCard= input.nextLine();
            System.out.println("Please enter any number on the card from 1 to 13.");
            System.out.print("Number: ");
            int userNum= input.nextInt();
                
//assigning user's card value to Card object
            Card chosenCard = new Card();
            chosenCard.setSuit(userCard);
            chosenCard.setValue(userNum);
      
// checking and matching user's card with randomly generated 7 cards      
            boolean match = false;
            for (int i=0;i<magicHand.length;i++){
                 if (magicHand[i].getSuit().equals(chosenCard.getSuit()) 
                 && magicHand[i].getValue()==chosenCard.getValue()){
                 match= true;
                 break;
             }
        }
       
//final feedback statement
            if(match){
                System.out.println ("Hurayy! You found the matching card!");
            }
            else{
               System.out.println ("Oops, you card doesnt match!");
            }
    }
}
