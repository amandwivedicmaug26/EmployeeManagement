

public class MainProgram {


static Manager manager[] = new Manager[10];
static Engineer engineer[] = new Engineer[10];
static Sales sales[] = new Sales[10];

static int managerCount = 0;
static int engineerCount = 0;
static int salesCount = 0;


public static void main(String args[]) {

    int choice;

    do {

        System.out.println("\n==============================");
        System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("==============================");

        System.out.println("1. Manager");
        System.out.println("2. Engineer");
        System.out.println("3. Sales");
        System.out.println("4. Exit");

        System.out.print("Enter your choice : ");

        choice = ConsoleInput.getInt();


        switch(choice) {

            case 1:
                managerMenu();
                break;

            case 2:
                engineerMenu();
                break;

            case 3:
                salesMenu();
                break;

            case 4:
                System.out.println("Program Closed!");
                break;

            default:
                System.out.println("Invalid Choice!");

        }

    } while(choice != 4);

}


// =================================
// MANAGER MENU
// =================================

static void managerMenu() {

    int choice;

    do {

        System.out.println("\n----- MANAGER MENU -----");

        System.out.println("1. Add");
        System.out.println("2. Display");
        System.out.println("3. Sort");
        System.out.println("4. Exit");

        System.out.print("Enter your choice : ");

        choice = ConsoleInput.getInt();


        switch(choice) {

            case 1:
                addManager();
                break;

            case 2:
                displayManager();
                break;

            case 3:
                sortManager();
                break;

            case 4:
                System.out.println("Returning to Main Menu...");
                break;

            default:
                System.out.println("Invalid Choice!");

        }

    } while(choice != 4);

}


// ADD MANAGER

static void addManager() {

    System.out.println("\nEnter Manager Details");

    System.out.print("Name : ");
    String name = ConsoleInput.getstring();

    System.out.print("Address : ");
    String address = ConsoleInput.getstring();

    System.out.print("Age : ");
    int age = ConsoleInput.getInt();

    System.out.print("Gender : ");
    String gender = ConsoleInput.getstring();

    System.out.print("Basic Salary : ");
    double salary = ConsoleInput.getDouble();

    System.out.print("HRA : ");
    double hra = ConsoleInput.getDouble();


    manager[managerCount] =
            new Manager(name, address, age,
                    gender, salary, hra);

    managerCount++;

    System.out.println("Manager Added Successfully!");

}


// DISPLAY MANAGER

static void displayManager() {

    if(managerCount == 0) {

        System.out.println("No Manager Found!");

    }

    else {

        for(int i = 0; i < managerCount; i++) {

            manager[i].display();

        }

    }

}


// SORT MANAGER BY NAME

static void sortManager() {

    Manager temp;

    for(int i = 0; i < managerCount - 1; i++) {

        for(int j = i + 1;
            j < managerCount; j++) {

            if(manager[i].name.compareTo(
                    manager[j].name) > 0) {

                temp = manager[i];

                manager[i] = manager[j];

                manager[j] = temp;

            }

        }

    }

    System.out.println(
            "Manager Sorted Successfully!");

}


// =================================
// ENGINEER MENU
// =================================

static void engineerMenu() {

    int choice;

    do {

        System.out.println("\n----- ENGINEER MENU -----");

        System.out.println("1. Add");
        System.out.println("2. Display");
        System.out.println("3. Sort");
        System.out.println("4. Exit");

        System.out.print("Enter your choice : ");

        choice = ConsoleInput.getInt();


        switch(choice) {

            case 1:
                addEngineer();
                break;

            case 2:
                displayEngineer();
                break;

            case 3:
                sortEngineer();
                break;

            case 4:
                System.out.println(
                        "Returning to Main Menu...");
                break;

            default:
                System.out.println("Invalid Choice!");

        }

    } while(choice != 4);

}


// ADD ENGINEER

static void addEngineer() {

    System.out.println("\nEnter Engineer Details");

    System.out.print("Name : ");
    String name = ConsoleInput.getstring();

    System.out.print("Address : ");
    String address = ConsoleInput.getstring();

    System.out.print("Age : ");
    int age = ConsoleInput.getInt();

    System.out.print("Gender : ");
    String gender = ConsoleInput.getstring();

    System.out.print("Basic Salary : ");
    double salary = ConsoleInput.getDouble();

    System.out.print("Overtime : ");
    double overtime = ConsoleInput.getDouble();


    engineer[engineerCount] =
            new Engineer(name, address, age,
                    gender, salary, overtime);

    engineerCount++;

    System.out.println(
            "Engineer Added Successfully!");

}


// DISPLAY ENGINEER

static void displayEngineer() {

    if(engineerCount == 0) {

        System.out.println("No Engineer Found!");

    }

    else {

        for(int i = 0;
            i < engineerCount; i++) {

            engineer[i].display();

        }

    }

}


// SORT ENGINEER

static void sortEngineer() {

    Engineer temp;

    for(int i = 0; i < engineerCount - 1; i++) {

        for(int j = i + 1;
            j < engineerCount; j++) {

            if(engineer[i].name.compareTo(
                    engineer[j].name) > 0) {

                temp = engineer[i];

                engineer[i] = engineer[j];

                engineer[j] = temp;

            }

        }

    }

    System.out.println(
            "Engineer Sorted Successfully!");

}


// =================================
// SALES MENU
// =================================

static void salesMenu() {

    int choice;

    do {

        System.out.println(
                "\n----- SALES MENU -----");

        System.out.println("1. Add");
        System.out.println("2. Display");
        System.out.println("3. Sort");
        System.out.println("4. Exit");

        System.out.print("Enter your choice : ");

        choice = ConsoleInput.getInt();


        switch(choice) {

            case 1:
                addSales();
                break;

            case 2:
                displaySales();
                break;

            case 3:
                sortSales();
                break;

            case 4:
                System.out.println(
                        "Returning to Main Menu...");
                break;

            default:
                System.out.println("Invalid Choice!");

        }

    } while(choice != 4);

}


// ADD SALES

static void addSales() {

    System.out.println(
            "\nEnter Sales Employee Details");

    System.out.print("Name : ");
    String name = ConsoleInput.getstring();

    System.out.print("Address : ");
    String address = ConsoleInput.getstring();

    System.out.print("Age : ");
    int age = ConsoleInput.getInt();

    System.out.print("Gender : ");
    String gender = ConsoleInput.getstring();

    System.out.print("Basic Salary : ");
    double salary = ConsoleInput.getDouble();

    System.out.print("Commission : ");
    double commission =
            ConsoleInput.getDouble();


    sales[salesCount] =
            new Sales(name, address, age,
                    gender, salary, commission);

    salesCount++;

    System.out.println(
            "Sales Employee Added Successfully!");

}


// DISPLAY SALES

static void displaySales() {

    if(salesCount == 0) {

        System.out.println(
                "No Sales Employee Found!");

    }

    else {

        for(int i = 0;
            i < salesCount; i++) {

            sales[i].display();

        }

    }

}


// SORT SALES

static void sortSales() {

    Sales temp;

    for(int i = 0; i < salesCount - 1; i++) {

        for(int j = i + 1;
            j < salesCount; j++) {

            if(sales[i].name.compareTo(
                    sales[j].name) > 0) {

                temp = sales[i];

                sales[i] = sales[j];

                sales[j] = temp;

            }

        }

    }

    System.out.println(
            "Sales Employee Sorted Successfully!");

}


}
