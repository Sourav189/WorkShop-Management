import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.LinkedList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class staffframe  extends JFrame{
Container c=null;

JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;

public staffframe()
    {
      c=getContentPane();
      setLayout(null);

      DBhandler obj1=new DBhandler();
      ImageIcon icn=new ImageIcon("Blackbrickstaff.jpg");
      JLabel lblBg=new JLabel(icn);
      lblBg.setSize(Toolkit.getDefaultToolkit().getScreenSize());
      c.add(lblBg);
      

      JLabel lbluid=new JLabel("User Id :");
      lbluid.setBounds(100,100,100,20);
      lblBg.add(lbluid);
      lbluid.setFont(new Font("lbluid",Font.BOLD,22));
      lbluid.setForeground(Color.WHITE);
      JTextField txt1 =new JTextField();
      txt1.setBounds(250,100,100,20);
      lblBg.add(txt1);
      
      
     
      
      
      
      JLabel lblnm=new JLabel("Name :");
      lblnm.setBounds(100,140,100,20);
      lblBg.add(lblnm);
      lblnm.setFont(new Font("lbluid",Font.BOLD,22));
      lblnm.setForeground(Color.WHITE);
      txt2 =new JTextField();
      txt2.setBounds(250,140,100,20);
      lblBg.add(txt2);
     
      
      JLabel lblpwd=new JLabel("Password :");
      lblpwd.setBounds(100,180,120,20);
      lblBg.add(lblpwd);
      lblpwd.setFont(new Font("lbluid",Font.BOLD,22));
      lblpwd.setForeground(Color.WHITE);
      JTextField txt3 =new JTextField();
      txt3.setBounds(250,180,100,20);
      lblBg.add(txt3);
     
      
      JLabel lblgnd=new JLabel("Gender :");
      lblgnd.setBounds(100,220,100,20);
      lblBg.add(lblgnd);
      lblgnd.setFont(new Font("lblgnd",Font.BOLD,22));
      lblgnd.setForeground(Color.WHITE);
      JRadioButton rdbmale=new JRadioButton("Male");
      rdbmale.setBounds(250, 220, 80, 20);
      lblBg.add(rdbmale);
      JRadioButton rdbfemale=new JRadioButton("Female");
      rdbfemale.setBounds(350, 220, 80, 20);
      lblBg.add(rdbfemale);
      ButtonGroup grp=new ButtonGroup();
      grp.add(rdbfemale);grp.add(rdbmale);
     
      
      JLabel lbld=new JLabel("DoB :");
      lbld.setBounds(100,260,100,20);
      lblBg.add(lbld);
      lbld.setFont(new Font("lbld",Font.BOLD,22));
      lbld.setForeground(Color.WHITE);
      JTextField txt4 =new JTextField();
      txt4.setBounds(250,260,100,20);
      lblBg.add(txt4);
     
      
      JLabel lblmb=new JLabel("Mobile no :");
      lblmb.setBounds(100,300,120,20);
      lblBg.add(lblmb);
      lblmb.setFont(new Font("lblmb",Font.BOLD,22));
      lblmb.setForeground(Color.WHITE);
      JTextField txt5 =new JTextField();
      txt5.setBounds(250,300,100,20);
      lblBg.add(txt5);
     
      
      JLabel lblpc=new JLabel("Pincode :");
      lblpc.setBounds(100,340,100,20);
      lblBg.add(lblpc);
      lblpc.setFont(new Font("lblpc",Font.BOLD,22));
      lblpc.setForeground(Color.WHITE);
      JTextField txt6 =new JTextField();
      txt6.setBounds(250,340,100,20);
      lblBg.add(txt6);
      
      JLabel lbled=new JLabel("Email Id :");
      lbled.setBounds(100,380,100,20);
      lblBg.add(lbled);
      lbled.setFont(new Font("lbled",Font.BOLD,22));
      lbled.setForeground(Color.WHITE);
      JTextField txt7 =new JTextField();
      txt7.setBounds(250,380,100,20);
      lblBg.add(txt7);
      
      ImageIcon icn1=new ImageIcon("button_insert.png");
      JButton btn1=new JButton(icn1); 
      btn1.setBounds(100, 460, 110, 30);
      lblBg.add(btn1);
      btn1.addActionListener(new ActionListener()
      {

		public void actionPerformed(ActionEvent arg0) 
		{
			String strid,strname,strpwd,strgender = null,strdob,strmbno,strpin,stremail;
			
			strid=String.valueOf(txt1.getText());
		    strname=txt2.getText();
		    strpwd=String.valueOf(txt3.getText());
		    strdob=String.valueOf(txt4.getText());
		    strmbno=String.valueOf(txt5.getText());
		    strpin=String.valueOf(txt6.getText());
		    stremail=txt7.getText();
			if(rdbmale.isSelected())
			{
				strgender="Male";
			}
			else if(rdbfemale.isSelected())
			{
				strgender="Female";
			}
			if(strid.trim().isEmpty()||strname.trim().isEmpty()||strpwd.trim().isEmpty()
				||stremail.trim().isEmpty()||strdob.trim().isEmpty()
				||strmbno.trim().isEmpty()
					||strpin.trim().isEmpty()	)
			{
				JOptionPane.showMessageDialog(null, "ENTER DETAILS IN BLANK FIELDS");
			}
			
			else if(strmbno.length()!=10)
			{
				JOptionPane.showMessageDialog(null, "ENTER VALID MOBILE NO");
			}
			else
			{
				obj1.Insertintotblstaff(strid,strname,strpwd,strgender,strdob,strmbno,strpin,stremail);
			}
			
		}
    	  
      });

      
      
      ImageIcon icn2=new ImageIcon("button_update.png");
      JButton btn2=new JButton(icn2); 
      btn2.setBounds(230, 460, 110, 30);
      lblBg.add(btn2);
      btn2.addActionListener(new ActionListener()
   {

		
		public void actionPerformed(ActionEvent arg0)
		{
             String strid,strname,strpwd,strgender,strdob,strmbno,strpin,stremail;
			
			strid=String.valueOf(txt1.getText());
		    strname=txt2.getText();
		    strpwd=String.valueOf(txt3.getText());
		    strdob=String.valueOf(txt4.getText());
		    strmbno=String.valueOf(txt5.getText());
		    strpin=String.valueOf(txt6.getText());
		    stremail=txt7.getText();
		strgender=null;
		    if(rdbmale.isSelected())
	     	{
				strgender="Male";
			}
			else if(rdbfemale.isSelected())
			{
				strgender="Female";
			}
			
			obj1.Updatetblstaff(strid,strname,strpwd,strgender,strdob,strmbno,strpin,stremail);
		}

    });
      ImageIcon icn3=new ImageIcon("button_delete.png");
      JButton btn3=new JButton(icn3); 
      btn3.setBounds(360, 460, 110, 30);
      lblBg.add(btn3);
      btn3.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			String strid;
			strid=txt1.getText();
			
			obj1.deletefromtblstaff(strid);
		}
    	  
      });   
      
      ImageIcon icn4=new ImageIcon("button_view.png");
      JButton btn4=new JButton(icn4); 
      btn4.setBounds(490, 460, 100, 30);
      lblBg.add(btn4);
      btn4.addActionListener(new ActionListener(){

		
		public void actionPerformed(ActionEvent arg0) 
		{
			stafftable lst=new stafftable();
			dispose();
		}
    	  
      });
      
      
      
      JComboBox cbouid=new JComboBox();
      cbouid.setBounds(400,100,100,20);
      lblBg.add(cbouid);
      LinkedList<staff> lst=obj1.disptblstaff();
      for(staff s:lst)   
      {
    	  cbouid.addItem(s.getStrid());
      }
      cbouid.addItemListener(new ItemListener(){

		@Override
		public void itemStateChanged(ItemEvent arg0) 
		{
			String strid=(String) cbouid.getSelectedItem();
			staff s1=obj1.getstaffrow(strid);
			txt1.setText(s1.getStrid());
			txt2.setText(s1.getStrname());
			txt3.setText(s1.getStrpwd());
			txt4.setText(s1.getStrdob());
			txt5.setText(s1.getStrmbno());
			txt6.setText(s1.getStrpin());
			txt7.setText(s1.getStremail());
			if(s1.getStrgender().equals("MALE"))
			{
				rdbmale.setSelected(true);
				rdbfemale.setSelected(false);
			}
			else
			{
				rdbfemale.setSelected(true);
				rdbmale.setSelected(false);
			}
		
			setTitle("strid");
		}
    	  
      });
      ImageIcon icn5=new ImageIcon("button.png");
	    JButton btnbck=new JButton(icn5);
	    btnbck.setBounds(1190,40, 45, 35);
	    c.add(btnbck);
	    btnbck.addActionListener(new ActionListener(){
	    	
	    	
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
			 	 
			 	buttonframe frm=new buttonframe();
			 	dispose();
			}
	    });
      setTitle("Staff");
      setSize(Toolkit.getDefaultToolkit().getScreenSize());
      setVisible(true);
      setDefaultCloseOperation(2);
    }
}
