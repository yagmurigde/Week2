public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

    double tax() {
        double tax = 0;
        if (salary>=1000) {
            tax = salary * 0.03;
        }
        return tax;
    }

    double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int howManyYears = (2021 - hireYear);
        double raiseAmount = 0;

        if (howManyYears < 10) {
            raiseAmount = salary * 0.05;
        } else if (howManyYears > 9 && howManyYears < 20) {
            raiseAmount = salary * 0.10;
        } else {
            raiseAmount = this.salary * 0.15;
        }
        salary+= raiseAmount;

        return raiseAmount;
    }
    public String toString() {
        double salaryRaise = raiseSalary(); // Calculate salary raise and update salary
        double totalSalary = salary + bonus() - tax();
        return "Name: " + name +
                "\nSalary: " + salary +
                "\nWork Hours: " + workHours +
                "\nHire Year: " + hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary Raise: " + salaryRaise +
                "\nTotal Salary with Tax and Bonus: " + totalSalary +
                "\nTotal Salary: " + (totalSalary + bonus());
    }


}
