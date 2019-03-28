package com.GreeckCodeCommunity.hellIsland.domain;

import java.util.Scanner;

public class menuInput {


    public String inputCmd(){
        System.out.println("\nOption: ");
        Scanner input  = new Scanner(System.in);
        String cmd = input.nextLine();
        return cmd;
    }

}
