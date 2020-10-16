package com.company;

public class Main {

    public static void main(String[] args) {
    Ultimate phantomStrike = new Ultimate("Phantom",5,Weapon.SWORD,"PhantomStrike");
    Assasin assasin = new Assasin("Nyx",12,Weapon.HALBERD,"Omnilslah",400);
    Assasin assasin2 = new Assasin("Nix",23,Weapon.SPEAR,"dodo",600);

        System.out.println(phantomStrike.getInfo());
        System.out.println("__________________________________________");

        System.out.println(assasin.getInfo());
        System.out.println("__________________________________________");
        System.out.println(assasin2.getInfo());
        System.out.println("__________________________________________");

        assasin.makeTotem("cat",2);
        assasin.makeTotem(2,"gug");
        assasin.makeTotem("ward");
    }

}
