package com.GreeckCodeCommunity.hellIsland.domain;



public class interactionDisplay extends menuInput{

        String cmd;
        menu mainMenu;
        static boolean[] monsters = new boolean[5];



    public void story() {
        System.out.println("\n\n\n\n\n\n=====================================================");
        System.out.println("|| While returning home from a trip on an airplane,||");
        System.out.println("|| a terrible storm formed on your way and you     ||");
        System.out.println("|| were left stranded alone in an island...        ||");
        System.out.println("|| Can you escape your fate?                       ||");
        System.out.println("=====================================================");
        availableCmds();

    }

    public void availableCmds(){
        System.out.println("\n Available Commands:\n====================");
        System.out.println("|| Move\t\tInfo  ||\n|| Actions\tStats ||");
        System.out.println("====================");
        decision();
    }

    public void decision() {

        cmd=inputCmd();
        if(cmd.equals("Move")){
            move();
        }
        else if(cmd.equals("Info")){
            info();
        }
        else if(cmd.equals("Actions")){
            action();
        }
        else if(cmd.equals("Stats")){
            //stats
        }

    }


    public void move(){
        System.out.println("\n Available Commands:\n=======================");
        System.out.println("|| go up\tgo down  ||\n|| go left\tgo right ||");
        System.out.println("=======================");
        cmd=inputCmd();
        if(cmd.equals("go right")){
            System.out.println("Went right!");
        }
        else if(cmd.equals("go left")){
            System.out.println("Went left!");
        }
        else if(cmd.equals("go up")){
            System.out.println("Went up!");
        }
        else if(cmd.equals("go down")){
            System.out.println("Went down!");
        }
        else {
            availableCmds();
        }
    }

    public void info(){
        System.out.println("\n Available Commands:\n====================");
        System.out.println("|| Location\tMap  ||\n|| Tasks\tExit ||\n|| Save\t\tLoad ||");
        System.out.println("====================");
        cmd=inputCmd();
        if(cmd.equals("Exit")){
            System.exit(0);
        }
        else if(cmd.equals("Tasks")){
            System.out.println("\nYour Tasks:\n=================================");
            for(int i=0;i<monsters.length;i++){
                if(monsters[i] == false){
                    System.out.println("The monster No: "+(i+1)+" is still alive");
                }
                else{
                    System.out.println("The monster No: "+(i+1)+" Has been slain!");
                }
            }
            System.out.println("=================================");
        }
        else if(cmd.equals("Map")){
            System.out.println("\nMap:\n=================================");
            //showMap
            System.out.println("=================================");
        }
        else if(cmd.equals("Location")){
            System.out.println("\nYour Location:\n=================================");
            //getLocation
            System.out.println("=================================");
        }
        else if(cmd.equals("Save")){
            mainMenu.saveGame();
        }
        else if(cmd.equals("Load")){
            mainMenu.loadGame();
        }
        else{
            availableCmds();
        }

    }

    public void action(){
        System.out.println("\n Available Commands:\n====================");
        System.out.println("|| Search\tPick ||\n|| Attack \tUse  ||");
        System.out.println("====================");
        cmd=inputCmd();
        if(cmd.equals("Search")){
            System.out.println("Searching the "); //+ getCharacterLocation +"........" );
            //searchRoom
        }
        else if(cmd.equals("Pick")){
            //pickItem
        }
        else if(cmd.equals("Attack")){
            //attackMonster
        }
        else if(cmd.equals("Use")){
            //use selected item
        }
        else {
            availableCmds();
        }

    }


}
