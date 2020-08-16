import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class StaffLogin extends JFrame 
{
	
	Container c=null;
	public StaffLogin()
	{
		DBhandler obj=new DBhandler();
		  setLayout(null);
		  c=getContentPane();
	
		  ImageIcon icn=new ImageIcon("staflo.jpg");
		  JLabel lblBg=new JLabel(icn);
		  lblBg.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		  c.add(lblBg);
		  
		  JLabel lblun=new JLabel("User Id :");
		  lblun.setBounds(170,100,150,30);
		  lblBg.add(lblun);
		  lblun.setForeground(Color.WHITE);
		  lblun.setFont(new Font("lblun",Font.BOLD,23));
		  JTextField txt1=new JTextField();
		  txt1.setBounds(350, 105, 120, 25);
		  lblBg.add(txt1);
		  
		  JLabel lblpwd=new JLabel("Password :");
		  lblpwd.setBounds(170,150,150,30);
		  lblBg.add(lblpwd);
		  lblpwd.setForeground(Color.WHITE);
		  lblpwd.setFont(new Font("lblpwd",Font.BOLD,23));
		  JPasswordField txt2=new JPasswordField();
		  txt2.setBounds(350, 155, 120, 25);
		  lblBg.add(txt2);
		  
		  ImageIcon btnicn=new ImageIcon("button_login (2).png");
		  JButton btnlogin=new JButton(btnicn);
		  btnlogin.setBounds(250,200,93,25);
		  lblBg.add(btnlogin);
	
		  btnlogin.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) 
			{
				String struid,strpwd;
				struid=txt1.getText();
				strpwd=String.valueOf(txt2.getPassword());
				boolean res=obj.isavalidstaff(struid,strpwd);
				if(res=true)
				{
					JOptionPane.showMessageDialog(null, "Welcome");
					Studentdtl frm=new Studentdtl();
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Id or Password");
				}
				
				
			repaint();}
			  
		  });
	
		  		  ImageIcon icn3=new ImageIcon("buttonhome.png");
		    JButton btnhm=new JButton(icn3);
		    btnhm.setBounds(1240,40, 90, 35);
		    lblBg.add(btnhm);
		    btnhm.addActionListener(new ActionListener(){
		    	
		    	
				@Override
				public void actionPerformed(ActionEvent arg0)
				{
					Loginframe frm1= new Loginframe();
					dispose();

				}
		    });
		    

	
		  setTitle("Staff Login");
	      setSize(Toolkit.getDefaultToolkit().getScreenSize());
	      setVisible(true);
	      setDefaultCloseOperation(2);
	 }

}
