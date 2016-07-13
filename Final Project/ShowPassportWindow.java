import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class ShowPassportWindow extends JFrame {

	public ShowPassportWindow(ImageIcon passPhoto){
		
		setLayout(new BorderLayout(10,10));
		Border border=LineBorder.createGrayLineBorder();
		
		/*JLabel info=new JLabel(information){
			public Dimension getPreferredSize(){
				return new Dimension(100,100);
			};
		};*/
		
		
		JLabel label=new JLabel(){//This JLabel is needed to house the ImageIcon
			public Dimension getPreferredSize(){
				return new Dimension(1000,1000);
			};
		};
		
		//info.setBorder(border);
		//cannot put border on ImageIcon?
		
		//add(info, BorderLayout.SOUTH);
		label.setIcon(passPhoto);//the image has to be an icon in an JLabel
		add(label, BorderLayout.CENTER);
		
		
		
		
		
	}
}
