/*
 * TCSS 143
 * Instructor: Raghavi Sakpal
 * PA2 - Player.java
 */
import java.io.*;
import java.util.*;

/*
 * keeps track of the user playing the game
 * @author Angelynna Pyeatt
 * @version 5 November 2021
 */
public class Player {
   
   /*first name of player*/
   private String myPlayerFirstName;
   
   /*last name of player*/
   private String myPlayerLastName;
   
   /*number of points the player has*/
   private int myPlayerPoints;
   
   /*
    * Constructor
    *
    * @param String theFirst - a String first name
    * @param String theLast - a String last name
    */
   public Player(String theFirst, String theLast) {
      this.myPlayerFirstName = theFirst;
      this.myPlayerLastName = theLast;
      myPlayerPoints = 0;
   }
   
   /*
    * returns player's first name
    *
    * @return this.myPlayerFirstName - a String first name
    */
   
   public String getFirstName() {
      return this.myPlayerFirstName;
   }
   
   /*
    * returns player's last name
    *
    * @return this.myPlayerLastName - a String last name
    */
   
   public String getLastName() {
      return this.myPlayerLastName;
   }
   
   /*
    * returns player's current quiz score
    *
    * @return this.myPlayerPoints - current quiz score
    */
   public int getPlayerScore() {
      return this.myPlayerPoints;
   }
   
   /*
    * updates the player’s quiz score
    *
    * @param int thePoint - points obtained
    */
    
   public void updatePlayerScore(int thePoint){
      this.myPlayerPoints+=thePoint;
   }
   
   /*
    * @Override the toString() method to display player name
    * and points in the format of the sample output
    *
    * @return String - String containing player name and points
    */
   public String toString() {
      return getFirstName() + " " + getLastName() + ", your " +
            "game is over!\nYour final score is " + getPlayerScore()+
            " points.\nBetter luck next time!";
   }
}
