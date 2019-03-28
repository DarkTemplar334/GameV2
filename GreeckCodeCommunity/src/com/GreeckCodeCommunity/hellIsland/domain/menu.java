package com.GreeckCodeCommunity.hellIsland.domain;


public class menu {
    static menuInput input = new menuInput();
    static String cmd;
    static interactionDisplay display = new interactionDisplay();

    public static void menu() {

        System.out.println("\n===============================");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("==== Game Start?: yes/no  =====");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("===============================");
        cmd=input.inputCmd();
        if(cmd.equals("yes")){
            gameMenu();
        }
        else{
            System.exit(0);
        }

    }

    public static void gameMenu(){
        System.out.println("\n\n\n\n\n\n====================");
        System.out.println("\t New Game");
        System.out.println("\t Load Game");
        System.out.println("\t Exit");
        System.out.println("====================\n\n");
        cmd=input.inputCmd();
        if(cmd.equals("New Game")){
            display.story();

        }
        else if(cmd.equals("Load Game")){

        }
        else{
            System.exit(-1);
        }

    }

    public static void saveGame(){

    }

    public static void loadGame(){

    }
}
