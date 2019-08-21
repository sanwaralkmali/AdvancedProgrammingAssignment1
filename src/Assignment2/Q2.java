package Assignment2;

import java.util.Date;

public class Q2 {

	public static void main(String[] args) {
	    Person person = new Person("Salah", "", "", "");
	    Student student = new Student("Salah", "", "","", Student.FRESHMAN);
	    Employee employee = new Employee("Salah", "", "", "", "", 5000);
	    Faculty faculty = new Faculty("Salah", "", "", "", "", 5000 , "", "");
	    Staff staff = new Staff("", "", "", "", "", 5000, "");

	    System.out.println(person);
	    System.out.println(student);
	    System.out.println(employee);
	    System.out.println(faculty);
	    System.out.println(staff);
	}

}

class Person {
	  private String name, address, phoneNumber, emailAddress;

	  public Person(String name, String address, String phoneNumber,
	    String emailAddress) {
	    this.name = name;
	    this.address = address;
	    this.phoneNumber = phoneNumber;
	    this.emailAddress = emailAddress;
	  }

	  public String getName() {
	    return name;
	  }

	  public String getAddress() {
	    return address;
	  }

	  public String getPhoneNumber() {
	    return phoneNumber;
	  }

	  public String getEmailAddress() {
	    return emailAddress;
	  }

	  // overrides
	  @Override
	  public String toString() {
	    return "class: Person\nname: " + getName();
	  }
	}

class Employee extends Person {
	  private String office;
	  private double salary;
	  private Date dateHired;

	  public Employee(String name, String address, String phoneNumber,
	    String emailAddress, String office, double salary) {
	    super(name, address, phoneNumber, emailAddress);
	    this.office = office;
	    this.salary = salary;
	    dateHired = new Date();
	  }

	  public String getOffice() {
	    return office;
	  }

	  public double getSalary() {
	    return salary;
	  }

	  public Date getDateHired() {
	    return dateHired;
	  }

	  @Override
	  public String toString() {
	    return "class: Employee\nname: " + getName();
	  }
	}

 class Student extends Person {
	  public static final int FRESHMAN = 0;
	  public static final int SOPHOMORE = 1;
	  public static final int JUNIOR = 2;
	  public static final int SENIOR = 3;

	  private int classStatus;

	  public Student(String name, String address, String phoneNumber,
	    String emailAddress, int classStatus) {
	    super(name, address, phoneNumber, emailAddress);
	    this.classStatus = classStatus;
	  }

	  public int getClassStatus() {
	    return classStatus;
	  }

	  @Override
	  public String toString() {
	    return "class: Student\nname: " + getName();
	  }
	}
 
 class Faculty extends Employee {
	  private String officeHours;
	  private String rank;

	  public Faculty(String name, String address, String phoneNumber,
	    String emailAddress, String office, double salary, String officeHours,
	    String rank) {
	    super(name, address, phoneNumber, emailAddress, office, salary);
	    this.officeHours = officeHours;
	    this.rank = rank;
	  }

	  public String getOfficeHours() {
	    return officeHours;
	  }

	  public String getRank() {
	    return rank;
	  }

	  @Override
	  public String toString() {
	    return "class: Faculty\nname: " + getName();
	  }
	}
 
 class Staff extends Employee {
	  private String title;

	  public Staff(String name, String address, String phoneNumber,
	    String emailAddress, String office, double salary, String title) {
	    super(name, address, phoneNumber, emailAddress, office, salary);
	    this.title = title;
	  }

	  public String getTitle() {
	    return title;
	  }

	  @Override
	  public String toString() {
	    return "class: Staff\nname: " + getName();
	  }
	}