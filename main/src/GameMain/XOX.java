package GameMain;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;
/**
*
* @author Pra
*/
public class XOX extends JFrame {
JPanel p = new JPanel();
XOButton buttons[] = new XOButton[9];
public static void main(String [] args) {
new XOX();
}
public XOX() {
super("GameXOX By:AliBunyaminKholifah");
setSize(400, 400);
setResizable(false);
setDefaultCloseOperation(EXIT_ON_CLOSE);
p.setLayout(new GridLayout(3,3));
for (int i=0; i<9; i++) {
buttons[i] = new XOButton();
p.add(buttons[i]);
}
add(p);
setVisible(true);
}
}
