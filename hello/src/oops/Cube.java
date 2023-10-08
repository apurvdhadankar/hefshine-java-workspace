package oops;

import java.util.Scanner;

public class Cube {
	static int height, width, depth;
	void volumeOfCube() {
		int volume = height*width*depth;
		System.out.println("Volume of Cube is "+volume);
	}

	public static void main(String[] args) {
		Cube v1 = new Cube();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter l,w, depth");
		height = sc.nextInt();
		width = sc.nextInt();
		depth = sc.nextInt();
		v1.volumeOfCube();

	}

}
