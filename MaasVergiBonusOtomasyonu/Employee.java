public class Employee {

    public String name;
    public double salary;
    public int workHours, hireYear;

    Employee(int hireYear, int workHours, double salary, String name) {
        this.hireYear = hireYear;
        this.workHours = workHours;
        this.salary = salary;
        this.name = name;
    }

    public double taxCal() {

        if (this.salary <= 1000)
            return 0.0;
        else {
            return (this.salary * 0.03);

        }
    }

    public double bonusCal() {
        if (this.workHours == 40 || this.workHours < 40)
            return 0.0;


        else
            return (30 * (this.workHours - 40));

    }

    public double increaseCal() {
        int workDate = 2023 - this.hireYear;

        if (workDate < 10) {
            return (this.salary * 0.05);
        } else if (workDate > 10 && workDate < 20) {
            return (this.salary * 0.10);
        } else
            return (this.salary * 0.15);

    }

    public void calcuate(Employee mac) {
        System.out.println("Tax :" + mac.taxCal());
        System.out.println("Bonus :" + mac.bonusCal());
        System.out.println("Raise of Salary :" + mac.increaseCal());
        System.out.println("Salary with tax and bonus :" + (mac.salary - mac.taxCal()+ mac.bonusCal()) );
        System.out.println("Total Salary with the raise of salary :" + (mac.salary + mac.increaseCal()));



    }
}









