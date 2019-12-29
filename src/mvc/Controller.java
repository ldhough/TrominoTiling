package mvc;

import javax.swing.JOptionPane;

public class Controller {
	private View myView;
	private static Model myModel;
	
	public Controller() {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Input size (2^n): "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Input row: "));
		int z = Integer.parseInt(JOptionPane.showInputDialog("Input column: "));
		myModel = new Model(x, y, z);
		//myModel = new Model(8, 0, 0);
		myView = new View(this);//this notifies view when event takes place
	}
	
	public static void newModel(/*int x,*/ int y, int z) {
		myModel = new Model(Model.getSizeOfBoard(), y, z);
	}
	
	public double[][] getModelValue() {
		myModel.tile();
		return myModel.getMyBoard();
	}
	
}
