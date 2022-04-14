public class Main {
    public static void main(String[] args) {

        int account = 100;
        System.out.println("Ваш остаток на счете: " + account);
        int replenishment = 2000;
        int total = account + replenishment;
        System.out.println("Ваша общая сумма: " + total);
        int bonus = replenishment / 100;
        int totalAmount = total + bonus;
        if (replenishment >= 1000) {
            System.out.println("Ваш баланс: " + totalAmount);
        }


    }
}
