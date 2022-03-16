public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Elif Keleş",2900,45,2021);
        Employee emp2 = new Employee("Ayşe Keleş Mandıralı ", 900,12,2010);
        Employee emp3 = new Employee("Fatih Mandıralı ", 4000,50,2000);

        emp.ToString();
        System.out.println("tax: " + emp.tax());
        System.out.println("Bonus: " + emp.bonus());
        System.out.println("Raise Salary: " + emp.raiseSalary());
        emp.ToString();

        System.out.println("tax: " + emp2.tax());
        System.out.println("Bonus: " + emp2.bonus());
        System.out.println("Raise Salary: " + emp2.raiseSalary());
        emp2.ToString();

        System.out.println("tax: " + emp3.tax());
        System.out.println("Bonus: " + emp3.bonus());
        System.out.println("Raise Salary: " + emp3.raiseSalary());
        emp3.ToString();
    }
}
