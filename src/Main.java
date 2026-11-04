import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Введите номер задания  \n");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        switch (a) {
            case 1:
                System.out.printf("Введите кол-во часов которые хотите перевести в секунды  \n");
                int n = s.nextInt();
                System.out.println(n * 3600);
                break;
            case 2:
                System.out.printf("Введите возраст от 0 до 100  \n");
                int r = s.nextInt();
                if (r < 0 || r > 100) {
                    System.out.printf("Неверный возраст. Введите возраст от 0 до 100");
                } else if (r < 13) {
                    System.out.printf("Ребенок");
                } else if (r < 18) {
                    System.out.printf("Подросток");
                } else if (r < 65) {
                    System.out.printf("Взрослый");
                } else {
                    System.out.printf("Пенсионер");
                }
                break;
            case 3:
                System.out.printf("Введите число \n");
                int b = s.nextInt();
                int count = 0;
                if(b<0){
                   // System.out.printf("Неверное число \n");
                    b=Math.abs(b);
                }
                while (b > 0) {
                    b /= 10;
                    count++;
                }
                System.out.print(count);
        }
        s.close();
    }
}