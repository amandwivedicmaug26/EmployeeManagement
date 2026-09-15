

public class Manager extends Employee {


double hra;


Manager(String name, String address, int age,
        String gender, double basicSalary,
        double hra) {

    super(name, address, age, gender, basicSalary);

    this.hra = hra;

}


public void display() {

    System.out.println("\n----- Manager Details -----");

    displayCommonDetails();

    System.out.println("HRA : " + hra);

    System.out.println("Total Salary : "
            + (basicSalary + hra));

}


}
