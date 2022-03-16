public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        if (this.salary >= 1000) {
            return (this.salary * 3/100);
        } else {
            return 0;
        }
    }
    int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40)*30;
        } else {
            return 0;
        }
    }
    double raiseSalary(){
        if ((2022-this.hireYear) < 10) {
            return (this.salary * 5/100);
        } else if((2022-this.hireYear) >= 10 && (2022-this.hireYear) < 20) {
            return (this.salary * 10/100);
        } else {
            return (this.salary * 15/100);
        }

    }
    double netSalary(){
        return (this.salary - tax() + bonus() + raiseSalary());
    }
    void ToString() {
        System.out.println("**********-Employee Information-**********");
        System.out.println("Name Surname: " + this.name);
        System.out.println("Working Hour: " + this.workHours);
        System.out.println("Year she/he started working: " + this.hireYear);
        System.out.println("Net Salary: " + netSalary() );
        System.out.println("------------------------------------------");
    }
}
