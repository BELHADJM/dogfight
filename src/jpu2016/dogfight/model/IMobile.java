package jpu2016.dogfight.model;

public interface IMobile  
{
	//precisions des methodes pour l'interfaces
  public  void getDirection();
  
  public  void SetDirection();
  
  public  void getPosition();
  
  public  void getDimension();
  
  public  void getWidth();
  
  public  void getHeight();
  
  public  void getSpeed();
  
  public  void getImage();
  
  public  void move();
  
  public  void placeInArea();
  
  public  boolean isplayer();
  
  public  void setDogfightModel();
  
  public  boolean hit();
  
  public  boolean isWeapon();
  
  
}
