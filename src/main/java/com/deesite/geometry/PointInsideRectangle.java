package com.deesite.geometry;

public class PointInsideRectangle {

	public static void main(String[] args) {
		// bottom-left and top-right
		// corners of rectangle
		int x1 = 0, y1 = 0, x2 = 10, y2 = 8;

		// given point
		int x = 1, y = 5;

		// function call
		if (FindPoint(x1, y1, x2, y2, x, y))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		
		
		
		FindPoint2(x1, y1, x2, y2, x, y);
	}

	// function to find if given point
	// lies inside a given rectangle or not.
	static boolean FindPoint(int x1, int y1, int x2, int y2, int x, int y) {
		if (x > x1 && x < x2 && y > y1 && y < y2)
			return true;

		return false;
	}

	
	// https://stackoverflow.com/questions/2752725/finding-whether-a-point-lies-inside-a-rectangle-or-not#:~:text=In%20any%20case%2C%20for%20any,test%20%2D%20the%20point%20is%20inside.
	static boolean FindPoint2(int x1, int y1, int x2, int y2, int x, int y) {
		int D = (x2 - x1) * (y - y1) - (x - x1) * (y2 - y1);
		System.out.println("D is: " + D);
		if (D > 0)
			return true;

		return false;
	}

}
