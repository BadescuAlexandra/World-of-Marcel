package com.company;

import java.util.ArrayList;

public class Game {

    public static ArrayList<Account> conturi = new ArrayList<>();

    private static Game instanta = null;

    public static Game getInstance()
    {
        if(instanta == null)
        {
            instanta = new Game();
        }
        return instanta;
    }

}
