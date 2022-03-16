public class Employee {
    /*Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

    Sınıfın Nitelikleri

    name : Çalışanın adı ve soyadı
    salary : Çalışanın maaşı
    workHours : Haftalık çalışma saati
    hireYear : İşe başlangıç yılı
    Sınıfın Metotları

    Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
    tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
    bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
    toString() : Çalışana ait bilgileri ekrana bastıracaktır.
     */
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
