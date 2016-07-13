import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.event.*;//This is for the Action Listener

public class TitleScreen implements ActionListener{

	private boolean startGame=false;//is false until button is clicked.  When it is true, game will start
	private JFrame frame=new JFrame("TSA SIMULATOR 2016");
	private JFrame frame1=new JFrame("TSA SIMULATOR 2016");
	
	public TitleScreen(){
	}
	
	public void printScreens(){
		ImageIcon image=new ImageIcon("Loading.jpg");//Creates the Loading Screen
		JLabel label=new JLabel(image);
		frame.add(label);
		frame.setSize(960, 750);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			Thread.sleep(8000);//"Loads" for 8 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		frame.setVisible(false);
		frame.dispose();// Closes Loading Screen
		
		ImageIcon image1=new ImageIcon("Title.jpg");//Creates Title Screen
		JLabel label1=new JLabel(image1);
		JButton button=new JButton("Play");
		button.setSize(150, 50);
		button.addActionListener(this);
		frame1.add(button);
		button.setLocation(400, 390);
		button.setVisible(true);
		frame1.add(label1);
		frame1.setSize(960, 750);
		frame1.setVisible(true);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Does not terminate.  Game class will close window when game starts
	}

	
	public boolean getStartGame(){
		return startGame;
	}
	
	
	public void setStartGame(boolean startGame){
		this.startGame=startGame;
	}
	
	public void actionPerformed(ActionEvent a){//Waits for button to be clicked
		setStartGame(true);
		frame1.setVisible(false);//gets rid of title screen when game starts
		frame1.dispose();
		//System.out.println(getStartGame());
	}
	
	
}