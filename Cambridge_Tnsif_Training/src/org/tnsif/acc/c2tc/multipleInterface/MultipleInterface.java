package org.tnsif.acc.c2tc.multipleInterface;


class SmartPhone implements Camera, MusicPlayer{

	@Override
	public void playMusic() {
		System.out.println("Listening music Using SmartPhone");
		
	}

	@Override
	public void takePhoto() {
		System.out.println("Taking photo using smartphone camera");
	}
	
}
public class MultipleInterface {
	public static void main(String[]args) {
		SmartPhone smartphone= new SmartPhone();
		smartphone.playMusic();
		smartphone.takePhoto();
	}

}
