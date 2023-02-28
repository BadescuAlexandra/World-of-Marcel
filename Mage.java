package com.company;

import java.util.ArrayList;

public class Mage extends Character
{

    public Mage(String nume, int experientaCurenta, int nivelCurent)
    {
        this.nume = nume;
        this.experientaCurenta = experientaCurenta;
        this.nivelCurent = nivelCurent;
        this.inventar = new Inventory();
        this.putere = 3;
        this.dexteritate = 2;
        this.carisma = 10;
        this.viataCurenta = 100;
        this.manaCurenta = 70;
        this.fire = false;
        this.ice = true;
        this.earth = false;
        this.abilitati = new ArrayList<>();
        this.abilitati.add(new Ice());
    }

    @Override
    public void receiveDamage(int damage)
    {
        this.viataCurenta = this.viataCurenta - damage / (dexteritate + putere);
    }

    @Override
    public int getDamage()
    {
        return 3 * carisma;
    }

    @Override
    public String toString()
    {
        return "Mage";
    }

}
