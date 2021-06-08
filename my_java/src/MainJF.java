import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainJF {
   JFrame jf = new JFrame();
   JLabel jlb = new JLabel("기본값");
   
   public MainJF() {
      initDisplay();
      Mainbutton mb = new Mainbutton(this);
      System.out.println("여기는 MainJF :"+this);
   }
   public MainJF(String d) {
	   
   }
   public void initDisplay() {
      jf.add(jlb);
      jf.setSize(500, 300);
      jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
      jf.setVisible(true);
      
   }
   public static void main(String[] args) {
      new MainJF();
   }
}