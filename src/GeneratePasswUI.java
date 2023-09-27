import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GeneratePasswUI extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	JLabel l1,l2,text;
	JTextField t1,t2;
	JButton b1;

	GeneratePasswUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		
		text=new JLabel("PASSWORD GENERATOR");
		text.setFont(new Font("Osward",Font.BOLD,31));
		text.setBounds(530,60,400,40);
		add(text);
		
		l1 = new JLabel("Password");
		l1.setBounds(490,180,400,50);
		l1.setFont(new Font("Osward",Font.BOLD,20));
		add(l1);
		l2 = new JLabel("Size of Password");
		l2.setBounds(470,240,250,50);
		l2.setFont(new Font("Osward",Font.BOLD,20));
		add(l2);
        t1 = new JTextField(20);
        t1.setBounds(700,180,250,45);
        add(t1);
        t2 = new JTextField(20);
		t2.setBounds(700,250,250,45);
        add(t2);
        b1 = new JButton("Generate");
        b1.setBounds(650,350,100,40);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
        add(b1);
        b1.addActionListener(this);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
      
		setVisible(true);
     
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		int size=Integer.parseInt(t2.getText());
		char[] pass = PasswordGenerator.password(size);
		t1.setText(String.valueOf(pass));}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Please Enter the Size of Password.");
		}
	}
}
