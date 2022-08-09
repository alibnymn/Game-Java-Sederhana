package GameMain;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
*
* @author Pra
*/
public class XOButton extends JButton implements ActionListener{
ImageIcon x,o;
byte value =0;
/*
1:nothing
*/
public XOButton() {
x = new ImageIcon(this.getClass().getResource("/GameMain/x.png"));
o = new ImageIcon(this.getClass().getResource("/GameMain/o.png"));
this.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e){
value++;
value %=3;
switch (value) {
case 0: setIcon(null);
setIcon(null);
break;
case 1:setIcon(x);
setIcon(x);
break;
case 2:setIcon(o);
setIcon(o);
break;
}
}
}

