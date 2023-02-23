package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		
		int r = in.nextInt(); 
		int g = in.nextInt();
		int b = in.nextInt();
		Color black = new Color (r, g, b); 
		StdDraw.setPenColor(black);
		
		boolean fill = in.nextBoolean(); 
		
		double x = in.nextDouble();
		double y = in.nextDouble(); 
		double w = in.nextDouble(); 
		double h = in.nextDouble(); 
		
		if  (fill == false) {
		StdDraw.rectangle(x, y, w, h);
		} 
		else {
			StdDraw.filledRectangle(x, y, w, h);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
