package ru.Eltex;

public class Game {
    public void start(Person player) {
        myRandom random = new myRandom();
        while (player.checkAlive()) {
            switch (random.getNumber()) {
                case (1):
                    System.out.println("I go to the cinema");
                    player.goCinema();
                    break;
                case (2):
                    System.out.println("I eat in a restaurant");
                    player.goRestaurant();
                    break;
                case (3):
                    System.out.println("I sleep");
                    player.goSleep();
                    break;
                case (4):
                    System.out.println("I walk with friends");
                    player.walkWithFriends();
                    break;
                case (5):
                    System.out.println("I work");
                    player.goWork();
                    break;
                case (6):
                    System.out.println("I am being treated.");
                    player.goHospital();
                    break;
                case (7):
                    System.out.println("I watch Netflix");
                    player.watchNetflix();
                    break;
            }
            player.conditionPerson();

        }
        System.out.println("Your player id dead");
    }
}
