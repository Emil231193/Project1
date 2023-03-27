//4. Реализовать простой калькулятор (введите первое число, введите второе число,
// введите требуемую операцию, ответ)
import java.util.Scanner;

public class program3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        float number_1;
        float number_2;
        float answer;
        int i;
        String a;
        char sum;

        System.out.print("Введите первое число:");
        number_1 = scan.nextInt();
        System.out.print("Введите оперцию(+,-,*,/):");
        a = scan.next();
        sum = a.charAt(0);
        System.out.print("Введите второе число:");
        number_2 = scan.nextInt();
        if (sum == '+'){
            answer = number_1 + number_2;
            System.out.println("Ответ: " + answer);
        }
        else if (sum == '-'){
            answer = number_1 - number_2;
            System.out.println("Ответ: " + answer);
        }
        else if (sum == '*'){
            answer = number_1 * number_2;
            System.out.println("Ответ: " +answer);
        }
        else if (sum == '/'){
            answer = number_1 / number_2;
            System.out.println("Ответ: " + answer);
        }
        else{
            System.out.println("Неверная операция!");
        }
    }
}
