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

public class Studentlogin extends JFrame
{
	static String id;
	Container c=null;
	public Studentlogin()
	{
		setLayout(null);
	    c=getContentPane();
	    DBhandler obj=new DBhandler();
		
	    ImageIcon icn=new ImageIcon("studentlogin.jpg");
		JLabel lblBg=new JLabel(icn);
		lblBg.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		c.add(lblBg);
		
		JLabel lblid=new JLabel("Roll No :");
		lblid.setBounds(100, 100, 170, 25);
		lblBg.add(lblid);
		lblid.setForeground(Color.WHITE);
		lblid.setFont(new Font("lblid",Font.BOLD,30));
		JTextField txtid=new  JTextField();
	    txtid.setBounds(290,100,110,25);
    	lblBg.add(txtid);
    	
    	
    	JLabel lblpwd=new JLabel("Password :");
		lblpwd.setFont(new Font("lblpwd",Font.BOLD,30));
		lblpwd.setForeground(Color.WHITE);
		lblpwd.setBounds(100, 150, 170, 25);
		lblBg.add(lblpwd);
		JPasswordField txtpwd=new JPasswordField(); 
		txtpwd.setBounds(290, 150, 110, 25);
		lblBg.add(txtpwd);
		
		
		
		ImageIcon icn2=new ImageIcon("insapp4wrsh1.png");
	    JButton btnlog=new JButton("Login");
	    btnlog.setBounds(200,220, 100, 30);
	    lblBg.add(btnlog);
	    btnlog.addActionListener(new ActionListener(){
	    	
	    	
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
	                            
				String strrollno,strpwd;
				strrollno=txtid.getText();
				strpwd=String.valueOf(txtpwd.getPassword());
				boolean res=obj.isavalidstudent(strrollno,strpwd);
				if(res==true)
				{
					JOptionPane.showMessageDialog(null, "Welcome");
					id=txtid.getText();
			    	
					apptbl1 frm=new apptbl1();
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Enter Valid Idor Username");
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
	    
	    setTitle("Student Login");
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setVisible(true);
		setDefaultCloseOperation(2);
	}
 }
