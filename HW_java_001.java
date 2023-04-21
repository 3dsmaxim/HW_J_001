import java.util.Scanner;

public class HW_java_001 {

    public static int MultiNumber(int num) {// к 2. Вычислить n! (произведение чисел от 1 до n)
        int result = 1;
        if (num == 0) {
            result = 0;
        }
        if (num == 1) {
            result = 1;
        }
        if (num > 1) {
            for (int index = 1; index <= num; index++) {
                result = result * index;
            }
        }

        return result;

    }

    public static void PrimeNumber() {// к 3. Вывести все простые числа от 1 до 1000 (числа, которые делятся только на
                                      // 1 и на себя без остатка)
        int k = 0;
        for (int i = 1; i < 1001; i++) {
            if (i < 30) {

                switch (i) {
                    case 1:
                        break;
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                    case 11:
                    case 13:
                    case 17:
                    case 19:
                    case 23:
                    case 29:
                        System.out.print(i + "  ");
                        k++;
                        break;

                    default:
                        break;
                }
            } else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 &&
                    i % 11 != 0 && i % 13 != 0 && i % 17 != 0 && i % 19 != 0 && i % 23 != 0 && i % 29 != 0
                    && i != (int) Math.sqrt(i) * (int) Math.sqrt(i)) {

                System.out.print(i + "  ");
                k++;
            }

            if (k == 21) {
                System.out.println();
                k = 0;
            }
        }

    }

    private static void OperationNumbers(Double a, Double b, String oper) {
        char op = oper.charAt(0);
        if (op == '+') {
            System.out.println((int) (double) a + " + " + (int) (double) b + " = " + (int) (a + b));
        }
        if (op == '-') {
            System.out.println((int) (double) a + " - " + (int) (double) b + " = " + (int) (a - b));
        }
        if (op == '*') {
            System.out.println((int) (double) a + " * " + (int) (double) b + " = " + (int) (a * b));
        }
        if (op == '/') {
            System.out.println((int) (double) a + " / " + (int) (double) b + " = " + (a / b));
        }

    }

    public static void main(String[] args) {

        // 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n)

        Scanner scanEnter = new Scanner(System.in);
        System.out.print("Введите число, чтобы получить теругольное число: ");
        int number = scanEnter.nextInt();

        double result = (number * 0.5) * (number + 1);
        System.out.println("Теугольное число " + number + " = " + (int) result);

        // 2. Вычислить n! (произведение чисел от 1 до n)
        System.out.println();
        System.out.print(
                "Введите положительное целое число, \nчтобы получить результат пеемноженных чисел до ввседенного числа: ");
        int numberTwo = scanEnter.nextInt();
        System.out.println("Перемножение всех чисел до числа " + numberTwo + " = " + MultiNumber(numberTwo));

        // 3. Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1
        // и на себя без остатка)
        PrimeNumber();

        // 4. Реализовать простой калькулятор (введите первое число, введите второе
        // число,
        // введите требуемую операцию, ответ)
        System.out.println();
        System.out.println();

        System.out.print("Введите первое слагаемое: ");
        double numberFirst = scanEnter.nextInt();
        System.out.println();

        System.out.print("Введите второе слагаемое: ");
        double numberSecond = scanEnter.nextInt();
        System.out.println();

        System.out.print("Введите знак действия: ");
        String charOperation = scanEnter.next();

        OperationNumbers(numberFirst, numberSecond, charOperation);

    }

}