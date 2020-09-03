import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

private int id;
private String name;
private String department;
private double salary;



static List<Employee> employees = new ArrayList<>();
static Scanner scanner = new Scanner(System.in);

static {
employees.add(new Employee(1, "John", "IT", 20000));
employees.add(new Employee(2, "Mark", "HR", 50000));
employees.add(new Employee(3, "Glenn", "IT", 60000));
}

public static void main(String[] args) {
System.out.println("Employee Management :::" + "\n" + "Enter 1 for view all employess" + "\n"
+ "2 add new employee" + "\n" + "3 delete employee" + "\n" + "0 for Exit");
int choice = -1;
while (choice != 0) {
System.out.println("Enter choice :");
choice = scanner.nextInt();
switch (choice) {
case 1:
showEmployees();
break;
case 2:
addEmployee();
break;
case 3:
addEmployee();
break;
}
}

}

static void showEmployees() {
System.out.println("id" + "\t" + "name");
employees.forEach(emp -> {
System.out.println(emp.id + "\t" + emp.name);
});
}

static void addEmployee() {
System.out.println("Enter Emp Id:");
int id = scanner.nextInt();
System.out.println("Enter Emp name :");
String name = scanner.nextLine();
System.out.println("Enter Emp Department:");
String dept = scanner.nextLine();
System.out.println("Enter Emp Salary:");
Double salary = scanner.nextDouble();
Employee emp = new Employee(id, name, dept, salary);
employees.add(emp);
}

static void deleteEmployee(){
System.out.println("Enter Employee Id to delete :");
int id = scanner.nextInt();
employees.removeIf(emp -> emp.id == id);
}


public Employee() {
super();

}

public Employee(int id, String name, String department, double salary) {
super();
this.id = id;
this.name = name;
this.department = department;
this.salary = salary;
}

}