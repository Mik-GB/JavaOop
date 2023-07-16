package Lectures3.HW;

import lombok.extern.java.Log;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {

    Integer sizeWord;
    Integer maxTry;
    Integer currentTry;
    String computerWord;
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        computerWord = generateWord();
        System.out.println("computerWord = " + computerWord);
        this.gameStatus = GameStatus.START;
        this.currentTry = 0;
    }

    @Override
    public Answer inputValue(String value) {
        if (currentTry >= maxTry){
            gameStatus= GameStatus.FINISH;
            System.out.println("попытки закончены вы проиграли");
            return null;
        }
        int bull =0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if(value.charAt(i) == computerWord.charAt(i)){
                bull++;
                cow++;
            }else if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                cow++;
            }
        }
        currentTry++;
        if (sizeWord.equals(bull)){
            System.out.println("Вы победили!");
            return null;
        }
        Answer answer = new Answer(bull, cow, currentTry);
        return answer;
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    abstract List<String> generateCharList();
    private String generateWord(){
        List<String> charList = generateCharList();
        String result = "";
        //todo генерируем слова
        Random random = new Random();
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            result += charList.get(randomIndex); //result.concat(charList.get(randomIndex));
            charList.remove(randomIndex); // удаление из алфавита примененного значения (вариант игры без повторов)
        }
        return result;
    }
    abstract void playGame(Log log) throws IOException;
}
