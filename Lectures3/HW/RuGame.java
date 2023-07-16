package Lectures3.HW;

import lombok.extern.java.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RuGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (char i = 'а'; i <= 'я'; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }

    @Override
    void playGame(LogGame log) throws IOException {
        Scanner scanner = new Scanner(System.in);
        RuGame ruGame = new RuGame();
        System.out.println("Введите длину слова: ");
        int sizeWord = scanner.nextInt();
        System.out.println("Введите количество попыток: ");
        int maxTry = scanner.nextInt();
        scanner.nextLine();
        ruGame.start(sizeWord, maxTry);
        while (ruGame.getGameStatus().equals(GameStatus.START)) {
            System.out.println("Введите ваш вариант: ");
            String value = scanner.nextLine().toLowerCase();
            Answer answer = ruGame.inputValue(value);
            log.addLogMove(value);
            if (answer != null) {
                System.out.println("Вы нашли: быки: " + answer.bull + " коровы: " + answer.cow + ". Количество попыток: " + answer.numTry);
            }
        }
    }
}
