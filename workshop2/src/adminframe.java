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

public class adminframe extends JFrame{


	public adminframe()
	{
		Container c=null;
		c=getContentPane();
		setLayout(null);
		ImageIcon icn=new ImageIcon("wp2508257.jpg");
		JLabel lblBg=new JLabel(icn);
		lblBg.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		c.add(lblBg);
		
		
		
		JLabel lblunm=new JLabel("Username :");
		lblunm.setFont(new Font("lblunm",Font.BOLD,28));
		lblunm.setForeground(Color.WHITE);
		lblunm.setBounds(100, 100, 160, 40);
		lblBg.add(lblunm);
		JTextField txtunm=new JTextField();
		txtunm.setBounds(280, 110, 120, 20);
		lblBg.add(txtunm);
		
		
		JLabel lblpwd=new JLabel("Password :");
		lblpwd.setFont(new Font("lblpwd",Font.BOLD,28));
		lblpwd.setForeground(Color.WHITE);
		lblpwd.setBounds(100, 150, 150, 40);
		lblBg.add(lblpwd);	
		JPasswordField txtpwd=new JPasswordField();
		txtpwd.setBounds(280, 160, 120, 20);
		lblBg.add(txtpwd);
		
		ImageIcon icn2=new ImageIcon("button_loginadmin.png");
		JButton btnlogin=new JButton(icn2);
		btnlogin.setBounds(170, 220, 100, 30);
		lblBg.add(btnlogin);
		btnlogin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
			String strunm,strpwd;
			strunm=txtunm.getText();
			strpwd=String.valueOf(txtpwd.getPassword());
			DBhandler obj=new DBhandler();
			boolean res=obj.validuser(strunm,strpwd);
	
			
			if(res==true)
			{
				JOptionPane.showMessageDialog(null, "Valid Admin");	
				
				buttonframe frm=new buttonframe();
				dispose();
			}
           	else
        	{
            	JOptionPane.showMessageDialog(null,"Invalid Id or Password");	
         	}
		}
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
		
		setTitle("Admin");
	    setVisible(true);
	    setSize(Toolkit.getDefaultToolkit().getScreenSize());
	    setDefaultCloseOperation(2);
    }
}