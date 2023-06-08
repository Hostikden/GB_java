// Реализовать простой калькулятор (+-/*)
// sc.next() - считывает 1 элемент
// sc.nextInt() - считывает только число
// sc.nextLine() - считывает строчку
// Введите число: 4 \n
// Введите знак:

package homework._001;
import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean Oper = false;
        double Res = 0;
        String Sign;
        
        System.out.print("Введите первое число: ");
        double firstNum = input.nextInt();

        System.out.print("Введите второе число: ");
        double secondNum = input.nextInt();

        while (true) {
            System.out.print("Введите арифмтический знак: ");
            switch (Sign = input.next()) {
                case "*":
                    Res = firstNum * secondNum;
                    Oper = true;
                    break;
                case "/":
                    Res = firstNum / secondNum;
                    Oper = true;
                    break;
                case "+":
                    Res = firstNum + secondNum;
                    Oper = true;
                    break;
                case "-":
                    Res = firstNum - secondNum;
                    Oper = true;
                    break;
                case "%":
                    Res = firstNum % secondNum;
                    Oper = true;
                    break;
                default:
                    System.out.println("Что-то пошло не так!");
            }
            if (Oper) break;
        }    
        System.out.printf("%d %s %d = %f", (int)firstNum, Sign, (int)secondNum, Res);
        input.close();
    }    
}
