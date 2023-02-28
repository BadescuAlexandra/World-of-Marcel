package com.company;
import java.util.*;

public class Account<Information>
{
    public int numarJocuri = 0;

    public ArrayList<Character> personaje = new ArrayList<>();

    public Information informatiiCont;

    public void setPersonaje(ArrayList<Character> personaje)
    {
        this.personaje = personaje;
    }

    public void setInformatiiCont(Information informatiiCont)
    {
        this.informatiiCont = informatiiCont;
    }

    public void setNumarJocuri(int numarJocuri)
    {
        this.numarJocuri = numarJocuri;
    }

    @Override
    public String toString()
    {
        return "Account{" +
                "informatiiCont=" + informatiiCont +
                ", personaje=" + personaje +
                ", jocuri_jucate=" + numarJocuri +
                '}';
    }

    static class Information extends Account<Credentials>
    {
        private final String nume;
        private final String tara;
        TreeSet<String> jocuriPreferate = new TreeSet<String>();
        private Credentials credentiale;

        public Information(InformationBuilder builder)
        {
            this.nume = builder.nume;
            this.tara = builder.tara;
            this.credentiale = builder.credentiale;
            this.jocuriPreferate = builder.jocuriPreferate;
        }

        public String getNume()
        {
            return nume;
        }

        public String tara()
        {
            return tara;
        }

        public Credentials getCredentiale()
        {
            return credentiale;
        }

        public SortedSet<String> getJocuriPreferate()
        {
            return jocuriPreferate;
        }

        @Override
        public String toString()
        {
            return "Information{" +
                    "mail=" + credentiale.getEmail() +
                    ", parola=" + credentiale.getParola() +
                    ", nume='" + nume + '\'' +
                    ", tara='" + tara + '\'' +
                    ", jocuriPreferate=" + jocuriPreferate +
                    '}';
        }

        public static class InformationBuilder
        {
            private final String nume;
            private final String tara;
            TreeSet<String> jocuriPreferate = new TreeSet<String>();
            private Credentials credentiale;

            public InformationBuilder(String nume, String tara)
            {
                this.nume = nume;
                this.tara = tara;
            }

            public InformationBuilder jocuriPreferate(TreeSet<String> jocuriPreferate)
            {
                this.jocuriPreferate = jocuriPreferate;
                return this;
            }

            public InformationBuilder setCredentiale(Credentials cred)
            {
                this.credentiale = cred;
                return this;
            }

            public Information build()
            {
                return new Information(this);
            }

        }

    }

}