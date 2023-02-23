package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(200, 0, 200);
		StdDraw.filledRectangle(3, 3, 3, 3);
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.setPenRadius(0.05);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.5);
		StdDraw.filledCircle(0.5, 0.5, 0.02);
	}
}
