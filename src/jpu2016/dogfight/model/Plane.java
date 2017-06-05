package jpu2016.dogfight.model;

import com.sun.javafx.scene.traversal.Direction;

public class Plane extends Mobile
{

 private static int SPEED = 2;
 private static int WIDTH = 100; //declaration des variables de classe
 private static int HEIGHT = 30;
 private int player;
 
 
public Plane(int player, Direction direction, Position position, String image ) { //constructeur
	super();
	this.player = player;
	
}


 public boolean isPlayer(int player)
 {
	return false;
	 
 }

 public boolean hit()
 {
	 return false;
 }

}

