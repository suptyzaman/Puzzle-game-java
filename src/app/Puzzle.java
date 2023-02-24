package app;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.awt.Font;
import java.awt.Color;

public class Puzzle extends JFrame implements ActionListener {
    static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next;
    String name;
    
    Puzzle(){
      super("Puzzle Game");
      name=JOptionPane.showInputDialog(this,"Enter the name");
      b1=new JButton("1");
      b2=new JButton("2");
      b3=new JButton("3");
      b4=new JButton("4");
      b5=new JButton("5");
      b6=new JButton("6");
      b7=new JButton("7");
      b8=new JButton("8");
      b9=new JButton(" ");
      b9.setBackground(Color.red);
      next=new JButton("New Game");

      b1.setBounds(10,30,100,100);
      b2.setBounds(120,30,100,100);
      b3.setBounds(230,30,100,100);
      b4.setBounds(10,140,100,100);
      b5.setBounds(120,140,100,100);
      b6.setBounds(230,140,100,100);
      b7.setBounds(10,250,100,100);
      b8.setBounds(120, 250, 100, 100);
      b9.setBounds(230, 250, 100, 100);
      next.setBounds(90,370,150,50);

      b1.setFont(new Font("Arial", Font.PLAIN, 40));
      b2.setFont(new Font("Arial", Font.PLAIN, 40));
      b3.setFont(new Font("Arial", Font.PLAIN, 40));
      b4.setFont(new Font("Arial", Font.PLAIN, 40));
      b5.setFont(new Font("Arial", Font.PLAIN, 40));
      b6.setFont(new Font("Arial", Font.PLAIN, 40));
      b7.setFont(new Font("Arial", Font.PLAIN, 40));
      b8.setFont(new Font("Arial", Font.PLAIN, 40));
      b9.setFont(new Font("Arial", Font.PLAIN, 40));
      next.setFont(new Font("Arial", Font.PLAIN, 20));

      //b9.setBackground(Color.green);

      add(b1);add(b2); add(b3); add(b4); add(b5); add(b6); add(b7); add(b8); add(b9); add(next);


      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
      next.addActionListener(this);


      setLayout(null);
      setVisible(true);
      setSize(360,470);
      setLocation(100,100);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
    String s = b1.getText();
    if(b2.getText().equals(" ")){
        b2.setText(s);
        b1.setText(" ");
        b2.setBackground(Color.green);
        b1.setBackground(Color.red);
    }
    else if(b4.getText().equals(" ")){
        b1.setText(" ");
        b4.setText(s);
        b4.setBackground(Color.green);
        b2.setBackground(Color.red);
    }
}
if(e.getSource()==b2){
    String s= b2.getText();
    if(b1.getText().equals(" ")){
      b1.setText(s);
      b2.setText(" ");
      b1.setBackground(Color.green);
      b2.setBackground(Color.red);
    }
    else if (b3.getText().equals(" ")){
      b3.setText(s);
      b2.setText(" ");
      b3.setBackground(Color.green);
      b2.setBackground(Color.red);
    }
    else if(b5.getText().equals(" ")){
      b5.setText(s);
      b2.setText(" ");
      b5.setBackground(Color.green);
      b2.setBackground(Color.red);
    }
}
if(e.getSource()==b3){
    String s=b3.getText();
    if(b2.getText().equals(" ")){
       b2.setText(s);
       b3.setText(" ");
       b2.setBackground(Color.green);
       b3.setBackground(Color.red);
    }
    else if(b6.getText().equals(" ")){
      b6.setText(s);
      b3.setText(" ");
      b6.setBackground(Color.green);
      b3.setBackground(Color.red);
    }

}
if(e.getSource()==b4){
    String s=b4.getText();
    if(b1.getText().equals(" ")){
       b1.setText(s);
       b4.setText(" ");
       b1.setBackground(Color.green);
       b4.setBackground(Color.red);
    }
    else if(b5.getText().equals(" ")){
        b5.setText(s);
        b4.setText(" "); 
        b5.setBackground(Color.green);
        b4.setBackground(Color.red);
    }
    else if(b7.getText().equals(" ")){
        b7.setText(s);
        b4.setText(" ");
        b7.setBackground(Color.green);
        b4.setBackground(Color.red);
    }
}
if(e.getSource()==b5){
    String s=b5.getText();
    if(b2.getText().equals(" ")){
      b2.setText(s);
      b5.setText(" ");
      b2.setBackground(Color.green);
      b5.setBackground(Color.red);
    }
    else if(b4.getText().equals(" ")){
      b4.setText(s);
      b5.setText(" ");
      b4.setBackground(Color.green);
      b5.setBackground(Color.red);
     
    }
    else if(b6.getText().equals(" ")){
      b6.setText(s);
      b5.setText(" ");
      b6.setBackground(Color.green);
      b5.setBackground(Color.red);
    }
    else if(b8.getText().equals(" ")){
      b8.setText(s);
      b5.setText(" ");
      b8.setBackground(Color.green);
      b5.setBackground(Color.red);
    }

}
if(e.getSource()==b6){
    String s=b6.getText();
    if(b3.getText().equals(" ")){
      b3.setText(s);
      b6.setText(" ");
      b3.setBackground(Color.green);
      b6.setBackground(Color.red);
    }
    else if(b5.getText().equals(" ")){
      b5.setText(s);
      b6.setText(" ");
      b5.setBackground(Color.green);
      b6.setBackground(Color.red);
    }
    else if(b9.getText().equals(" ")){
      b9.setText(s);
      b6.setText(" ");
      b9.setBackground(Color.green);
      b6.setBackground(Color.red);
    }
}
if(e.getSource()==b7){
    String s=b7.getText();
    if(b4.getText().equals(" ")){
      b4.setText(s);
      b7.setText(" ");
      b4.setBackground(Color.green);
      b7.setBackground(Color.red);
    }
    else if(b8.getText().equals(" ")){
      b8.setText(s);
      b7.setText(" ");
      b8.setBackground(Color.green);
      b7.setBackground(Color.red);
    }
}
if(e.getSource()==b8){
    String s=b8.getText();
    if(b5.getText().equals(" ")){
      b5.setText(s);
      b8.setText(" ");
      b5.setBackground(Color.green);
      b8.setBackground(Color.red);
    }
    else if(b7.getText().equals(" ")){
      b7.setText(s);
      b8.setText(" ");
      b7.setBackground(Color.green);
      b8.setBackground(Color.red);
    }
    else if(b9.getText().equals(" ")){
      b9.setText(s);
      b8.setText(" ");
      b9.setBackground(Color.green);
      b8.setBackground(Color.red);
    }
}
if(e.getSource()==b9){
    String s=b9.getText();
    if(b6.getText().equals(" ")){
      b6.setText(s);
      b9.setText(" ");
      b6.setBackground(Color.green);
      b9.setBackground(Color.red);
    }
    else if(b8.getText().equals(" ")){
      b8.setText(s);
      b9.setText(" ");
      b8.setBackground(Color.green);
      b9.setBackground(Color.red);
    }
    if(b1.getText().equals("1")&&b2.getText().equals("2")&&
        b3.getText().equals("3")&&b4.getText().equals("4")&&
        b5.getText().equals("5")&&b6.getText().equals("6")&&
        b7.getText().equals("7")&&b8.getText().equals("8")&&
        b9.getText().equals(" ")){
            JOptionPane.showMessageDialog(this, name+"  !!!You won the game");
    }
}
    if(e.getSource()==next){
        
        //1 2 3 4 5 6 7 8 9
        //0 0 0 0 0 0 0 0 0
        
        int[] arr = new int[9];
        for(int i = 0; i<9; i++) arr[i] = 0;
        generateRandom(arr);
                    
            
            for(int i = 0; i<9; i++) {
                int ind = i+1;
                int val = arr[i];
                String s = Integer.toString(val);
                
                if(ind == 1) {
                    
                    if(s.equals("9")){
                        b1.setText(" ");
                    }else {
                        b1.setText(s);
                    }
                            
                }else if(ind == 2) {
                    if(s.equals("9")){
                        b2.setText(" ");
                    }else {
                        b2.setText(s);
                    }
                }else if(ind == 3) {
                    if(s.equals("9")){
                        b3.setText(" ");
                    }else {
                        b3.setText(s);
                    }
                }else if(ind == 4) {
                    if(s.equals("9")){
                        b4.setText(" ");
                    }else {
                        b4.setText(s);
                    }
                }else if(ind == 5) {
                    if(s.equals("9")){
                        b5.setText(" ");
                    }else {
                        b5.setText(s);
                    }
                }else if(ind == 6) {
                    if(s.equals("9")){
                        b6.setText(" ");
                    }else {
                        b6.setText(s);
                    }
                }else if(ind == 7) {
                    if(s.equals("9")){
                        b7.setText(" ");
                    }else {
                        b7.setText(s);
                    }
                }else if(ind == 8) {
                    if(s.equals("9")){
                        b8.setText(" ");
                    }else {
                        b8.setText(s);
                    }
                }else {
                    if(s.equals("9")){
                        b9.setText(" ");
                    }else {
                        b9.setText(s);
                    }
                }
            }
            
        
    }
}

    public static void main(String[] args) {
        new Puzzle();
    }
    
    static void generateRandom(int[] arr) {
        
        Random rand = new Random();
        
        for(int i = 1; i<=9; i++) {
            
            int ind = rand.nextInt(9);
            
            while(arr[ind] != 0) {
                ind = rand.nextInt(9);
            }
            arr[ind] = i;
            
        }
        
    }
}
