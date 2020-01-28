package ru.Eltex;

public class Person {
    private String name;
    private int health;
    private int happiness;
    private int hunger;
    private int money;
    private int days;

    public void setPerson(String valueName) {
        name = valueName;
        health = 100;
        happiness = 100;
        hunger = 5;
        money = 50;
        days = 10;
    }
    public void conditionPerson() {
        System.out.println("Health: " + health);
        System.out.println("Happiness: " + happiness);
        System.out.println("Hunger: " + hunger);
        System.out.println("Money: " + money + "$");
        System.out.println("Days: " + days);
    }
    public boolean checkName(String valueName) {
        return !valueName.equals("");
    }
    public void goCinema() {
        money -= 10;
        if (happiness <= 90)
            happiness += 10;
        else
            happiness = 100;
    }
    public void goRestaurant() {
        money -= 20;
        if (hunger < 3)
            hunger += 2;
        else
            hunger = 5;
    }
    public void goSleep() {
        hunger -= 2;
        if (happiness >= 70)
            happiness -= 5;
        else
            happiness += 1;
    }
    public void walkWithFriends() {
        happiness += 30;
        money -= 50;
        health -= 2;
    }
    public void goWork() {
        happiness -= 10;
        hunger -= 2;
        health -= 1;
        money += 10;
    }
    public void goHospital() {
        if (health <= 70)
            health += 30;
        else
            health = 100;
        money -= 25;
        happiness -= 10;
        hunger -= 1;
    }
    public void watchNetflix() {
        if (happiness <= 85)
            happiness += 15;
        else
            happiness = 100;
    }
    public boolean checkAlive() {
        if(money < -50) {
            System.out.println("You owe too much money.");
            return false;
        } else if (happiness <= 0) {
            System.out.println("You were too unhappy");
            return false;
        } else if (happiness > 100) {
            System.out.println("You were very happy");
        } else if (health <= 0 || health > 100) {
            System.out.println("You had health problems");
            return false;
        } else if (hunger <= 0) {
            System.out.println("You were too hungry");
            return false;
        }
        return true;
    }

}
