//1. Вычислить n-ое треугольного число (сумма чисел от 1 до n)
//2. Вычислить n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();

        int sumN = 0;
        int multiN = 1;

        for (int i = 1; i <= n; i++) {
            sumN = sumN + i;
            multiN = multiN * i;
        }
        System.out.println("Сумма чисел равна: " + sumN);
        System.out.println("Произведение чисел равна: " + multiN);
    }
}