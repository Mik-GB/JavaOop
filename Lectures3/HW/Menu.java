package Lectures3.HW;



import java.io.IOException;
import java.util.Scanner;

public class Menu {
    void menu() throws IOException {
        LogGame logGame = new LogGame();
        logGame.addLog();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите пункт меню:\n" +
                    "1. Начать новую игру\n" +
                    "2. Посмотреть логги\n" +
                    "3. Выйти из игры\n" +
                    "");
            int menuNumber = scanner.nextInt();
            switch (menuNumber) {
                case 1 -> newGame(logGame);
                case 2 -> logGame.printLogConsole();
                case 3 -> flag = false;
            }
        }


    }

    void newGame(LogGame log) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите режим игры:\n" +
                "1. Запустить игру с цифрами\n" +
                "2. Запустить игру с Русскими буквами\n" +
                "3. Запустить игру с Английскими буквами\n" +
                "");
        int switchNumber = scanner.nextInt();
        switch (switchNumber) {
            case 1 -> {
                NumberGame ng = new NumberGame();
                ng.playGame(log);
            }
            case 2 -> {
                RuGame rg = new RuGame();
                rg.playGame(log);
            }
            case 3 -> {
                EngGame engGame = new EngGame();
                engGame.playGame(log);
            }
        }
    }
}
