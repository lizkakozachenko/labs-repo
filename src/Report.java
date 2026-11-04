public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчёт о зарплатах");
        for (Employee emp : employees) {
            System.out.printf("%-15s | %10.2f byn.%n",
                    emp.fullname, emp.salary);
        }
    }
}