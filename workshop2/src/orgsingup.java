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
import javax.swing.JTextField;

public class orgsingup extends JFrame  
{
    Container c=null;
	public orgsingup()
	{
		DBhandler obj1=new DBhandler();
		setLayout(null);
		c=getContentPane();
		isvalid obj=new isvalid();

		ImageIcon icn=new ImageIcon("Blog-Brainstorming-Exercises.png");
		JLabel lblBg=new JLabel(icn);
		lblBg.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		c.add(lblBg);
		
	    JLabel compid=new JLabel("Company Id :");
         compid.setBounds(100, 100, 150, 25);
         lblBg.add(compid);
	    compid.setFont(new Font("compid",Font.BOLD,23));
	    compid.setForeground(Color.WHITE);
	    JTextField txt1=new JTextField();
	    txt1.setBounds(300, 100, 120, 25);
	    lblBg.add(txt1);
	    
	    
	    
	    
	    JLabel compname=new JLabel("Company Name :");
        compname.setBounds(100, 140, 190, 25);
        lblBg.add(compname);
        compname.setForeground(Color.WHITE);
	    compname.setFont(new Font("compname",Font.BOLD,23));
	    JTextField txt2=new JTextField();
	    txt2.setBounds(300, 140, 120, 25);
	    lblBg.add(txt2);
	    
	    
	    JLabel add=new JLabel("Address :");
        add.setBounds(100, 180, 150, 25);
        lblBg.add(add);
        add.setForeground(Color.WHITE);
	    add.setFont(new Font("add",Font.BOLD,23));
	    JTextField txt3=new JTextField();
	    txt3.setBounds(300, 180, 120, 25);
	    lblBg.add(txt3);
	    
	    JLabel eid=new JLabel("Email Id :");
        eid.setBounds(100, 220, 150, 25);
        lblBg.add(eid);
        eid.setForeground(Color.WHITE);
        eid.setFont(new Font("eid",Font.BOLD,23));
	    JTextField txt4=new JTextField();
	    txt4.setBounds(300, 220, 120, 25);
	    lblBg.add(txt4);
	    
	    JLabel dir=new JLabel("Director :");
        dir.setBounds(100, 260, 150, 25);
        lblBg.add(dir);
        dir.setForeground(Color.WHITE);
        dir.setFont(new Font("dir",Font.BOLD,23));
	    JTextField txt5=new JTextField();
	    txt5.setBounds(300, 260, 120, 25);
	    lblBg.add(txt5);
	    
	    
	    JLabel web=new JLabel("Website :");
        web.setBounds(100, 300, 150, 25);
        lblBg.add(web);
	    web.setFont(new Font("web",Font.BOLD,23));
	    web.setForeground(Color.WHITE);
	    JTextField txt6=new JTextField();
	    txt6.setBounds(300, 300, 120, 25);
	    lblBg.add(txt6);
	    
	    
	    JLabel cnc=new JLabel("Contact No :");
        cnc.setBounds(100, 340, 150, 25);
        lblBg.add(cnc);
        cnc.setForeground(Color.WHITE);
	    cnc.setFont(new Font("cnc",Font.BOLD,23));
	    JTextField txt7=new JTextField();
	    txt7.setBounds(300, 340, 120, 25);
	    lblBg.add(txt7);
	    
	    
	    JLabel pwd=new JLabel("Password :");
        pwd.setBounds(100, 380, 150, 25);
        lblBg.add(pwd);
        pwd.setForeground(Color.WHITE);
        pwd.setFont(new Font("pwd",Font.BOLD,23));
	    JTextField txt8=new JTextField();
	    txt8.setBounds(300, 380, 120, 25);
	    lblBg.add(txt8);
	    
	    ImageIcon icn5=new ImageIcon("button.png");
	    JButton btnbck=new JButton(icn5);
	    btnbck.setBounds(1190,40, 45, 35);
	    lblBg.add(btnbck);
	    btnbck.addActionListener(new ActionListener(){
	    	
	    	
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				orgframe frm =new orgframe();
				dispose();
			 	
			}
	    });	
			
	    
	    ImageIcon btnicn=new ImageIcon("button_submit.png");
	    JButton btnSignup=new JButton(btnicn);
		btnSignup.setBounds(150,450,100,30);
		lblBg.add(btnSignup);
		btnSignup.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				
				String intcnc,strid, strname,stradd,stremail,strdir,strweb,strpwd;
				
				
				strid=String.valueOf(txt1.getText());
				strname=txt2.getText();
				stradd=txt3.getText();
				stremail=txt4.getText();
				strdir=txt5.getText();
				strweb=txt6.getText();
				intcnc=txt7.getText();
				strpwd=txt8.getText();
			boolean res=obj1.checkid(strid);
			if(res==true)
			{
				JOptionPane.showMessageDialog(null,"ALREADY REGISTERED");
				
			}
				
			else if(strid.trim().isEmpty()||strname.trim().isEmpty()||stradd.trim().isEmpty()||stremail.trim().isEmpty()||strdir.trim().isEmpty()||strweb.trim().isEmpty()
						||String.valueOf(intcnc).trim().isEmpty()||strpwd.trim().isEmpty()	)
				{
					JOptionPane.showMessageDialog(null, "ENTER DETAILS IN BLANK FIELDS");
				}
				
				else if(intcnc.length()!=10||obj.isNumber(intcnc))
				{
					JOptionPane.showMessageDialog(null, "ENTER VALID MOBILE NO");
				}
				else
				{
				obj1.inserttblCompanyDetails(strid, strname,stradd,stremail,strdir,strweb,intcnc,strpwd);
				}
				
			
			}
			
		
			
		});
	    
	    setTitle("Regiter");
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setVisible(true);
		setDefaultCloseOperation(2);
	
	}
	
}
