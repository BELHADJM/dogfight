package jpu2016.dogfight.controler;

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    final DogfightModel dogfightModel = new DoggihtModel();
    final DogfightController dogfightController = new DogfightController(dogfightModel);
    final DogfightView dogfightView = new DogfightView (dogfightController, dogfightModel, dogfightModel);
    dogfightController.setViewSystem(dogfightview);
    dogfightController.paly();

}
