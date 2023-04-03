package simple.robot;
import java.awt.MouseInfo;
import java.awt.Point;
/**
 * This is a template class and can be used to start a new processing Library.
 * Make sure you rename this class as well as the name of the example package 'template' 
 * to your own Library naming convention.
 * 
 * (the tag example followed by the name of an example included in folder 'examples' will
 * automatically include the example in the javadoc.)
 *
 * @example Hello 
 */

public class SimpleRobot {
	Point cursorLocation = MouseInfo.getPointerInfo().getLocation();

	int myVariable = 0;
	
	public final static String VERSION = "1.0.0";
	

	/**
	 * a Constructor, usually called in the setup() method in your sketch to
	 * initialize and start the Library.
	 * 
	 * @example Hello
	 * @param theParent the parent PApplet
	 */
	
	
	private void welcome() {
		System.out.println("Simple Robot commands 1.0.0 by Jhkdk https://github.com/JJJJJJJJJJJJJJJJJJJhekd");
	}
	public int mousePos(char xory) {
		if(xory == 'x') {
		return cursorLocation.x;
		}else{
		return cursorLocation.y;}
	}
	
	
	public String sayHello() {
		return "hello library.";
	}
	/**
	 * return the version of the Library.
	 * 
	 * @return String
	 */
	public static String version() {
		return VERSION;
	}

	/**
	 * 
	 * @param theA the width of test
	 * @param theB the height of test
	 */
	public void setVariable(int theA, int theB) {
		myVariable = theA + theB;
	}

	/**
	 * 
	 * @return int
	 */
	public int getVariable() {
		return myVariable;
	}
}

