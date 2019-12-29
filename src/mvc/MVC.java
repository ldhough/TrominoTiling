package mvc;

/**
* 
* This program tiles a board of 2^n size with trominoes (L-shaped square things).
* 
* @author Lannie Dalton Hough III
* Due Date: 4/8/19 1:30 PM
*
*/

public class MVC {

	private Controller myController;
	
	public static void main(String[] args) {
		/*Model m = new Model(8, 2, 3);
		m.tile();
		m.print();*/
		
		new MVC();
	}
	
	public MVC() {
		setController(new Controller());
	}
	
	public void setController(Controller controller) {
		myController = controller;
	}
	
	public Controller getController() {
		return myController;
	}

}
