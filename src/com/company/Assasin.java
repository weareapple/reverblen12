package com.company;

public final class Assasin extends Ultimate {
    private int Health;
    private String name;
    private int age;

    public Assasin(String name, int age, Weapon weapon, String ultimate, int Health,Def def){
        super(name, age,weapon, ultimate, new Def("fr12uu", "qwssae"));
        this.Health = Health;
        this.name = name;
        this.age = age;

    }


    public void makeTotem(String totemName, int health) {
        for (int i = 0; i < health ; i++) {
            System.out.println(totemName);
        }
    }

    public void makeTotem(int health,String totemName) {
        for (int i = 0; i < health; i++) {
            System.out.println(totemName);
        }
    }

    public void makeTotem(String totemName){
        System.out.println(totemName);
    }
}