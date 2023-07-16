package Lectures3.HW;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogGame {
    private static final Logger LOGGER = Logger.getLogger(AbstractGame.class.getName());

    FileHandler fh = new FileHandler("D:\\GeekBrains\\Языки програмирования\\Java\\JavaOop\\Lectures3\\HW\\LogFile.log");

    public LogGame() throws IOException {
    }

    void addLog() {
        LOGGER.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        LOGGER.setUseParentHandlers(false);
    }

    void addLogMove(String value) {
        LOGGER.log(Level.INFO, "Пользователський ввод: " + value);
    }

    void printLogConsole() throws IOException {
        FileReader fileReader = new FileReader("D:\\GeekBrains\\Языки програмирования\\Java\\JavaOop\\Lectures3\\HW\\LogFile.log");
        BufferedReader in = new BufferedReader(fileReader);
        String line = in.readLine();
        while (line != null) {
            System.out.println(line);
            line = in.readLine();
        }
        in.close();
    }
}
