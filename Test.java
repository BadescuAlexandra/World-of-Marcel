package com.company;

import java.util.ArrayList;

import java.util.TreeSet;

public class Test
{
    public static void main(String[] args)
    {
        Game.getInstance();
        Factory factory = new Factory();

        Account contNou = new Account();

        TreeSet<String> jocuriPreferateContNou = new TreeSet<String>();
        jocuriPreferateContNou.add("World Of Marcel");
        jocuriPreferateContNou.add("Witcher 3");
        jocuriPreferateContNou.add("Darts");

        Credentials credentialeContNou = new Credentials();
        credentialeContNou.setEmail("marcel@yahoo.com");
        credentialeContNou.setParola("marcel");

        Account.Information informatiiContNou = new Account.Information.InformationBuilder("Marcelino", "Romania")
                .jocuriPreferate(jocuriPreferateContNou)
                .setCredentiale(credentialeContNou)
                .build();

        contNou.setInformatiiCont(informatiiContNou);

        ArrayList<Character> personaje = new ArrayList<>();

        personaje.add(factory.createCharacter("Warrior", "Tudor", 0, 0));
        personaje.add(factory.createCharacter("Mage", "Jaina Proudmoore", 1, 2));
        personaje.add(factory.createCharacter("Rogue", "Murloc", 5, 10));


        contNou.setPersonaje(personaje);

        contNou.numarJocuri = 10;

        System.out.println(contNou);

        //testare damage
        System.out.println("Il atac pe romeo cu 120 damage");
        Character romeo = factory.createCharacter("Warrior", "romeo", 10, 10);
        romeo.receiveDamage(200);
        System.out.println("Romeo mai are " + romeo.viataCurenta + " HP");
        System.out.println("Romeo poate sa dea " + romeo.getDamage() + " damage");

        // testare regenerare
        romeo.regenerareViata(10);
        System.out.println("Romeo si-a regenerat viata si acum are " + romeo.viataCurenta + " HP");
        // la fel si pentru mana
        romeo.regenerareMana(13);
        System.out.println("Romeo si-a regenerat mana si acum are " + romeo.manaCurenta + " mana");

        // testare folosire abilitate pe un inamic (poate fi si character)
        Character tudor = (Character) contNou.personaje.get(0);
        System.out.println("Tudor are " + tudor.viataCurenta + " HP");
        System.out.println("Romeo foloseste o abilitate Fire pe Tudor");
        romeo.folosireAbilitate(tudor, romeo.abilitati.get(0));
        System.out.println("Tudor are acum " + tudor.viataCurenta + " HP");
    }

}
