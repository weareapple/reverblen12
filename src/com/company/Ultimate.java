package com.company;

public class Ultimate  extends Hero {
    private Weapon weapon;
    private String ultimate;

    public Ultimate(String name, int age, Weapon weapon, String ultimate) {
        super(name, age);
        this.weapon = weapon;
        this.ultimate = ultimate;
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
                "\nultimate = " + getUltimate() ;
    }

}
