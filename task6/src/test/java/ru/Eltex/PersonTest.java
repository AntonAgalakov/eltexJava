package ru.Eltex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    private Person person;

    @Before
    public void setUp() {
        person = new Person();
        person.setPerson("Johny");
    }
    @Test
    public void setPersonName() {
        String expected = person.getName();
        Assert.assertEquals(expected, "Johny");
    }

    @Test
    public void checkStartParameterHappiness() {
        Assert.assertEquals(person.getHappiness(), 100);
    }

    @Test
    public void checkStartParameterHealth() {
        Assert.assertEquals(person.getHealth(), 100);
    }

    @Test
    public void checkStartParameterHunger() {
        Assert.assertEquals(person.getHunger(), 5);
    }

    @Test
    public void checkStartParameterMoney() {
        Assert.assertEquals(person.getMoney(), 50);
    }

    @Test
    public void checkStartParameterSteps() {
        Assert.assertEquals(person.getSteps(), 0);
    }

    @Test
    public void checkSetParameterHealth() {
        person.setHealth(5);
        Assert.assertEquals(person.getHunger(), 5);
    }

    @Test
    public void checkSetParameter() {
        person.setHappiness(10);
        Assert.assertEquals(person.getHappiness(), 10);
    }

    @Test
    public void checkSetParameterHunger() {
        person.setHunger(2);
        Assert.assertEquals(person.getHunger(), 2);
    }

    @Test
    public void checkSetParameterMoney() {
        person.setMoney(100);
        Assert.assertEquals(person.getMoney(), 100);
    }

    @Test
    public void checkSetParameterSteps() {
        person.setSteps(7);
        Assert.assertEquals(person.getSteps(), 7);
    }

    @Test
    public void actionCheckGoCinema() {
        int money = person.getMoney();
        int happiness = person.getHappiness();

        person.goCinema();

        Assert.assertEquals(person.getMoney(), money - 10);
        if (happiness <= 90)
            Assert.assertEquals(person.getHappiness(), happiness + 10);
        else
            Assert.assertEquals(person.getHappiness(), 100);
    }

    @Test
    public void actionCheckGoRestaurant() {
        int money = person.getMoney();
        int hunger = person.getHunger();

        person.goRestaurant();

        Assert.assertEquals(person.getMoney(), money - 20);
        if (hunger < 3)
            Assert.assertEquals(person.getHunger(), hunger + 2);
        else
            Assert.assertEquals(person.getHunger(), 5);
    }

    @Test
    public void actionCheckGoSleep() {
        int hunger = person.getHunger();
        int happiness = person.getHappiness();

        person.goSleep();

        Assert.assertEquals(person.getHunger(), hunger - 2);

        if (happiness >= 70)
            Assert.assertEquals(person.getHappiness(), happiness - 5);
        else
            Assert.assertEquals(person.getHappiness(), happiness + 1);
    }

    @Test
    public void actionCheckWalkWithFriends() {
        int happiness = person.getHappiness();
        int money = person.getMoney();
        int health = person.getHealth();

        person.walkWithFriends();

        Assert.assertEquals(person.getHappiness(), happiness + 30);
        Assert.assertEquals(person.getMoney(), money - 50);
        Assert.assertEquals(person.getHealth(), health - 2);
    }

    @Test
    public void actionCheckGoWork() {
        int happiness = person.getHappiness();
        int hunger = person.getHunger();
        int money = person.getMoney();
        int health = person.getHealth();

        person.goWork();

        Assert.assertEquals(person.getHappiness(), happiness - 10);
        Assert.assertEquals(person.getHunger(), hunger - 2);
        Assert.assertEquals(person.getHealth(), health - 1);
        Assert.assertEquals(person.getMoney(), money + 10);
    }

    @Test
    public void actionCheckGoHospital() {
        int happiness = person.getHappiness();
        int hunger = person.getHunger();
        int money = person.getMoney();
        int health = person.getHealth();

        person.goHospital();

        if (health <= 70)
            Assert.assertEquals(person.getHealth(), health + 30);
        else
            Assert.assertEquals(person.getHealth(), 100);
        Assert.assertEquals(person.getMoney(), money - 25);
        Assert.assertEquals(person.getHappiness(), happiness - 10);
        Assert.assertEquals(person.getHunger(), hunger - 1);
    }

    @Test
    public void actionCheckWatchNetflix() {
        int happiness = person.getHappiness();

        person.watchNetflix();

        if (happiness <= 85)
            Assert.assertEquals(person.getHappiness(), happiness + 15);
        else
            Assert.assertEquals(person.getHappiness(), 100);
    }

    @Test
    public void actionCheckSteps() {
        int step = 1;
        int start = person.getSteps();

        for (int i = 0; i < step; i++)
            person.addStep();
        Assert.assertEquals(person.getSteps(), start + step);

        step = 1000;
        start = person.getSteps();

        for (int i = 0; i < step; i++)
            person.addStep();
        Assert.assertEquals(person.getSteps(), start + step);
    }

    @Test
    public void CheckAliveParameterMoney() {
        person.setMoney(100);
        Assert.assertTrue(person.checkAlive());
        person.setMoney(0);
        Assert.assertTrue(person.checkAlive());
        person.setMoney(50);
        Assert.assertTrue(person.checkAlive());
        person.setMoney(-51);
        Assert.assertFalse(person.checkAlive());
        person.setMoney(-100);
        Assert.assertFalse(person.checkAlive());
    }

    @Test
    public void CheckAliveParameterHappiness() {
        person.setHappiness(100);
        Assert.assertTrue(person.checkAlive());
        person.setHappiness(55);
        Assert.assertTrue(person.checkAlive());
        person.setHappiness(1);
        Assert.assertTrue(person.checkAlive());
        person.setHappiness(0);
        Assert.assertFalse(person.checkAlive());
        person.setHappiness(-10);
        Assert.assertFalse(person.checkAlive());
    }

    @Test
    public void CheckAliveParameterHealth() {
        person.setHealth(100);
        Assert.assertTrue(person.checkAlive());
        person.setHealth(55);
        Assert.assertTrue(person.checkAlive());
        person.setHealth(1);
        Assert.assertTrue(person.checkAlive());
        person.setHealth(0);
        Assert.assertFalse(person.checkAlive());
        person.setHealth(-10);
        Assert.assertFalse(person.checkAlive());
    }

    @Test
    public void CheckAliveParameterHunger() {
        person.setHunger(5);
        Assert.assertTrue(person.checkAlive());
        person.setHunger(10);
        Assert.assertTrue(person.checkAlive());
        person.setHunger(1);
        Assert.assertTrue(person.checkAlive());
        person.setHunger(0);
        Assert.assertFalse(person.checkAlive());
        person.setHunger(-10);
        Assert.assertFalse(person.checkAlive());
    }

}
