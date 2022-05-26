public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int payment = 1500;
        int bonusForPayment = 100;

        if (payment > 1000) {
            System.out.println("Ваш баланс: " + ((balance + payment) + (payment / bonusForPayment)));
            System.out.println("Начислено бонусов: " + (payment / bonusForPayment));
        } else {
            System.out.println("Ваш баланс: " + (balance + payment));
            System.out.println("Начислено бонусов: 0");


        }
    }
}
