package com.company;

import java.util.ArrayList;

public class Rogue extends Character
{

    public Rogue(String nume, int experientaCurenta, int nivelCurent)
    {
        this.nume = nume;
        this.experientaCurenta = experientaCurenta;
        this.nivelCurent = nivelCurent;
        this.inventar = new Inventory();
        this.putere = 3;
        this.dexteritate = 10;
        this.carisma = 6;
        this.viataCurenta = 100;
        this.manaCurenta = 70;
        this.fire = false;
        this.ice = false;
        this.earth = true;
        this.abilitati = new ArrayList<>();
        this.abilitati.add(new Earth());
    }

    @Override
    public void receiveDamage(int damage)
    {
        this.viataCurenta = this.viataCurenta - damage / (carisma + putere);
    }

    @Override
    public int getDamage()
    {
        return 3 * dexteritate;
    }

    @Override
    public String toString()
    {
        return "Rogue";
    }

}
