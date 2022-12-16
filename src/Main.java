import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int maxMoney = -1;
        int minMoney = 200000;
        for (final int current : arr) {
            if (current > maxMoney) {
                maxMoney = current;
            }
            if (current < minMoney) {
                minMoney = current;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальная сумма трат за день составила " + minMoney + " рублей. Максимальная сумма трат за день составила " + maxMoney + " рублей");
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println(" Средняя сумма трат за месяц составила " + sum / arr.length + " рублей");
    }

    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);

        }
    }
}




