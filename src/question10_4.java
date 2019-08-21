
public class question10_4 {

	public static void main(String[] args) {


		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);

		System.out.println("The distance between (" 
			+ point1.getX() + ", " + point1.getY() + ") and ("
			+ point2.getX() + ", " + point2.getY() + ") is: " + 
			point1.distance(point2));
	}

}

class MyPoint {
	private double x;
	private double y;

	MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

   public double distance(MyPoint myPoint) {
   	return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + 
   			 Math.pow(myPoint.getY() - y, 2));
   }


 	public double distance(double x, double y) {
 		return distance(new MyPoint(x, y));
 	}
}