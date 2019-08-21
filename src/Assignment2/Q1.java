package Assignment2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    Triangle t = new Triangle(input.nextDouble(), input.nextDouble(),
	    	      input.nextDouble());
	    
	    System.out.print("Enter a color: ");
	    t.setColor(input.next());
	    
	    System.out.print("Is it filled ? \n 1 is true\n ");
	    boolean isFilled = input.nextBoolean();

	    System.out.println("area: " + t.getArea());
	    System.out.println("perimeter: " + t.getPerimeter());
	    System.out.println("color: " + t.getColor());
	    System.out.println("filled: " + t.isFilled());
	}

}

 class Triangle extends GeometricObject {
	  private double side1, side2, side3;

	  public Triangle() {
	    this(1.0, 1.0, 1.0);
	  }

	  public Triangle(double side1, double side2, double side3) {
	    this.side1 = side1;
	    this.side2 = side2;
	    this.side3 = side3;
	  }

	  public double getArea() {
		//   double s = (side1 + side2 + side3) + (-side1 + side2 + side3) +
		  //  		(side1 - side2 + side3) + (side1 + side2 - side3);
		   
	    double s = (side1 + side2 + side3) / 2.0;
	    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	  }

	  public double getPerimeter() {
	    return side1 + side2 + side3;
	  }

	  public double getSide1() {
	    return side1;
	  }

	  public double getSide2() {
	    return side2;
	  }

	  public double getSide3() {
	    return side3;
	  }

	  @Override
	  public String toString() {
	    return "Triangle: side1 = " + side1 + " side2 = " + side2 +
	      " side3 = " + side3;
	  }
	}