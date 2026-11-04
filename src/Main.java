import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Введите первое слово: ");
                String word1 = scanner.nextLine();

                System.out.print("Введите второе слово: ");
                String word2 = scanner.nextLine();

                if (word1.equalsIgnoreCase(word2)) {
                    System.out.println("Слова совпадают");
                } else {
                    System.out.println("Слова разные");
                }
                break;

            case 2:
                System.out.print("Введите email: ");
                String email = scanner.nextLine();

                int atIndex = email.indexOf('@');

                if (atIndex > 0) {
                    String userName = email.substring(0, atIndex);
                    System.out.println("Имя пользователя: " + userName);
                } else {
                    System.out.println("Некорректный email");
                }
                break;

            case 3:
                Employee[] employees = {
                        new Employee("Козаченко Е.С.", 105000.5),
                        new Employee("Колосович Е.А.", 62000.75),
                        new Employee("Шимонович Е.Н.", 55000.0),
                        new Employee("Пантелеенко А.С.", 78000.25),
                        new Employee("Абашин А.А.", 49000.9)
                };

                Report.generateReport(employees);
                break;


            case 4:

                String text = "abba abea abcfa abza abxa";
                String[] words = text.split(" ");

                System.out.println("Подходящие слова:");
//                for (String word : words) {
//                    if (word.length() == 4
//                            && word.startsWith("ab")
//                            && word.endsWith("a")
//                            && word.charAt(2) != 'b') {
//                        System.out.println(word);
//                    }
//                }
                for(String word : words){
                    if(word.matches("ab[^b]{2}a")){
                        System.out.println(word);
                    }
                }
                break;

            default:
                System.out.println("Неверный выбор");
        }

        scanner.close();
    }
}