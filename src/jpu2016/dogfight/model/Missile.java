package jpu2016.dogfight.model;

public class Missile extends Mobile
{
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 100;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";  //variables de classes
	private int distanceTraveled = 0;
	
	public Missile(int distanceTraveled){ // constructeur
	}
	
		
	
	public void Missile(Direction direction, Dimension dimension)
	{
		
	}
	
	public static int getWidthWithADirection(Direction direction)
	{
		return WIDTH;
	}
	
	public static int getHeightWithADirection(Direction direction)
	{
		return HEIGHT;
	}
	
	public void move()
	{
		
	}
	
	public boolean isweapon()
	{
		return false;
		
	}
	
	//methodes vides cr�e
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		

