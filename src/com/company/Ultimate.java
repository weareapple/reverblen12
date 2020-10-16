package com.company;

public class Ultimate  extends Hero {
    private Weapon weapon;
    private String ultimate;
    private Def def;

    public Ultimate(String name, int age, Weapon weapon, String ultimate, Def def){
        super(name, age);
        this.weapon = weapon;
        this.ultimate = ultimate;
        this.def = def;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public String getUltimate() {
        return ultimate;
    }


    public String getInfo() {
        return "Ultimate = " +
                "\nname = " + getName() +
                "\nweapon = " + getWeapon()+
                "\nage = " + getAge()+
                "\nultimate = " + getUltimate()+
                "\nShelter.address = " + def.getAddress();

    }

}
