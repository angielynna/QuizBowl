/*
 * TCSS 143
 * Instructor: Raghavi Sakpal
 * PA2 - Question.java
 */
 
import java.io.*;
import java.util.*;

/*
 * Question is an abstract class that keeps track of information 
 * common to all three types of questions (MC, SA, TF)
 * @author Angelynna Pyeatt
 * @version 5 November 2021
 */
public abstract class Question {
   /*stores the question*/
   private String myQuestion;
   /*stores a point value*/
   private int myPoint;
   
   /*
    * Constructor
    *
    * @param String theQuestion - a String question
    * @param int thePoint - Integer question point
    */
   public Question(String theQuestion, int thePoint) {
      this.myQuestion = theQuestion;
      this.myPoint = thePoint;
   }
   
   /*
    * returns question value
    *
    * @return this.myQuestion - String myQuestion
    */
   public String getQuestion() {
      return this.myQuestion;
   }
   
   /*
    * returns the point value
    *
    * @return this.myPoint - int myPoint
    */
   public int getPoints() {
      return this.myPoint;
   }
   
   /*
    * @Override default toString() method to display the point value
    * and question in the format of the sample output
    *
    * @return String - point value and question in the format of the 
    * sample output
    */
   public String toString() {
      return "Points: " + getPoints() + "\nQuestion: " + getQuestion();
   }
   
   abstract public String getAnswer();
}
