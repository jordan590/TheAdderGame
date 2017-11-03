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
public class AdderGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameHandler game = new GameHandler();
        game.setRandomNums();
        game.start();
        
        
    }
    
}
