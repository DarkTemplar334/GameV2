package gr.gcc.hellIsland.domain;

import java.util.Scanner;

public class parser {

    private String cmd;
    private interactionMenu intMenu = new interactionMenu();
    private static mainMenu mMenu = new mainMenu();

    public void inputCmd() {
        System.out.println("\nOption: ");
        Scanner input = new Scanner(System.in);
        cmd = input.nextLine();

        //Main Menu Commands

        if (cmd.equals("New Game")) {
            intMenu.story();
        } else if (cmd.equals("Load Game")) {
            mMenu.loadGame();
        } else if (cmd.equals("Save Game")) {
            mMenu.saveGame();
        } else if (cmd.equals("Exit")) {
            mMenu.exitGame();
        }

        //Basic Available Commands

        else if (cmd.equals("Move")) {
            intMenu.moveCommands();
        } else if (cmd.equals("Info")) {
            intMenu.infoCommands();
        } else if (cmd.equals("Actions")) {

        } else if (cmd.equals("Stats")) {

        } else {
            System.out.println("Cant do that!");
        }
    }
        ////////////////////////////////////////////////////////////////////////
        //Secondary Commands!
        ////////////////////////////////////////////////////////////////////////

        public String reInput(){
            System.out.println("\nOption: ");
            Scanner returnInput  = new Scanner(System.in);
            cmd = returnInput.nextLine();
            return cmd;
        }

        //Moving Commands

        public void move(String decision){
            if(decision.equals("go up")){
                System.out.println("Went Up!");
            }
            else if(decision.equals("go down")){
                System.out.println("Went Down!");
            }
            else if(decision.equals("go left")){
                System.out.println("Went Left!");
            }
            else if(decision.equals("go right")){
                System.out.println("Went Right!");
            }
            else{
                System.out.println("Cant go there!");
            }
        }

        public void info(String decision){

        }

}

