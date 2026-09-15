

public class Sales extends Employee {

double commission;


Sales(String name, String address, int age,
      String gender, double basicSalary,
      double commission) {

    super(name, address, age, gender, basicSalary);

    this.commission = commission;

}


public void display() {

    System.out.println(
            "\n----- Sales Employee Details -----");

    displayCommonDetails();

    System.out.println(
            "Commission : " + commission);

    System.out.println(
            "Total Salary : "
            + (basicSalary + commission));

}


}
