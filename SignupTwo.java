package bank.management.system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.util.*;


public class SignupTwo extends JFrame implements ActionListener{
	
	     
	     JTextField religionTextField,categoryTextField,incomeTextField,qualificationTextField,occupationTextField,panTextField,aadharTextField;
	     JButton next;
	     JRadioButton syes,sno,eyes,eno;
	     String formno;
	     
	     
	     

	SignupTwo(String formno){
		
		this.formno=formno;
		
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 2");
		
		
		
		JLabel additinalDetails=new JLabel("Page 2 : Additional Details");
		additinalDetails.setFont(new Font("Railway",Font.BOLD,22));
		additinalDetails.setBounds(290,80,400,30);
		add(additinalDetails);
		
		JLabel religion=new JLabel("Religion:");
		religion.setFont(new Font("Railway",Font.BOLD,20));
		religion.setBounds(100,140,100,30);
		add(religion);
		
		religionTextField=new JTextField();
		religionTextField.setFont(new Font("Railway",Font.BOLD,14));
		religionTextField.setBounds(300,140,400,30);
		add(religionTextField);
		
		
		JLabel category=new JLabel("Category:");
		category.setFont(new Font("Railway",Font.BOLD,20));
		category.setBounds(100,190,200,30);
		add(category);
		
	    categoryTextField=new JTextField();
		categoryTextField.setFont(new Font("Railway",Font.BOLD,14));
		categoryTextField.setBounds(300,190,400,30);
		add(categoryTextField);
		
		JLabel income=new JLabel("Income:");
		income.setFont(new Font("Railway",Font.BOLD,20));
		income.setBounds(100,240,200,30);
		add(income);
		
		
		incomeTextField=new JTextField();
		incomeTextField.setFont(new Font("Railway",Font.BOLD,14));
		incomeTextField.setBounds(300,240,400,30);
		add(incomeTextField);
		
		JLabel gender=new JLabel("Educational:");
		gender.setFont(new Font("Railway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);
		
		
		JLabel qualification=new JLabel("Qualification:");
		qualification.setFont(new Font("Railway",Font.BOLD,20));
		qualification.setBounds(100,315,200,30);
		add(qualification);
		
		qualificationTextField=new JTextField();
		qualificationTextField.setFont(new Font("Railway",Font.BOLD,14));
		qualificationTextField.setBounds(300,340,400,30);
		add(qualificationTextField);
		
		JLabel occupation=new JLabel("Occupation:");
		occupation.setFont(new Font("Railway",Font.BOLD,20));
		occupation.setBounds(100,390,200,30);
		add(occupation);
		
		occupationTextField =new JTextField();
		occupationTextField.setBounds(300,390,400,30);
		occupationTextField.setBackground(Color.WHITE);
		add(occupationTextField);
		
		
		JLabel pan=new JLabel("PAN Number:");
		pan.setFont(new Font("Railway",Font.BOLD,20));
		pan.setBounds(100,440,200,30);
		add(pan);
		
		panTextField=new JTextField();
		panTextField.setFont(new Font("Railway",Font.BOLD,14));
		panTextField.setBounds(300,440,400,30);
		add(panTextField);
		
		JLabel aadharno=new JLabel("Aadhar Number:");
		aadharno.setFont(new Font("Railway",Font.BOLD,20));
		aadharno.setBounds(100,490,200,30);
		add(aadharno);
		
		aadharTextField=new JTextField();
		aadharTextField.setFont(new Font("Railway",Font.BOLD,14));
		aadharTextField.setBounds(300,490,400,30);
		add(aadharTextField);
		
		JLabel seniorCitizen=new JLabel("Senior Citizen:");
		seniorCitizen.setFont(new Font("Railway",Font.BOLD,20));
		seniorCitizen.setBounds(100,540,200,30);
		add(seniorCitizen);
		
	    syes=new JRadioButton("Yes");
	    syes.setBounds(300,540,100,30);
	    syes.setBackground(Color.WHITE);
	    add(syes);
	    
	    sno=new JRadioButton("No");
	    sno.setBounds(450,540,100,30);
	    sno.setBackground(Color.WHITE);
	    add(sno);
	    
	    ButtonGroup sCitizen=new ButtonGroup();
	    sCitizen.add(syes);
	    sCitizen.add(sno);
		
		JLabel existingAccount=new JLabel("Existing Account:");
		existingAccount.setFont(new Font("Railway",Font.BOLD,20));
		existingAccount.setBounds(100,590,200,30);
		add(existingAccount);
		
		eyes=new JRadioButton("Yes");
	    eyes.setBounds(300,590,100,30);
	    eyes.setBackground(Color.WHITE);
	    add(eyes);
	    
	    eno=new JRadioButton("No");
	    eno.setBounds(450,590,100,30);
	    eno.setBackground(Color.WHITE);
	    add(eno);
	    
	    ButtonGroup account=new ButtonGroup();
	    account.add(eyes);
	    account.add(eno);
		
		
		JButton next=new JButton("Next");
		next.setBackground(Color.white);
		next.setForeground(Color.black);
		next.setFont(new Font("Raileay",Font.BOLD,14));
		next.setBounds(620,660,80,30);
		next.addActionListener(this);
		
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String sreligion=religionTextField.getText();
		String scategory=categoryTextField.getText();
		String sincome=incomeTextField.getText();
		String seducation=qualificationTextField.getText();
		String soccupation=occupationTextField.getText();
		String scitizen = null;
		if(syes.isSelected()) {
			scitizen="Yes";
		}else if(sno.isSelected()) {
			scitizen="No";
		}
		String sexistingaccount=null;
		if(eyes.isSelected()) {
			sexistingaccount="yes";
		}else if(eno.isSelected()) {
			sexistingaccount="No";
		}
		
		String span=panTextField.getText();
		String saadhar=aadharTextField.getText();
		
		
		try {
			
			
				Conn c=new Conn();
				String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+scitizen+"','"+sexistingaccount+"','"+span+"','"+saadhar+"')";
				c.s.executeUpdate(query);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	
	
	
	public static void main(String argd[]) {
		new SignupTwo(" ");
	}




	
}
