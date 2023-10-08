package methodPre;

import java.util.Scanner;

public class Room {
	int length, width, height, area;
	float fcost;
	Scanner sc = new Scanner(System.in);
	public Room(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	float whiteWashingArea()
	{
		area=2*(length*height)+(length*width);
		return area; 		
	}
	int whiteWashingCost()
	{
		float cost = (float)(area*0.80);
		return (int)cost;
	}
	int flooringCost()
	{
		float farea = length*width;
		
		System.out.println("Enter Flooring type geometric"+ " cement");
		String flooring = sc.next();
		if(flooring.equals("geometric"))
		{
			fcost = farea*200;
		}
		else
		{
			fcost = farea*100;
		}
		return (int)fcost;
	}
	public static void main(String[] args) {
		Room  r1 =  new Room(10, 20, 30);
		System.out.println("Area "+r1.whiteWashingArea());
		System.out.println("White washing cost "+r1.whiteWashingArea());
		System.out.println("Fcost "+r1.flooringCost());
	}

}
