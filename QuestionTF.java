/*
 * TCSS 143
 * Instructor: Raghavi Sakpal
 * PA2 - QuestionTF.java
 */
 
import java.io.*;
import java.util.*;

/*
 * QuestionTF inherits from the abstract question class
 * @author Angelynna Pyeatt
 * @version 5 November 2021
 */
public class QuestionTF extends Question {
   /*stores the correct answer to a particular question*/
   private String myAnswer;
   
   /*
    * Constructor calls super
    *
    * @param String theQuestion - a String question
    * @param int thePoint - an Integer question point
    * @param String theAnswer - a String answer
    */
   public QuestionTF(String theQuestion, int thePoint, 
                        String theAnswer) {
      super(theQuestion, thePoint);
      this.myAnswer = theAnswer;
   }
   
   /*
    * returns the answer to the question
    * 
    * @return this.myAnswer - correct answer to a particular question
    */
   public String getAnswer() {
      return this.myAnswer;
   }
}
