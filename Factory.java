package com.company;

public class Factory
{
    public Character createCharacter(String tip, String nume, int experientaCurenta, int nivelCurent)
    {
        if (tip.equals("Warrior"))
        {
            return new Warrior(nume, experientaCurenta, nivelCurent);
        }
        else if (tip.equals("Mage"))
        {
            return new Mage(nume, experientaCurenta, nivelCurent);
        }
        else if (tip.equals("Rogue"))
        {
            return new Rogue(nume, experientaCurenta, nivelCurent);
        }
        else
        {
            return null;
        }
    }

}
