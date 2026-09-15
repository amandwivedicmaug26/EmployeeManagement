public abstract class Employee {


String name;
String address;
int age;
String gender;
double basicSalary;


Employee(String name, String address, int age,
         String gender, double basicSalary) {

    this.name = name;
    this.address = address;
    this.age = age;
    this.gender = gender;
    this.basicSalary = basicSalary;

}


void displayCommonDetails() {

    System.out.println("Name : " + name);
    System.out.println("Address : " + address);
    System.out.println("Age : " + age);
    System.out.println("Gender : " + gender);
    System.out.println("Basic Salary : " + basicSalary);

}


public abstract void display();


}
