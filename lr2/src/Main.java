//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание:");
        int choice = scanner.nextInt();



        switch (choice) {
            case 1:
                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0) {
                        count++;
                    }
                }

                System.out.println("Количество чётных элементов: " + count);
                break;
            case 2:
                int n = 5;
                int m = 7;
                int[][] mass = new int[n][m];

                for (int i = 0; i < mass.length; i++) {
                    for (int j = 0; j < mass[i].length; j++) {
                        if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                            mass[i][j] = 1;
                            System.out.print(mass[i][j]);
                        } else {
                            mass[i][j] = 0;
                            System.out.print(mass[i][j]);
                        }
                    }System.out.println();
                }
                break;
            default:
                System.out.println("Неверный выбор!");
        }

        scanner.close();
    }

}