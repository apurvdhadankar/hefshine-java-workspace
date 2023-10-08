package oops;

import java.util.Scanner;

public class Room {
	double l,w,h, area, cost, wwt, fwst;
	Room(int l, int w, int h){
		this.l=l;
		this.w=w;
		this.h=h;
	}
	double whiteWashingArea() {
//		int area = 2*(l+h)*(l+w);
		area = 2*h*(l+w);
		return area;
	
	}
	int whiteWashingCost() {
		cost = (float)(area*0.80);
		return (int)cost;
		
	}
	int flooringCost() {
		double farea=l*w;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Flooring type geometric or Centimeter");
		String flooring = sc.next();
		if(flooring.equals("geometric"))
			fwst = farea*200;
		else
			fwst = farea*100;
		return (int)fwst;
	}

	public static void main(String[] args) {
		
		Room r1 = new Room(10, 20, 30);
		System.out.println("area ="+r1.whiteWashingArea());
		System.out.println("White Washing Area= "+ r1.whiteWashingCost());
		System.out.println("Flooring Cost= "+r1.flooringCost());
	}

}
