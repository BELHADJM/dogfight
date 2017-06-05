package jpu2016.dogfight.model;

public interface IDogfightModel { //interface pour dogfightmodel

	public void getArea();
	
	public void buildArea(Dimension dimension);
	
	public void addMobile(IMobile Mobile);
	
	public void removeMobile(IMobile Mobile);
	
	public  void getMobiles();

	public void getMobileByPlayer(int player);
	
	public void setMobilesHavesMover();
	
	
}
