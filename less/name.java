package less;

import java.util.Scanner;

public class name {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите имя пользователя: ");
        String name = sc.nextLine();
        System.out.println("Привет, " + name); 
    }

}
