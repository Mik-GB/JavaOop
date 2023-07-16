package Lectures3.CW.Ex2;

public enum Fruits {
    APPLE(1), ORANGE(2), PEACH(3);
    private int numbers;

    Fruits(int numbers) {
        this.numbers = numbers;
    }

    public int getNumbers() {
        return numbers;
    }
}
