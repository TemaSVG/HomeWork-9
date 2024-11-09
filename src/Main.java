import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.print("Задача 1\n");
        int[] monthlyPayments = {200, 240, 310, 100, 470};
        int total = 0;
        for (int i = 0; i < monthlyPayments.length; i++) {
            total += monthlyPayments[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей.\n", total);

        System.out.print("Задача 2\n");
        int maxCost = monthlyPayments[0];
        int minCost = monthlyPayments[0];
        for (final int current : monthlyPayments) {
            maxCost = maxCost < current ? current : maxCost;
            minCost = minCost > current ? current : minCost;
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей.\n", minCost, maxCost);

        System.out.print("Задание 3\n");
        double countWeeks = 5;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", (total / countWeeks));

        System.out.print("Задание 4\n");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
//        for (int i = 0; i < reverseFullName.length / 2; i++) {
//            char temp = reverseFullName[i];
//            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
//            reverseFullName[reverseFullName.length - i - 1] = temp;
//        }
//        System.out.println(Arrays.toString(reverseFullName));
    }
}