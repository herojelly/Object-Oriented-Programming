import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class PrintScreen {
	
	private JFrame passFrame;
	
	public PrintScreen(PictureGenerator picture, int spawnx, int spawny){
		
		
		String picNum= picture.getPictureNumber()+".png";
				
		ImageIcon passPhoto=new ImageIcon(picNum){//This block is here for testing only.
			public Dimension getPreferredSize(){
				return new Dimension(1000, 1000);
			};
		};
		
		passFrame=new ShowPassportWindow(passPhoto);
		
		printGUIPassport(passFrame, passPhoto, spawnx, spawny);
	}
	
	
	public static void printGUIPassport(JFrame passFrame, ImageIcon passPhoto, int spawnx, int spawny){
		passFrame.setSize(300, 400);
		passFrame.setLocation(spawnx, spawny);
		passFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		passFrame.setVisible(true);
	}
	
	public JFrame getPassFrame(){
		return passFrame;
	}
	
	public void setMyVisible(JFrame passFrame, boolean visible){
		passFrame.setVisible(false);
		passFrame.dispose();
		
	}
	
	
}


