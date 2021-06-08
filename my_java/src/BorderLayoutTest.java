import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutTest {
	public static void main(String[] args) {
		BorderLayoutTest blt = new BorderLayoutTest();
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		GridLayout gl = new GridLayout(3,2);
		JButton jbtn = new JButton("123");
		JButton jbtn1 = new JButton("123");
		JButton jbtn2 = new JButton("123");
		
		jp.setLayout(gl);
		jp.add(jbtn);
		jp.add(jbtn1);
		jp.add(jbtn2);
		jf.add(jp);
		
		
		//jf.add(jp);
		jf.setVisible(true);
		jf.setSize(400, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
