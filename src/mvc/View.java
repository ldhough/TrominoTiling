package mvc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class View /*implements ActionListener*/ extends JFrame {
	public static int myNumSquare = Model.getSizeOfBoard();
	private Can[] mySquare;
    private JPanel mySquaresPanel;
    //private ButtonListener[] mySquareListener;
    private JTextField myTextFieldX;
    private JTextField myTextFieldY;
    private JTextField mySize;
    private Controller myController;
    private Image myRedImage;
    private Image myBlueImage;
    private Image myLimeImage;
    private Image myPinkImage;
    private Image myYellowImage;
    private Image myOrangeImage;
    private Image myBlankImage;
    
    private Image mySoftGreenImage;
    private Image myDarkBlueImage;
    private Image myPurpleImage;
    private Image myGreyImage;
    private Image myBeigeImage;
    
    private Image myForestGreenImage;
    private Image myBlackImage;
    private Image mySoftPurpleImage;
    private Image myBrownImage;
    private Image myTealImage;
    private Image myGoldImage;
    private Image myMagentaImage;
    private Image mySoftOrangeImage;
    private Image myDarkBrownImage;
    private Image mySilverImage;
    
    private Image myXImage;
    private JButton myTile;
    private JButton mySetBoard;
    
    
    public View(Controller controller) {
    	double[][] value;
        int i;
        int j;
        //int k;
        //int l;
        
        JFrame frame = new JFrame("MVC Trominoes");
        
        frame.setSize(360, 380/*600*/);
        frame.setLayout(null);
        frame.setBackground(Color.gray);

        
        myRedImage = Toolkit.getDefaultToolkit().getImage("images/red.jpg");
        myBlueImage = Toolkit.getDefaultToolkit().getImage("images/blue.jpg");
        myLimeImage = Toolkit.getDefaultToolkit().getImage("images/lime.jpg");
        myPinkImage = Toolkit.getDefaultToolkit().getImage("images/pink.jpg");
        myYellowImage = Toolkit.getDefaultToolkit().getImage("images/yellow.jpg");
        myOrangeImage = Toolkit.getDefaultToolkit().getImage("images/orange.jpg");
        myBlankImage = Toolkit.getDefaultToolkit().getImage("images/blank.jpg");
        myXImage = Toolkit.getDefaultToolkit().getImage("images/pX.jpg");
        myDarkBlueImage = Toolkit.getDefaultToolkit().getImage("images/darkblue.jpg");
        myBeigeImage = Toolkit.getDefaultToolkit().getImage("images/beige.jpg");
        mySoftGreenImage = Toolkit.getDefaultToolkit().getImage("images/softgreen.jpg");
        myPurpleImage = Toolkit.getDefaultToolkit().getImage("images/purple.jpg");
        myGreyImage = Toolkit.getDefaultToolkit().getImage("images/grey.jpg");
        myForestGreenImage = Toolkit.getDefaultToolkit().getImage("images/forestgreen.jpg");
        myBlackImage = Toolkit.getDefaultToolkit().getImage("images/black.jpg");
        mySoftPurpleImage = Toolkit.getDefaultToolkit().getImage("images/softpurple.jpg");
        myBrownImage = Toolkit.getDefaultToolkit().getImage("images/brown.jpg");
        myTealImage = Toolkit.getDefaultToolkit().getImage("images/teal.jpg");
        myGoldImage = Toolkit.getDefaultToolkit().getImage("images/gold.jpg");
        myMagentaImage = Toolkit.getDefaultToolkit().getImage("images/magenta.jpg");
        mySoftOrangeImage = Toolkit.getDefaultToolkit().getImage("images/softorange.jpg");
        myDarkBrownImage = Toolkit.getDefaultToolkit().getImage("images/darkbrown.jpg");
        mySilverImage = Toolkit.getDefaultToolkit().getImage("images/silver.jpg");
        
        mySquare = new Can[myNumSquare];
        
       // mySquareListener = new ButtonListener[myNumSquare];
        mySquaresPanel = new JPanel(new GridLayout(myNumSquare, 1));
        mySquaresPanel.setSize(300, 300);
        mySquaresPanel.setLocation(20, 20);
        
        Model.tile();
        double[][] myBoard2 = Model.getMyBoard();
        for(i=0; i < myNumSquare; i++) { //Why did this work so easily? lol
        	for (j=0; j < myNumSquare; j++) {
        		mySquare[i] = new Can(myBlankImage);
        		mySquaresPanel.add(mySquare[i]);
        		//mySquaresPanel.
        		if (0 < myBoard2[i][j] && myBoard2[i][j] < .05) {
					mySquare[i].setImage(myBlueImage);
				} else if (.05 < myBoard2[i][j] && myBoard2[i][j] < .10) {
					mySquare[i].setImage(myOrangeImage);
				} else if (.10 < myBoard2[i][j] && myBoard2[i][j] < .15) {
					mySquare[i].setImage(myPinkImage);
				} else if (.15 < myBoard2[i][j] && myBoard2[i][j] < .2) {
					mySquare[i].setImage(myYellowImage);
				} else if (.2 < myBoard2[i][j] && myBoard2[i][j] < .25) {
					mySquare[i].setImage(myLimeImage);
				} else if (.25 < myBoard2[i][j] && myBoard2[i][j] < .3) {
					mySquare[i].setImage(mySoftGreenImage);
				} else if (.3 < myBoard2[i][j] && myBoard2[i][j] < .35) {
					mySquare[i].setImage(myGreyImage);
				} else if (.35 < myBoard2[i][j] && myBoard2[i][j] < .4) {
					mySquare[i].setImage(myPurpleImage);
				} else if (.4 < myBoard2[i][j] && myBoard2[i][j] < .45) {
					mySquare[i].setImage(myDarkBlueImage);
				} else if (.45 < myBoard2[i][j] && myBoard2[i][j] < .5) { //******
					mySquare[i].setImage(myForestGreenImage);
				} else if (.5 < myBoard2[i][j] && myBoard2[i][j] < .55) {
					mySquare[i].setImage(myBlackImage);
				} else if (.55 < myBoard2[i][j] && myBoard2[i][j] < .6) {
					mySquare[i].setImage(mySoftPurpleImage); //
				} else if (.6 < myBoard2[i][j] && myBoard2[i][j] < .65) {
					mySquare[i].setImage(myBrownImage);
				} else if (.65 < myBoard2[i][j] && myBoard2[i][j] < .7) {
					mySquare[i].setImage(myTealImage); //
				} else if (.7 < myBoard2[i][j] && myBoard2[i][j] < .75) {
					mySquare[i].setImage(myGoldImage);
				} else if (.75 < myBoard2[i][j] && myBoard2[i][j] < .8) {
					mySquare[i].setImage(myMagentaImage);
				} else if (.8 < myBoard2[i][j] && myBoard2[i][j] < .85) {
					mySquare[i].setImage(mySoftOrangeImage);
				} else if (.85 < myBoard2[i][j] && myBoard2[i][j] < .9) {
					mySquare[i].setImage(myDarkBrownImage); //
				} else if (.9 < myBoard2[i][j] && myBoard2[i][j] < .95) {
					mySquare[i].setImage(mySilverImage);
				} else if (.95 < myBoard2[i][j] && myBoard2[i][j] < 1) {
					mySquare[i].setImage(myBeigeImage);
				}
				
				
				
				else if (myBoard2[i][j] == 1) {
					mySquare[i].setImage(myRedImage);
				} else if (myBoard2[i][j] == -1) {
					mySquare[i].setImage(myBlankImage);
				}
        	}
        } 
        
        myController = controller;
        value = myController.getModelValue();
        
        /*
        myTile = new JButton();
        myTile.setText("Tile");
        myTile.setSize(70, 30);
        myTile.setLocation(200, 450);
        myTile.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//MVC c = new MVC();
						//Controller c = new Controller();
					}
				}
		);
        /*
        
        myTextFieldX = new JTextField();
        myTextFieldX.setText("x pos");
        myTextFieldX.setSize(80, 30);
        myTextFieldX.setLocation(20, 450);
        
        myTextFieldY = new JTextField();
        myTextFieldY.setText("y pos");
        myTextFieldY.setSize(80, 30);
        myTextFieldY.setLocation(110, 450);
        
        mySize = new JTextField();
        mySize.setText("2^n size");
        mySize.setSize(80, 30);
        mySize.setLocation(20, 400);
        
        myTile = new JButton();
        myTile.setText("Tile");
        myTile.setSize(70, 30);
        myTile.setLocation(200, 450);
        myTile.addActionListener(
				new ActionListener() {
					//private double[][] modelValue;

					public void actionPerformed(ActionEvent e) {
						int x = Integer.parseInt(myTextFieldX.getText());
						int y = Integer.parseInt(myTextFieldY.getText());
						//Model.getMyBoard;
						Controller.newModel(x, y);
						Model.tile();
						Model.print();
						
						int k;
						int l;
						
						//Model.getMyBoard();
						double[][] myBoard2 = Model.getMyBoard();
						
						for (k=0; k < myNumSquare; k++) {
							for (l = 0; l < myNumSquare; l++) {
								if (0 < myBoard2[k][l] && myBoard2[k][l] < .5) {
									mySquare[k].setImage(myBlueImage);
								} else if (.5 < myBoard2[k][l] && myBoard2[k][l] < 2) {
									mySquare[k].setImage(myOrangeImage);
								} else {
									mySquare[k].setImage(myLimeImage);
								}
							}
						}
						
						//modelValue = Controller.getModelValue();
					}
				}
		);
        
        mySetBoard = new JButton();
        mySetBoard.setText("Set Board");
        mySetBoard.setSize(160, 30);
        mySetBoard.setLocation(110, 400);
        mySetBoard.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int size = Integer.parseInt(mySize.getText());
						Model.setSizeOfBoard(size);
						//Controller.newModel(0, 0);
						int myNum = Model.getSizeOfBoard(); 
						
						mySquaresPanel.removeAll();
						mySquaresPanel.validate();
						//mySquaresPanel.paintAll(myOrangeImage);
						
						int k;
						int l;
						
						for(k=0; k < myNum; k++) { 
							mySquaresPanel.validate();
							//mySquare[i].setImage(myRedImage);
				        	for (l=0; l < myNum; l++) {
				        		mySquare[k] = new Can(myXImage);
				        		//mySquaresPanel.removeAll();
				        		//mySquaresPanel.remove(mySquare[i]);
				        		//mySquare[i] = new Can(myRedImage);
				        		/////mySquare[k].setImage(myRedImage);
				        		mySquaresPanel.add(mySquare[k]);
				        		//mySquaresPanel.revalidate();
				        		mySquaresPanel.validate();
				        		//mySquaresPanel.
				        		//mySquaresPanel.repaint();
				        		//mySquare[i].add(mySquare[i]);
				        		//mySquaresPanel.repaint(mySquare[i]);
				        		//mySquaresPanel.repaint(red);
				        	}
				        } 
						
						
						
					}
				}
		);*/

        frame.add(mySquaresPanel);
        /*
        frame.add(myTextFieldX);
        frame.add(myTextFieldY);
        frame.add(mySize);
        frame.add(mySetBoard);*/
        //frame.add(myTile);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.associateListeners();
    }


    
}
