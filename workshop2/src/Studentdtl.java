import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Studentdtl extends JFrame
{
  Container c=null;
	public Studentdtl()
	{
		isvalid obj1=new isvalid();
		DBhandler obj=new DBhandler();
		c=getContentPane();
		ImageIcon icn=new ImageIcon("stddtl.jpg");
		JLabel lblbg=new JLabel(icn);
		lblbg.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		c.add(lblbg);
		
		JLabel lbl=new JLabel("Enter Student Details :");
		lbl.setBounds(100, 30, 550, 25);
		lbl.setFont(new Font("lbl",Font.BOLD,30));
		lbl.setForeground(Color.WHITE);
		lblbg.add(lbl);
		
		
		JLabel lblname=new JLabel("Roll No :");
		lblname.setBounds(100, 100, 150, 25);
		lblname.setFont(new Font("lblname",Font.BOLD,23));
		lblname.setForeground(Color.WHITE);
		lblbg.add(lblname);
		JTextField txt1=new JTextField();
		txt1.setBounds(250, 100, 110, 25);
		lblbg.add(txt1);
		
		
		
		JLabel lblroll=new JLabel("Name :");
		lblroll.setBounds(100, 140, 150, 25);
		lblroll.setFont(new Font("lblroll",Font.BOLD,23));
		lblroll.setForeground(Color.WHITE);
		lblbg.add(lblroll);
		JTextField txt2=new JTextField();
		txt2.setBounds(250, 140, 110, 25);
		lblbg.add(txt2);

		
		
		JLabel lblun=new JLabel("Username :");
		lblun.setBounds(100, 180, 150, 25);
		lblun.setFont(new Font("lblun",Font.BOLD,23));
		lblun.setForeground(Color.WHITE);
		lblbg.add(lblun);
		JTextField txt3=new JTextField();
		txt3.setBounds(250, 180, 110, 25);
		lblbg.add(txt3);
		
		JLabel lblpwd=new JLabel("Password :");
		lblpwd.setBounds(100, 220, 150, 25);
		lblpwd.setFont(new Font("lblroll",Font.BOLD,23));
		lblpwd.setForeground(Color.WHITE);
		lblbg.add(lblpwd);
		JTextField txt4=new JTextField();
		txt4.setBounds(250, 220, 110, 25);
		lblbg.add(txt4);
		
		JLabel lblcpwd=new JLabel("Confirm :");
		lblcpwd.setBounds(100, 260, 150, 25);
		lblcpwd.setFont(new Font("lblcpwd",Font.BOLD,23));
		lblcpwd.setForeground(Color.WHITE);
		lblbg.add(lblcpwd);
		JTextField txt5=new JTextField();
		txt5.setBounds(250, 260, 110, 25);
		lblbg.add(txt5);
		
		JLabel lblsem=new JLabel("Semester :");
		lblsem.setBounds(100, 300, 150, 25);
		lblsem.setFont(new Font("lblsem",Font.BOLD,23));
		lblsem.setForeground(Color.WHITE);
		lblbg.add(lblsem);
		JTextField txt6=new JTextField();
		txt6.setBounds(250, 300, 110, 25);
		lblbg.add(txt6);
		
		JLabel lblgen=new JLabel("Gender :");
		lblgen.setBounds(100, 340, 150, 25);
		lblgen.setFont(new Font("lblcpwd",Font.BOLD,23));
		lblgen.setForeground(Color.WHITE);
		lblbg.add(lblgen);
		JRadioButton rdbmale=new JRadioButton("Male");
		rdbmale.setBounds(250, 340, 80, 25);
		lblbg.add(rdbmale);
		JRadioButton rdbfemale=new JRadioButton("Female");
		rdbfemale.setBounds(340, 340, 80, 25);
		lblbg.add(rdbfemale);	
		ButtonGroup grp=new ButtonGroup();
		grp.add(rdbmale);
		grp.add(rdbfemale);
		
		
		JLabel lbldob=new JLabel("DOB :");
		lbldob.setBounds(100, 380, 150, 25);
		lbldob.setFont(new Font("lbldob",Font.BOLD,23));
		lbldob.setForeground(Color.WHITE);
		lblbg.add(lbldob);
		JTextField txt7=new JTextField();
		txt7.setBounds(250, 380, 110, 25);
		lblbg.add(txt7);
	
		JLabel lblmb=new JLabel("Mobile No :");
		lblmb.setBounds(100, 420, 150, 25);
		lblmb.setFont(new Font("lblmb",Font.BOLD,23));
		lblmb.setForeground(Color.WHITE);
		lblbg.add(lblmb);
		JTextField txt8=new JTextField();
		txt8.setBounds(250, 420, 110, 25);
		lblbg.add(txt8);

		
		JLabel lblemail=new JLabel("Email :");
		lblemail.setBounds(100, 460, 150, 25);
		lblemail.setFont(new Font("lblemail",Font.BOLD,23));
		lblemail.setForeground(Color.WHITE);
		lblbg.add(lblemail);
		JTextField txt9=new JTextField();
		txt9.setBounds(250, 460, 110, 25);
		lblbg.add(txt9);
		
		
		JLabel lbladd=new JLabel("Address :");
		lbladd.setBounds(100, 500, 150, 25);
		lbladd.setFont(new Font("lbladd",Font.BOLD,23));
		lbladd.setForeground(Color.WHITE);
		lblbg.add(lbladd);
		JTextField txt10=new JTextField();
		txt10.setBounds(250, 500, 110, 25);
		lblbg.add(txt10);
	
		JLabel lblt=new JLabel("Time :");
		lblt.setBounds(100, 540, 150, 25);
		lblt.setFont(new Font("lblroll",Font.BOLD,23));
		lblt.setForeground(Color.WHITE);
		lblbg.add(lblt);
		JTextField txt11=new JTextField();
		txt11.setBounds(250, 540, 110, 25);
		lblbg.add(txt11);
		
		ImageIcon icn1=new ImageIcon("button_insert.png");
	    JButton btn1=new JButton(icn1); 
	    btn1.setBounds(100, 600, 110, 30);
	    lblbg.add(btn1);
	    btn1.addActionListener(new ActionListener()
	    {

			
			public void actionPerformed(ActionEvent arg0) 
			{
				String intcnc,strname,struname,strpwd,strcpwd,strsem,strgender = null,strdob,stremail,stradd,strtime;
				int strrol;
				strrol=Integer.parseInt(txt1.getText());
			    strname=txt2.getText();
			    struname=txt3.getText();
			    strpwd=String.valueOf(txt4.getText());
			    strcpwd=String.valueOf(txt5.getText());
			    strsem=String.valueOf(txt6.getText());
			    strdob=String.valueOf(txt7.getText());
			    intcnc=txt8.getText();
			    stremail=txt9.getText();
			    stradd=String.valueOf(txt10.getText());
			    strtime=String.valueOf(txt11.getText());
			    
			    if(rdbmale.isSelected())
				{
					strgender="Male";
				}
				else if(rdbfemale.isSelected())
				{
					strgender="Female";
				}
			    
			    if(String.valueOf(strrol).trim().isEmpty()||struname.trim().isEmpty()||strname.trim().isEmpty()
			    		||stradd.trim().isEmpty()||stremail.trim().isEmpty()
			    		||strpwd.trim().isEmpty()||strcpwd.trim().isEmpty()
						||strdob.trim().isEmpty()||strsem.trim().isEmpty()
						||strtime.trim().isEmpty()||String.valueOf(intcnc).trim().isEmpty()	)
				{
					JOptionPane.showMessageDialog(null, "ENTER DETAILS IN BLANK FIELDS");
				}
				
			    else if(intcnc.length()!=10||obj1.isNumber(intcnc))
				{
					JOptionPane.showMessageDialog(null, "ENTER VALID MOBILE NO");
				}
			    else if(obj1.isSelectRadioButton(rdbmale, rdbfemale))
				{
					JOptionPane.showMessageDialog(null, "SELECT VALID GENDER");
				}
			    else
			    {
			    	obj.insertintotblStudent(strrol,strname,struname,strpwd,strcpwd,strsem,strgender,strdob,intcnc,stremail,stradd,strtime);
					
			    }
				
			}
	    	
	    });
		
		ImageIcon icn2=new ImageIcon("button_update.png");
	    JButton btn2=new JButton(icn2); 
	    btn2.setBounds(230, 600, 110, 30);
        lblbg.add(btn2);
        btn2.addActionListener(new ActionListener()
	    {

			
			public void actionPerformed(ActionEvent arg0) 
			{
				String strrol,strname,struname,strpwd,strcpwd,strsem,strgender = null,strdob,strmbno,stremail,stradd,strtime;
				
				strrol=String.valueOf(txt1.getText());
			    strname=txt2.getText();
			    struname=txt3.getText();
			    strpwd=String.valueOf(txt4.getText());
			    strcpwd=String.valueOf(txt5.getText());
			    strsem=String.valueOf(txt6.getText());
			    strdob=String.valueOf(txt7.getText());
			    strmbno=String.valueOf(txt8.getText());
			    stremail=txt9.getText();
			    stradd=String.valueOf(txt10.getText());
			    strtime=String.valueOf(txt11.getText());
			    
			    if(rdbmale.isSelected())
				{
					strgender="Male";
				}
				else if(rdbfemale.isSelected())
				{
					strgender="Female";
				}

				obj.updateintotblStudent(strrol,strname,struname,strpwd,strcpwd,strsem,strgender,strdob,strmbno,stremail,stradd,strtime);
			}
	    	
	    });  
        
        ImageIcon icn3=new ImageIcon("button_delete.png");
        JButton btn3=new JButton(icn3); 
        btn3.setBounds(360, 600, 110, 30);
        lblbg.add(btn3);
        btn3.addActionListener(new ActionListener()
	    {

			
			public void actionPerformed(ActionEvent arg0) 
			{
				String strrol;
				
				strrol=String.valueOf(txt1.getText());
				obj.deletefromtblStudent(strrol);
			}
	    	
	    });
       
        
        ImageIcon icn4=new ImageIcon("button_view.png");
        JButton btn4=new JButton(icn4); 
        btn4.setBounds(490, 600, 100, 30);
        lblbg.add(btn4);
        btn4.addActionListener(new ActionListener()
	    {

			
			public void actionPerformed(ActionEvent arg0) 
			{
				studenttable frm= new studenttable();
				dispose();
			
			}
	    	
	    });
        
        ImageIcon icn6=new ImageIcon("button_set-time.png");
        JButton btnst=new JButton(icn6);
		  btnst.setBounds(600,600,100,30);
		  lblbg.add(btnst);
	
		  btnst.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) 
			{
				//studenttable1 frm= new studenttable1();
				timesetwrshptbl frm=new timesetwrshptbl();
				dispose();
			}
			  
		  });

		  
        ImageIcon icn5=new ImageIcon("button.png");
	    JButton btnbck=new JButton(icn5);
	    btnbck.setBounds(1190,40, 45, 35);
	    lblbg.add(btnbck);
	    btnbck.addActionListener(new ActionListener(){
	    	
	    	
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
			 	 
			 	StaffLogin frm=new StaffLogin();
			 	dispose();
			}
	    });
        
		setTitle("Details");
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setVisible(true);
        setDefaultCloseOperation(2);
    }
}
