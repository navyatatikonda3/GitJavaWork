package myjdbc;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class LoginFrame extends JFrame{
	private String userName;
	private String passWord;
	private JLabel unameLabel;
	private JTextField unameText;
	private JLabel passwordLabel;
	private JPasswordField passwordText;
	private JButton checkButton;
	
	//login frame construcor
	LoginFrame()
	{
		//creating components
		unameLabel=new JLabel("user name");
		unameText = new JTextField(30);
		passwordLabel=new JLabel("password");
		passwordText=new JPasswordField(10);
		checkButton=new JButton("check in database");
		
		
		//set bounds limitations for space specifications on gui
		setBounds(250,300,50,80);
		unameLabel.setBounds(10,10,500,400);
		unameText.setBounds(25,75,10,50);
		passwordLabel.setBounds(10,10,50,40);
		passwordText.setBounds(10,30,10,10);
		
		checkButton.setBounds(15,40,10,10);
		
		
		//add components to frame
		this.add(unameLabel);
		this.add(unameText);
		add(passwordLabel);
		add(passwordText);
		add(checkButton);
		
		//set frame visible
		
		setTitle("user login form");
		setLayout(new FlowLayout());
	}

}
