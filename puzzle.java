package puzzleGame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class puzzle extends JFrame implements ActionListener {
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next;
	puzzle(){
		super("puzzleGame");
		 b1 = new JButton("1");
		 b2 = new JButton(" ");
		 b3 = new JButton("3");
		 b4 = new JButton("4");
		 b5 = new JButton("5");
		 b6 = new JButton("6");
		 b7 = new JButton("7");
		 b8 = new JButton("8");
		 b9 = new JButton("2");
		 next = new JButton("next");
		
		b1.setBounds(20,30,50,50);
		b2.setBounds(80,30,50,50);
		b3.setBounds(140,30,50,50);
		b4.setBounds(20,80,50,50);
		b5.setBounds(80,80,50,50);
		b6.setBounds(140,80,50,50);
		b7.setBounds(20,130,50,50);
		b8.setBounds(80,130,50,50);
		b9.setBounds(140,130,50,50);
		
		next.setBounds(80,200,100,40);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(next);
		
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
		
		next.setForeground(Color.white);
		next.setBackground(Color.black);
		setSize(300,500);
		setLayout(null);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			String str = b1.getLabel();
			if(b2.getLabel().equals(" "))
			{
				b2.setLabel(str);
				b1.setLabel(" ");
			}
			else if(b4.getLabel().equals(" ")){
				b4.setLabel(str);
				b1.setLabel(" ");
			}
		}
		
		
		if(e.getSource()==b3) {
			String str = b3.getLabel();
			if(b2.getLabel().equals(" "))
			{
				b2.setLabel(str);
				b3.setLabel(" ");
			}
			else if(b6.getLabel().equals(" ")){
				b6.setLabel(str);
				b3.setLabel(" ");
			}
		}
		
		
		if(e.getSource()==b2) {
			String str = b2.getLabel();
			if(b1.getLabel().equals(" "))
			{
				b1.setLabel(str);
				b2.setLabel(" ");
			}
			else if(b3.getLabel().equals(" ")){
				b3.setLabel(str);
				b2.setLabel(" ");
			}
			else if(b5.getLabel().equals(" ")) {
				b5.setLabel(str);
				b2.setLabel(" ");
			}
		}
		
		
		if(e.getSource()==b4) {
			String str = b4.getLabel();
			if(b1.getLabel().equals(" "))
			{
				b1.setLabel(str);
				b4.setLabel(" ");
			}
			else if(b7.getLabel().equals(" ")){
				b7.setLabel(str);
				b4.setLabel(" ");
			}
			else if(b5.getLabel().equals(" ")) {
				b5.setLabel(str);
				b4.setLabel(" ");
			}
		}
		
		
		
		if(e.getSource()==b5) {
			String str = b5.getLabel();
			if(b2.getLabel().equals(" "))
			{
				b2.setLabel(str);
				b5.setLabel(" ");
			}
			else if(b4.getLabel().equals(" ")){
				b4.setLabel(str);
				b5.setLabel(" ");
			}
			else if(b6.getLabel().equals(" ")) {
				b6.setLabel(str);
				b5.setLabel(" ");
			}
			else if(b8.getLabel().equals(" ")) {
				b8.setLabel(str);
				b5.setLabel(" ");
			}
		}
		
		
		if(e.getSource()==b6) {
			String str = b6.getLabel();
			if(b9.getLabel().equals(" "))
			{
				b9.setLabel(str);
				b6.setLabel(" ");
			}
			else if(b3.getLabel().equals(" ")){
				b3.setLabel(str);
				b6.setLabel(" ");
			}
			else if(b5.getLabel().equals(" ")) {
				b5.setLabel(str);
				b6.setLabel(" ");
			}
		}
		
		
		if(e.getSource()==b7) {
			String str = b7.getLabel();
			if(b4.getLabel().equals(" "))
			{
				b4.setLabel(str);
				b7.setLabel(" ");
			}
			else if(b8.getLabel().equals(" ")){
				b8.setLabel(str);
				b7.setLabel(" ");
			}
		}
		
		
		if(e.getSource()==b8) {
			String str = b8.getLabel();
			if(b7.getLabel().equals(" "))
			{
				b7.setLabel(str);
				b8.setLabel(" ");
			}
			else if(b9.getLabel().equals(" ")){
				b9.setLabel(str);
				b8.setLabel(" ");
			}
			else if(b5.getLabel().equals(" ")) {
				b5.setLabel(str);
				b8.setLabel(" ");
			}
		}
		
		
		if(e.getSource()==b9) {
			String str = b9.getLabel();
			if(b6.getLabel().equals(" "))
			{
				b6.setLabel(str);
				b9.setLabel(" ");
			}
			else if(b8.getLabel().equals(" ")){
				b8.setLabel(str);
				b9.setLabel(" ");
			}
			
			if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()  
					.equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")  
					&&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()  
					.equals("8")&&b9.getLabel().equals(" ")){   
					JOptionPane.showMessageDialog(puzzleGame.this,"Congratulations You Won!!!");  
					}  
		}
		
		
		if(e.getSource()==next){ 
			
			String s=b4.getLabel();  
			b4.setLabel(b9.getLabel());  
			b9.setLabel(s);  
			s=b1.getLabel();  
			b1.setLabel(b5.getLabel());  
			b5.setLabel(s);  
			s=b2.getLabel();  
			b2.setLabel(b7.getLabel());  
			b7.setLabel(s); 
			
			}
		
		
		
	
	}
	
	public static void main(String[] args) {
		new puzzle();
	}
}













