package ru.Eltex;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person player = new Person();
        String tempName = "";
        do {
            System.out.print("Please, input name: ");
            tempName = scanner.nextLine();
            player.setPerson(tempName);
        } while (!player.checkName(tempName));
        tempName = null;

        Game game = new Game();
        game.start(player);

    }
}
