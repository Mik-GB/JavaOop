package Lectures1.CW.Ex2;
//Создайте систему управления банковскими счетами, где каждый счёт имеет свой номер, владельца и баланс.
//
//        У него должны быть:
//        - Аккаунт (включает в себя номер Аккаунта, имя владельца, баланс)
//        - Унаследованные от аккаунта счета(аккаунты) (сберегательный, кредитный)
//        - Main - класс, который и будет являться системой управления счетами.
//        - реализовать методы:
//        - deposit(amount) - метод для добавления денежных средств на счет. Принимает один аргумент - сумму депозита.
//        - withdraw(amount) - метод для снятия денежных средств со счета. Принимает один аргумент - сумму снятия.
//        (Выше реализованы представлены сигнатуры общих методов)
//
//        Для сберегательного счёта:
//        - addInterest() - метод для добавления процентов к балансу. Рассчитывает процентную ставку от текущего баланса и добавляет полученную сумму к балансу.
//
//        Для кредитного счёта:
//        - calculate_interest() - метод для расчета процентов по кредиту. Должен рассчитывать процентную ставку от текущего баланса и вычитать полученную сумму из баланса. Если баланс отрицательный, то проценты начисляются на отрицательный баланс.

public class Main {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount(1, "Mike", 10000.0, 3.5);
        SavingAccount savingAccount = new SavingAccount(2, "Andr", 10000.0, 3.5);
        System.out.println("creditAccount.getBalance() = " + creditAccount.getBalance());
        creditAccount.calculateInterest();
        System.out.println("creditAccount.getBalance() = " + creditAccount.getBalance());
        System.out.println("savingAccount.getBalance() = " + savingAccount.getBalance());
        savingAccount.addInterest();
        System.out.println("savingAccount.getBalance() = " + savingAccount.getBalance());
    }
}
