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

public class orgframe extends JFrame
{
	Container c=null;
	public orgframe()
	{
		setLayout(null);
	    c=getContentPane();
		
	    ImageIcon icn=new ImageIcon("Blog-Brainstorming-Exercises.png");
		JLabel lblBg=new JLabel(icn);
		lblBg.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		c.add(lblBg);
		
	    JLabel lblid=new JLabel("User Id ");
	    lblid.setForeground(Color.WHITE);
	    lblid.setFont(new Font("lblunm",Font.BOLD,30));
    	lblid.setBounds(100, 100, 150, 25);
		lblBg.add(lblid);
		
		JTextField txtid=new JTextField(); 
		txtid.setBounds(280, 100, 110, 25);
		lblBg.add(txtid);
		
		
		JLabel lblpwd=new JLabel("Password");
		lblpwd.setFont(new Font("lblpwd",Font.BOLD,30));
		lblpwd.setForeground(Color.WHITE);
		lblpwd.setBounds(100, 150, 150, 25);
		lblBg.add(lblpwd);
		JPasswordField txtpwd=new JPasswordField(); 
		txtpwd.setBounds(280, 150, 110, 25);
		lblBg.add(txtpwd);
		
		ImageIcon btnicn=new ImageIcon("button_login.png");
		JButton btnlogin=new JButton(btnicn);
		btnlogin.setBounds(110,200,95,28);
		lblBg.add(btnlogin);
		btnlogin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String strCid,strPwd;
				strCid=txtid.getText();
				strPwd=String.valueOf(txtpwd.getPassword());
				
				DBhandler obj=new DBhandler();
				boolean res=obj.isValidUsrr(strCid,strPwd);
				if(res==true)
				{
					
					JOptionPane.showMessageDialog(null, "valid User");
		
					ImageIcon btnicn4=new ImageIcon("button_apply-for-workshop.png");
				    JButton btn1=new JButton(btnicn4);
					btn1.setBounds(110,250,180,28);
					lblBg.add(btn1);
					btn1.addActionListener(new ActionListener()
					{

						@Override
						public void actionPerformed(ActionEvent arg0) 
						{
					
							App4wrsp frm=new App4wrsp();
							dispose();
									
						}
					
					});

					ImageIcon btnicn3=new ImageIcon("button_status.png");
					JButton btn2=new JButton(btnicn3);
					btn2.setBounds(110,300,115,28);
					lblBg.add(btn2);
					btn2.addActionListener(new ActionListener()
					{

						
						public void actionPerformed(ActionEvent arg0)
						{
							Workshoptable1 frm=new Workshoptable1();
							
						}
						
					});
					repaint();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "invalid User");
						
				}
			}
			
		
		
		
		});

		
		ImageIcon btnicn2=new ImageIcon("button_signup.png");
		JButton btnSignup=new JButton(btnicn2);
		btnSignup.setBounds(220,200,95,28);
		lblBg.add(btnSignup);
		btnSignup.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();
				orgsingup frm=new orgsingup();
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
				dispose();
				Loginframe frm1= new Loginframe();
			}
	    });
		
		
		setTitle("ORGANISATION");
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setVisible(true);
		setDefaultCloseOperation(2);
	}
}
