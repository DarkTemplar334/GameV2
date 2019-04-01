package gr.gcc.hellIsland.domain;

public class mainMenu {

    private parser input = new parser();
    private String decision;
    //private interactionMenu interMenu = new interactionMenu();

    public String gameMenu(){
        System.out.println("\n\n\n\n\n\n====================");
        System.out.println("\t New Game");
        System.out.println("\t Load Game");
        System.out.println("\t Exit");
        System.out.println("====================\n\n");
        decision = input.reInput();
        return decision;
    }

    public void loadGame(){
        System.out.println("Game Loading.....");

    }

    public void saveGame(){
        System.out.println("Game Saved");

    }

    public void exitGame(){
        System.exit(0);

    }
}
