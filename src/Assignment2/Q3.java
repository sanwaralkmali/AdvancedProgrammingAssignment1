package Assignment2;

import java.util.ArrayList;
import java.util.Date;

public class Q3 {

	public static void main(String[] args) {
		
		 ArrayList<Object> objects = new ArrayList<>();
		    objects.add(new Loan());
		    objects.add(new Circle(5));
		    objects.add(new Date().getTime());

		    for (Object o: objects) {
		      System.out.println(o);
		      System.out.println();
		    }
	}

}

class Circle extends GeometricObject {
	  private double radius;

	  public Circle() {
	  }

	  public Circle(double radius) {
	    this.radius = radius;
	  }

	  public Circle(double radius, String color, boolean filled) {
	    this.radius = radius;
	    setColor(color);
	    setFilled(filled);
	  }

	  public double getRadius() {
	    return radius;
	  }

	  public void setRadius(double radius) {
	    this.radius = radius;
	  }

	  public double getArea() {
	    return radius * radius * Math.PI;
	  }

	  public double getDiameter() {
	    return 2 * radius;
	  }

	  public double getPerimeter() {
	    return 2 * radius * Math.PI;
	  }

	  public String toString() {
	    return "The circle is created " + getDateCreated() +
	      " and the radius is " + radius;
	  }
	}

class Loan {
  private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;
  private Date loanDate;

  public Loan() {
    this(2.5, 1, 1000);
  }

  public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new Date();
  }

  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public int getNumberOfYears() {
    return numberOfYears;
  }

  public void setNumberOfYears(int numberOfYears) {
    this.numberOfYears = numberOfYears;
  }

  public double getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(double loanAmount) {
    this.loanAmount = loanAmount;
  }

  public double getMonthlyPayment() {
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate /
      (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    return monthlyPayment;
  }

  public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;
  }

  public Date getLoanDate() {
    return loanDate;
  }

  public String toString() {
    return "annual rate: " + annualInterestRate + "\n" +
           "number of years: " + numberOfYears + "\n" +
           "amount: " + loanAmount + "\n" +
           "date: " + loanDate.getTime();
  }
}