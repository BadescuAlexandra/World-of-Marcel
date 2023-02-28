package com.company;

import java.util.ArrayList;

public abstract class Entity
{

    final int viataMaxima = 100;
    final int manaMaxima = 70;
    ArrayList<Spell> abilitati;
    int viataCurenta;
    int manaCurenta;
    boolean fire, ice, earth;

    public  abstract void receiveDamage(int damage);

    public  abstract int getDamage();

    public void regenerareViata(int valoare)
    {
        viataCurenta += valoare;
        if(viataCurenta >= viataMaxima)
            viataCurenta = viataMaxima;
    }

    public void regenerareMana(int valoare)
    {
        manaCurenta += valoare;
        if(manaCurenta >= manaMaxima)
            manaCurenta = manaMaxima;
    }

    public void folosireAbilitate(Entity enemy, Spell spell)
    {
        if(manaCurenta > spell.costMana)
        {
            if(spell.getClass().getSimpleName().equals("Fire") && enemy.fire == true)
            {
                System.out.println("Inamicul are protectie la foc!");
                enemy.viataCurenta -= spell.damage / 2;
                manaCurenta -= spell.costMana;
            }
            else if(spell.getClass().getSimpleName().equals("Ice") && enemy.ice == true)
            {
                System.out.println("Inamicul are protectie la gheata!");
                enemy.viataCurenta -= spell.damage / 2;
                manaCurenta -= spell.costMana;
            }
            else if(spell.getClass().getSimpleName().equals("Earth") && enemy.earth == true)
            {
                System.out.println("Inamicul are protectie la pamant!");
                enemy.viataCurenta -= spell.damage / 2;
                manaCurenta -= spell.costMana;
            }
            else
            {
                enemy.viataCurenta -= spell.damage;
                manaCurenta -= spell.costMana;
            }
        }
        else
        {
            System.out.println("Nu ai destula mana!");
        }
    }

}
