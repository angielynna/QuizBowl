/*
 * TCSS 143
 * Instructor: Raghavi Sakpal
 * PA2 - QuestionMC.java
 */
 
import java.io.*;
import java.util.*;

/*
 * QuestionMC inherits from the abstract question class
 * @author Angelynna Pyeatt
 * @version 5 November 2021
 */
public class QuestionMC extends Question {
   
   /*Arraylist of Strings to store multiple choice entries*/
   private ArrayList<String> myMCEntries;
   
   /*stores the correct answer choice to a particular question*/
   private String myAnswer;
   
   /*
    * Constructor
    * 
    * @param String theQuestion - a String question
    * @param int thePoint - an Integer question point
    * @param ArrayList<String> theEntries - an Arraylist of multiple-
    * choice entries
    * @param String theAnswer - String answer choice
    */
   public QuestionMC(String theQuestion, int thePoint, 
                     ArrayList<String> theEntries, String theChoice) {
      super(theQuestion, thePoint);
      this.myMCEntries = theEntries;
      this.myAnswer = theChoice;
   }
   
   /*
    * returns the correct answer choice to a particular question
    *
    * @return this.myAnswer - correct answer choice to question
    */
   public String getAnswer() {
      return this.myAnswer;
   }
   
   /*
    * @Override parent's toString() method
    * Calls parents toString() and displays multiple choice entries in
    * the format of the sample output.
    *
    * @return String - point value, question and multiple choice
    * entries in the format of the sample output.
    */

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(super.toString() + "\n");
            
      for(int i = 0; i < myMCEntries.size(); i++) {
         sb.append("\n"+(char)('A'+i) + ")\t" + myMCEntries.get(i)); 
      }
      return sb.toString();
   }
}
