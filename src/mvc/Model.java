package mvc;

public class Model {

	private static int mySizeOfBoard;
	//private int n = 1;
	static double[][] myBoard; //= new double[mySizeOfBoard][mySizeOfBoard];
	
	public static void setSizeOfBoard(int value) {
		mySizeOfBoard = value;
	}
	
	public static int getSizeOfBoard() {
		return mySizeOfBoard;
	}
	
	public static double[][] getMyBoard() {
		return myBoard;
	}
	
	public /*double[][]*/ Model(int size, int mySpecialSquareX, int mySpecialSquareY) {
		mySizeOfBoard = size; //*****
		myBoard = new double[size][size];
		//myBoard[mySpecialSquareY][mySpecialSquareX] = -1;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
					myBoard[i][j] = 0;
			}
		}
		myBoard[mySpecialSquareX][mySpecialSquareY] = -1;
		//return myBoard;
	}
	
	public static void tile() {
		tileTromino(myBoard.length, 0, 0);
	}
	
	public static void tileTromino(int n, int x, int y) {
		double trominoValue = Math.random();
		//int nSquared = (int) Math.pow(2, n);
		
		if (n == 2) { //Base case
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (myBoard[x+i][y+j] == 0) {
						myBoard[x+i][y+j] = trominoValue;
					}
				}
			}
		} else { //Recursive case
			int sX = x;
			int sY = y;
			
			for (int k = x; k < x + n; k++) { //locates missing piece
				for (int l = y; l < y + n; l++) {
					if (myBoard[k][l] != 0) {
						sX = k;
						sY = l;
					}
				}
			}
			
			if (sX < x + n/2 && /*y*/sY < /*sY*/y + n/2) { //is top left? //sY and y were wrong spot facepalm
				
				tileTromino(n/2, x, y);
				
				myBoard[x+n/2][y+n/2-1] = 1;
				myBoard[x+n/2][y+n/2] = 1;
				myBoard[x+n/2-1][y+n/2] = 1;
				
				tileTromino(n/2, x, y+n/2);
                tileTromino(n/2, x+n/2, y);
                tileTromino(n/2, x+n/2, y+n/2);
                
			} else if (sX < x + n/2 && sY >= y + n/2) { //top right
				
				tileTromino(n/2, x, y+n/2);
				
				myBoard[x+n/2][y+n/2-1] = 1;
				myBoard[x+n/2][y+n/2] = 1;
				myBoard[x+n/2-1][y+n/2-1] = 1;
				
				tileTromino(n/2, x, y);
                tileTromino(n/2, x+n/2, y);
                tileTromino(n/2, x+n/2, y+n/2);
                
			} else if (sX >= x + n/2 && sY < y + n/2) { //bottom left
				
				tileTromino(n/2, x+n/2, y);
				
				myBoard[x+n/2-1][y+n/2] = 1;
				myBoard[x+n/2][y+n/2] = 1;
				myBoard[x+n/2-1][y+n/2-1] = 1;
				
				tileTromino(n/2, x, y);
                tileTromino(n/2, x, y+n/2);
                tileTromino(n/2, x+n/2, y+n/2);
				
			} else { //bottom right
				
				tileTromino(n/2, x+n/2, y+n/2);
				
				myBoard[x+n/2-1][y+n/2] = 1;
				myBoard[x+n/2][y+n/2-1] = 1; /*myBoard[x+n/2-1][y+n/2]*/
				myBoard[x+n/2-1][y+n/2-1] = 1;
				
				tileTromino(n/2, x+n/2, y);
                tileTromino(n/2, x, y+n/2);
                tileTromino(n/2, x, y);
				
			}
		}
		
	}
	
	public static void print() { //unnecessary now, used for testing prior to implementing GUI
		for (int i=0; i<myBoard.length; i++) {
			for (int j = 0; j < myBoard[i].length; j++) {
				System.out.print(myBoard[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
