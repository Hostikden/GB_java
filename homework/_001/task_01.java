// Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)
// 1 + 2 + 3 1*2*3

package homework._001;

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in, "cp866");
        System.out.println("Введите число: ");
        int userNumber = Number.nextInt();
        int sum = 0;
        int fak = 1;
        for (int i = 1; i <= userNumber; i++) {
            sum += i;
            fak *= i;
        }
        System.out.printf("Сумма - %d; Факториал - %d", sum, fak);
        Number.close();
    }
}
