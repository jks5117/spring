import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Mainbutton implements ActionListener{
   MainJF mj = null;
   
   JFrame jf = new JFrame();
   JTextField jtf = new JTextField();
   JButton jbtn = new JButton("변경");
   
   public Mainbutton(MainJF mj) {
      this.mj = mj;
  
      System.out.println("여기는 버튼에서 생성한 MainJF : "+this.mj);
      initDisplay();
   }
   public Mainbutton(String abc) {
	   
   }
   public void initDisplay() {
      jf.setLayout(new GridLayout(2, 1));
      jf.add(jtf);
      jf.add(jbtn);
      jbtn.addActionListener(this);
      jf.setSize(300, 300);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setVisible(true);
      
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if(jbtn == e.getSource()) {
         String msg = jtf.getText();
         
         mj.jlb.setText(msg);
      }
   }
}