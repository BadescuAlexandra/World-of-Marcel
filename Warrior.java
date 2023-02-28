package com.company;

import java.util.ArrayList;

public class Warrior extends Character
{
    public Warrior(String nume, int experientaCurenta, int nivelCurent)
    {
        this.nume = nume;
        this.experientaCurenta = experientaCurenta;
        this.nivelCurent = nivelCurent;
        this.inventar = new Inventory();
        this.putere = 10;
        this.dexteritate = 3;
        this.carisma = 5;
        this.viataCurenta = 100;
        this.manaCurenta = 70;
        this.fire = true;
        this.ice = false;
        this.earth = false;
        this.abilitati = new ArrayList<>();
        this.abilitati.add(new Fire());
    }

    @Override
    public void receiveDamage(int damage)
    {
        this.viataCurenta = this.viataCurenta - damage / (dexteritate + carisma);
    }

    @Override
    public int getDamage()
    {
        return 3 * putere;
    }

    @Override
    public String toString()
    {
        return "Warrior";
    }

}
