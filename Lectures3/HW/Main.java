package Lectures3.HW;

import java.io.IOException;
import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        NumberGame numberGame = new NumberGame();
//        Scanner scanner = new Scanner(System.in);
//        numberGame.start(scanner.nextInt(), scanner.nextInt());
//        scanner.nextLine();
//        while (!numberGame.getGameStatus().equals(GameStatus.FINISH)){
//            String value = scanner.nextLine().toString();
//            Answer answer = numberGame.inputValue(value);
//            if (answer != null){
//                System.out.println("answer = " + answer);
//            }
//        }
//
//    }
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        menu.menu();

}
}
