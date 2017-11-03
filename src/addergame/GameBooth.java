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

    int randNum1, randNum2, answer, answerGiven;
    int tryCounter = 0;
    int score = 0;
    boolean isCorrect;
    Random rand = new Random();

    public void setRandomNums() {
        randNum1 = rand.nextInt(20);
        randNum2 = rand.nextInt(20);
    }

    public void start() {
        randNums();
        System.out.println(printQuestion());
        Scanner scan = new Scanner(System.in);
        answerGiven = scan.nextInt();
        answer = getAnswer();
        if (answerGiven == answer) {
            isCorrect = true;
            if (tryCounter == 0) {
                score += 5;
            } else if (tryCounter == 1) {
                score += 3;
            } else if (tryCounter == 2) {
                score += 1;
            }
            tryCounter = 0;
        } else if (answerGiven == 999) {
            System.out.println(endOutput());
            System.exit(0);
        } else {
            isCorrect = false;
            if (tryCounter >= 3){
                System.out.println("No points awarded, the answer was: " + answer);
                System.out.println("Skipping question...");
                setRandomNums();
                start();
            } else {
            tryCounter++;
            System.out.println(incorrectOutput());
            start();
            }
        }

        if (isCorrect == true) {
            setRandomNums();
            start();
        }

    }

    public int getAnswer() {
        return (randNum1 + randNum2);
    }

    public String printQuestion() {
        return (randNum1 + " + " + randNum2 + " = ");
    }

    public String endOutput() {
        return "Your score is: " + score;
    }

    public String incorrectOutput() {
        return "Wrong answer. Enter another answer: ";
    }
    
    public void randNums(){
        if (isCorrect == true){
            setRandomNums();
        }
    } 

}
