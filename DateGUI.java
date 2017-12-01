
package project2;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.TextArea;

/**
 *
 * @author KINGSLEY OTTO
 */


public class DateGUI {
	static JFrame myFrame;
	static TextArea leftSide, rightSide;
        
        //SET UP THE JFRAME GUI 
	public static void initialize() {
		myFrame = new JFrame();
		myFrame.setSize(600, 600);
		myFrame.setLocation(200, 200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new GridLayout(1, 2));
		myFrame.setTitle("Dates Display");
		leftSide = new TextArea();
		rightSide = new TextArea();
		myFrame.getContentPane().add(leftSide);
		myFrame.getContentPane().add(rightSide);
	}
	
}

