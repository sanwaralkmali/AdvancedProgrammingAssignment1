package Assignment2;

import java.util.Date;

public class GeometricObject {

	private String color;
  private boolean filled;
  private Date dateCreated;

  public GeometricObject() {
    this("white", false);
  }

  public GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
    dateCreated = new Date();
  }

  public String getColor() {
    return color;
  }

  public boolean isFilled() {
    return filled;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }
}