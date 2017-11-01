/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package addergame;

/**
 *
 * @author joklu7045
 */
import java.util.Random;
import java.util.Scanner;

public class GameBooth {
    
    int randNum1, randNum2, answer, answerGiven, tryCounter;
    boolean isCorrect;
    Random rand = new Random();
    
    public void setRandomNums(){
        randNum1 = rand.nextInt(20);
        randNum2 = rand.nextInt(20);
    }
    
    
    public String start(){
        Scanner scan = new Scanner(System.in);
        answerGiven = scan.nextInt();
        answer = getAnswer();
        if(answerGiven == answer){
            isCorrect = true;
        } else {
            isCorrect = false;
        }
        return null;
    }
    
    public int getAnswer(){
        return (randNum1 + randNum2);
    }
    
    public String printQuestion(){
        return (randNum1 + " + " + randNum2 + " = ");
    }
            
            
}
