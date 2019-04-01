package gr.gcc.hellIsland.domain;

public class interactionMenu {

        private static parser input = new parser();
        private String decision;

    public static void story(){
        String words ="#\tWhile returning home from your business trip by airplane,\t\t\t\t#" +
                "\n#\ta terrible storm formed on your way and a thunderbolt hit your plane.\t#" +
                "\n#\tleaving you alone on a island.\t\t\t\t\t\t\t\t\t\t\t#" +
                "\n#\t\t\t\t\t\tCan you escape your fate?\t\t\t\t\t\t\t#";
        int i=0;
        System.out.println("\n\n\n\n\n\n#############################################################################");
        for(i=0;i<words.length();i++){
            System.out.print(words.charAt(i));
//            try {
//                Thread.sleep(25);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }
        System.out.println("\n#############################################################################");
        availableCmds();
    }

    public static void availableCmds(){
        System.out.println("\n Available Commands:\n====================");
        System.out.println("|| Move\t\tInfo  ||\n|| Actions\tStats ||");
        System.out.println("====================");
        input.inputCmd();

    }

    public void moveCommands(){
        System.out.println("\n Moving Commands:\n====================");
        System.out.println("|| go up\tgo down  ||\n|| go left\tgo right ||");
        System.out.println("====================");
        decision = input.reInput();
        input.move(decision);
    }

    public void infoCommands(){
        System.out.println("\n Info Commands:\n====================");
        System.out.println("|| Map\t\tStats ||\n|| Tasks\tMenu ||");
        System.out.println("====================");
        decision = input.reInput();
        input.move(decision);
    }
}
