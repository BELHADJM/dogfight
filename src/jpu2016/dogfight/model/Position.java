package jpu2016.dogfight.model;

public class Position 
{
  private double x ;
  private double y ;  //declaration des variables
  private double maxX;
  private double maxY;
  
  
  
  
  
  public double getX() {  
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
public double getMaxX() {
	return maxX;
}
protected void setMaxX(double maxX) {
	this.maxX = maxX;
}
public double getMaxY() {
	return maxY;
}
protected void setMaxY(double maxY) {
	this.maxY = maxY;
}

 public Position(Position position)
{
	
}

 public Position(double x, double y, double maxX, double maxY) { //constructeur position
	super();
	this.x = x;
	this.y = y;
	this.maxX = maxX;
	this.maxY = maxY;
}




}
