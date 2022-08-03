import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class callisner extends WindowAdapter{


@Override
public void windowClosing(WindowEvent e){
 System.exit(0);
}
}

public class cal implements ActionListener{
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,
          b11,b12,b13,b14,b15,b16,b17,b18,b19,mc,mr,ms,madd,msub,fb;
    TextField tf;
    String fv,sv,op;
    double fdv,sdv,tot;
    
    cal(){
    Frame f1 = new Frame();
    f1.setBackground(Color.WHITE);
    f1.addWindowListener(new callisner());
    f1.setBounds(600, 250, 335, 520);
    f1.setTitle("Calculator");
    
    
    f1.setVisible(true);
    
    MenuBar menu = new MenuBar();
    MenuItem ma1 = new MenuItem("Standard");
    MenuItem ma2 = new MenuItem("Scientific");
    MenuItem ma3 = new MenuItem("copy");
    Menu m1 = new Menu("View");
    m1.add(ma1);
    m1.add(ma2);
    
    Menu m2 = new Menu("Edit");
    m2.add(ma3);
    
    MenuItem ma4 = new MenuItem("View Help F1");
    MenuItem ma5 = new MenuItem("About Calculator");
     Menu m3 = new Menu("Help");
     m3.add(ma4);
    m3.add(ma5);
     
    menu.add(m1);
    menu.add(m2);
    menu.add(m3);
    f1.setMenuBar(menu);
    
    Panel p1 = new Panel();
    Panel p2 = new Panel();
    GridLayout g1 = new GridLayout(7,2,0,0);
   
    
    b0 = new Button("0");
    b1 = new Button("1");
    b2 = new Button("2");
    b3 = new Button("3");
    b4 = new Button("4");
    b5 = new Button("5");
    b6 = new Button("6");
    b7 = new Button("7");
    b8 = new Button("8");
    b9 = new Button("9");
    
    b11 = new Button("=");
    b12 = new Button("+");
    b13 = new Button("-");
    b14= new Button("/");
    b15 = new Button("CE");
    b16 = new Button("*");
    b17 = new Button(".");
    b18 = new Button("%");
    b19 = new Button("sqrt");
    mc = new Button("MC");
    mr = new Button("MR");
    madd = new Button("M+");
    msub = new Button("M-");
    fb = new Button("+/-");
    
    Font fon1 = new Font("Calibri",Font.BOLD,20);
    Font fon2 = new Font("Calibri",Font.BOLD,25);
   
    b0.setFont(fon1);
    b0.setBackground(Color.GRAY);
    
    b1.setFont(fon1);
    b1.setBackground(Color.GRAY);
    
    b2.setFont(fon1);
    b2.setBackground(Color.GRAY);
    
    b3.setFont(fon1);
    b3.setBackground(Color.GRAY);
    
    b4.setFont(fon1);
    b4.setBackground(Color.GRAY);
    
    b5.setFont(fon1);
    b5.setBackground(Color.GRAY);
    
    b6.setFont(fon1);
    b6.setBackground(Color.GRAY);
    
    b7.setFont(fon1);
    b7.setBackground(Color.GRAY);
    
    b8.setFont(fon1);
    b8.setBackground(Color.GRAY);
    
    b9.setFont(fon1);
    b9.setBackground(Color.GRAY);
    
    b11.setFont(fon2);
    b11. setBackground(Color.ORANGE);
  
    b12.setFont(fon2);
    b12. setBackground(Color.ORANGE);
    
    b13.setFont(fon2);
    b13. setBackground(Color.ORANGE);
    
    b14.setFont(fon2);
    b14. setBackground(Color.ORANGE);
    
    b15.setFont(fon2);
    b15. setBackground(Color.ORANGE);
    
    b16.setFont(fon2);
    b16. setBackground(Color.ORANGE);
    
    b17.setFont(fon2);
    b17. setBackground(Color.GRAY);
    
    b18.setFont(fon2);
    b18. setBackground(Color.ORANGE);
    
    b19.setFont(fon2);
    b19. setBackground(Color.ORANGE);
    
    mc.setFont(fon2);
    mc. setBackground(Color.ORANGE);
    
    mr.setFont(fon2);
    mr. setBackground(Color.ORANGE);
  
    madd.setFont(fon2);
    madd. setBackground(Color.ORANGE);
    
    msub.setFont(fon2);
    msub. setBackground(Color.ORANGE);
    
    fb.setFont(fon2);
    fb. setBackground(Color.GRAY);
    
    Font fon3 = new Font("Calibri",Font.BOLD,35);
    tf = new TextField(15);
    tf.setFont(fon3.deriveFont(Font.PLAIN));
  
   
    p2.add(mc);
    p2.add(mr);
    p2.add(madd);
    p2.add(msub);
    p2.add(b19);
    p2.add(b14);
    p2.add(b18);
    p2.add(b12);
    p2.add(b7);
    p2.add(b8);
    p2.add(b9);
    p2.add(b13);
    p2.add(b4);
    p2.add(b5);
    p2.add(b6);
    p2.add(b16);
    p2.add(b1);
    p2.add(b2);
    p2.add(b3);
    p2.add(b11);
    p2.add(fb);
    p2.add(b0);
    p2.add(b17);
    p2.add(b15);
    
    
    
    p1.add(tf);
    
    f1.add(p1,BorderLayout.NORTH);
    f1.add(p2,BorderLayout.CENTER);
    p2.setLayout(g1);
    p2.setBackground(Color.WHITE);
    
    b0.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b11.addActionListener(this);
    b12.addActionListener(this);
    b13.addActionListener(this);
    b14.addActionListener(this);
    b15.addActionListener(this);
    b16.addActionListener(this);
    b17.addActionListener(this);
    b18.addActionListener(this);
    b19.addActionListener(this);
    
            }
   @Override
   public void actionPerformed(ActionEvent e){
   Object o = e.getSource();
   if(o.equals(b0)){
   tf.setText(tf.getText()+b0.getLabel());
   }else if(o.equals(b1)){
   tf.setText(tf.getText()+b1.getLabel());
   }else if(o.equals(b2)){
   tf.setText(tf.getText()+b2.getLabel());
   }else if(o.equals(b3)){
   tf.setText(tf.getText()+b3.getLabel());
   }else if(o.equals(b4)){
   tf.setText(tf.getText()+b4.getLabel());
   }else if(o.equals(b5)){
   tf.setText(tf.getText()+b5.getLabel());
   }else if(o.equals(b6)){
   tf.setText(tf.getText()+b6.getLabel());
   }else if(o.equals(b7)){
   tf.setText(tf.getText()+b7.getLabel());
   }else if(o.equals(b8)){
   tf.setText(tf.getText()+b8.getLabel());
   }else if(o.equals(b9)){
   tf.setText(tf.getText()+b9.getLabel());
   }else if(o.equals(b17)){
   tf.setText(tf.getText()+b17.getLabel());
   
   }else if(o.equals(b12)){
   fv = tf.getText();
   tf.setText("");
   op = b12.getLabel();
   }else if(o.equals(b15)){
   tf.setText("");
   }else if(o.equals(b13)){
   fv = tf.getText();
   tf.setText("");
   op = b13.getLabel();
   }else if(o.equals(b14)){
   fv = tf.getText();
   tf.setText("");
   op = b14.getLabel();
   }else if(o.equals(b16)){
   fv = tf.getText();
   tf.setText("");
   op = b16.getLabel();
   }else if(o.equals(b18)){
  fv=tf.getText();
  tf.setText("");
  op = b18.getLabel();
   }else if(o.equals(b19)){
   fv =tf.getText();
   op = b19.getLabel();
   }
   else if(o.equals(b11)){
   sv = tf.getText();
   fdv = Double.parseDouble(fv);
   sdv = Double.parseDouble(sv);
   
   if(op.equals("+")){
   tot = fdv + sdv;
   tf.setText(tot+"");
   }else if(op.equals("-")){
   tot = fdv - sdv;
   tf.setText(tot+"");
   }else if(op.equals("*")){
   tot = fdv * sdv;
   tf.setText(tot+"");
   }else if(op.equals("/")){
   tot = fdv / sdv;
   tf.setText(tot+"");
   }else if(op.equals("%")){
    tot = (fdv/sdv)*100; 
    tf.setText(tot+"");
   }else if(op.equals("sqrt")){
  tot = Math.sqrt(fdv);
  tf.setText(tot+"");
   }
   }
   
   }
}
class CreateCal{
    public static void main(String[] args) {
        new cal();
    }
}
