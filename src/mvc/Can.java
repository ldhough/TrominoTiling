package mvc;
import java.awt.*;

@SuppressWarnings("serial")
public class Can extends Canvas{
	private Image myImage;
	private String myValue;
	
	public Can(String value) {
		myImage = null;
		myValue = value;
	}
	
	public Can(Image image) {
		myImage = image;
		myValue = null;
	}
	
    public void paint(Graphics g) {
        if(myValue==null) {
            g.drawImage(myImage,0/*10*/,0/*10*/, this); //changing number here appears to change
            //the gap between grid squares
        }
        else {
            g.setColor(Color.red);
            g.drawString(myValue,20,20); 
        }
    }
    
    public void setImage(Image data) {
      myImage = data;
      this.repaint();
    }
	
}
