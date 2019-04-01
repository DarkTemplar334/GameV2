package gr.gcc.hellIsland;

import gr.gcc.hellIsland.domain.interactionMenu;
import gr.gcc.hellIsland.domain.mainMenu;

public class Main {

    private static mainMenu mMenu = new mainMenu();
    private static interactionMenu interMenu = new interactionMenu();
    private static boolean gameOver = true;
    private static String decision;

    public static void main(String[] args) {
        decision=mMenu.gameMenu();
        while(gameOver==true) {
            if (decision.equals("New Game")){
                gameOver = false;
                interMenu.story();
            }
            else if(decision.equals("Load Game")){
                mMenu.loadGame();
                gameOver = false;
            }
            else {
                System.out.println("wrong input choose wisely");
                decision = mMenu.gameMenu();
            }
        }
        while(gameOver==false){
            interMenu.availableCmds();

        }

    }
}
