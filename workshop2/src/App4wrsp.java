import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class App4wrsp extends JFrame 

{
	Container c=null;
	public App4wrsp ()
	{
		setLayout(null);
	    c=getContentPane();
	    DBhandler obj=new DBhandler();
	    isvalid obj1=new isvalid();
	    
	    ImageIcon icn=new ImageIcon("trapremixmacbook.jpg");
		JLabel lblBg=new JLabel(icn);
		lblBg.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		c.add(lblBg);
			    
		JLabel lbl=new JLabel("Apply For Workshop");
		lbl.setBounds(200, 30, 300, 40);
		lblBg.add(lbl);
		lbl.setForeground(Color.WHITE);
		lbl.setFont(new Font("lbl",Font.BOLD,28));
		
		
		
	    JLabel lblworkshopid=new JLabel("Workshop Id");
		lblworkshopid.setBounds(50, 100, 170, 20);
		lblBg.add(lblworkshopid);
		lblworkshopid.setForeground(Color.WHITE);
		lblworkshopid.setFont(new Font("lblworkshopid",Font.BOLD,18));
		JTextField txtworkshopid=new  JTextField();
		txtworkshopid.setBounds(270,100,100,20);
    	lblBg.add(txtworkshopid);
	    
	    JLabel lblworkshopname=new JLabel("Workshop Name");
		lblworkshopname.setBounds(50, 130, 170, 20);
		lblBg.add(lblworkshopname);
		lblworkshopname.setForeground(Color.WHITE);
		lblworkshopname.setFont(new Font("lblworkshopname",Font.BOLD,18));
		JTextField txtworkshopname=new  JTextField();
		txtworkshopname.setBounds(270,130,100,20);
    	lblBg.add(txtworkshopname);
    	
	    JLabel lbltime=new JLabel("Time");
		lbltime.setBounds(50, 160, 100, 20);
		lblBg.add(lbltime);
		lbltime.setForeground(Color.WHITE);
		lbltime.setFont(new Font("lbltime",Font.BOLD,18));
		JTextField txttime=new  JTextField();
		txttime.setBounds(270,160,100,20);
    	lblBg.add(txttime);
    	

	    JLabel lbldur=new JLabel("Duration");
		lbldur.setBounds(50, 190, 100, 20);
		lblBg.add(lbldur);
		lbldur.setForeground(Color.WHITE);
		lbldur.setFont(new Font("lbldur",Font.BOLD,18));
		JTextField txtdur=new  JTextField();
		txtdur.setBounds(270,190,100,20);
    	lblBg.add(txtdur);
		
	    JLabel lbldate=new JLabel("Date");
		lbldate.setBounds(50, 220, 100, 20);
		lblBg.add(lbldate);
		lbldate.setForeground(Color.WHITE);
		lbldate.setFont(new Font("lbldate",Font.BOLD,18));
		JTextField txtdate=new  JTextField();
	    txtdate.setBounds(270,220,100,20);
    	lblBg.add(txtdate);
    	
	    JLabel lblpaid=new JLabel("Paid");
	    lblpaid.setBounds(50, 250, 100, 20);
		lblBg.add(lblpaid);
		lblpaid.setForeground(Color.WHITE);
		lblpaid.setFont(new Font("lblpaid",Font.BOLD,18));
		JRadioButton rdbyes=new JRadioButton("Yes");
		rdbyes.setBounds(270, 250, 50, 20);
		lblBg.add(rdbyes);
		JRadioButton rdbno=new JRadioButton("No");
		rdbno.setBounds(330, 250, 50, 20);
		lblBg.add(rdbno);
		ButtonGroup grp=new ButtonGroup();
		grp.add(rdbno);
		grp.add(rdbyes);
		
		
		
	    JLabel lbllimit=new JLabel("Limit");
	    lbllimit.setBounds(50, 280, 100, 20);
		lblBg.add(lbllimit);
		lbllimit.setForeground(Color.WHITE);
		lbllimit.setFont(new Font("lbllimit",Font.BOLD,18));
		JTextField txtlimit=new  JTextField();
		txtlimit.setBounds(270,280,100,20);
    	lblBg.add(txtlimit);
    	
		JLabel lblfac=new JLabel("Faculty");
		lblfac.setBounds(50, 310, 100, 20);
		lblBg.add(lblfac);
		lblfac.setForeground(Color.WHITE);
		lblfac.setFont(new Font("lblfac",Font.BOLD,18));
		JTextField txtfac=new  JTextField();
		txtfac.setBounds(270,310,100,20);
    	lblBg.add(txtfac);
    	
		JLabel lblseat=new JLabel("Seat Available");
		lblseat.setBounds(50, 340, 170, 20);
		lblBg.add(lblseat);
		lblseat.setForeground(Color.WHITE);
		lblseat.setFont(new Font("lblseat",Font.BOLD,18));
		JTextField txtseat=new  JTextField();
		txtseat.setBounds(270,340,100,20);
    	lblBg.add(txtseat);
		
		JLabel lblamt=new JLabel("Amount");
		lblamt.setBounds(50, 370, 100, 20);
		lblBg.add(lblamt);
		lblamt.setForeground(Color.WHITE);
		lblamt.setFont(new Font("lblamt",Font.BOLD,18));
		JTextField txtamt=new  JTextField();
		txtamt.setBounds(270,370,100,20);
    	lblBg.add(txtamt);
		
		
		JLabel lblday=new JLabel("Day");
		lblday.setBounds(50, 400, 100, 20);
		lblBg.add(lblday);
		lblday.setForeground(Color.WHITE);
		lblday.setFont(new Font("lblday",Font.BOLD,18));

		JComboBox cbodays=new JComboBox();
		cbodays.setBounds(270,400,100,20);
		lblBg.add(cbodays);
	    cbodays.addItem("Monday");
	    cbodays.addItem("Tuesday");
	    cbodays.addItem("Wednesday");
	    cbodays.addItem("Thursday");
	    cbodays.addItem("Friday");
	    cbodays.addItem("Saturday");
	    cbodays.addItem("Sunday");
		
	    
	    ImageIcon icn2=new ImageIcon("insapp4wrsh1.png");
	    JButton btnins=new JButton(icn2);
	    btnins.setBounds(70,450, 100, 30);
	    lblBg.add(btnins);
	    btnins.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
			  String strworkshopid,strworkshopname,strtime,strdur,strdate,strpaid,strlimit,strfac
			  ,strseat,stramt,strday,strstatus="PENDING";
				
			  strworkshopid=txtworkshopid.getText();
			  strworkshopname=txtworkshopname.getText();
			  strtime=txttime.getText();
			  strdur=txtdur.getText();
			  strdate=txtdate.getText();
			                  ;
				if(rdbyes.isSelected())
				{
				strpaid="yes";
				}
				else
				{
					strpaid="no";	
				}
			  strlimit=txtlimit.getText();
			  strfac=txtfac.getText();
			  strseat=txtseat.getText();
			  stramt=txtamt.getText();
			  strday=String.valueOf(cbodays.getSelectedItem()); 
			
		if(strworkshopid.trim().isEmpty()||strworkshopname.trim().isEmpty()||
				strtime.trim().isEmpty()||strdur.trim().isEmpty()||
				strdate.trim().isEmpty()||strpaid.trim().isEmpty()||strlimit.trim().isEmpty()||
				strfac.trim().isEmpty()||
				  strseat.trim().isEmpty()||
				  stramt.trim().isEmpty()||strday.trim().isEmpty()|| strstatus.trim().isEmpty())
		{
			
			JOptionPane.showMessageDialog(null, "Enter All The Valid Details");
			
		}
		else if(obj1.isNumber(stramt)&&obj1.isSelectRadioButton(rdbno, rdbyes))
		{
			JOptionPane.showMessageDialog(null, "Enter Valid Amount or Select the Amount Option");

		}
		else
		{
			obj.insertintotblWorkshop(strworkshopid,strworkshopname,strtime,strdur,strdate,strpaid,strlimit,strfac
					  ,strseat,stramt,strday, strstatus);
			JOptionPane.showMessageDialog(null, "data inserted");

		}
			
			
			
			
			
			
				
			}
		
	    	
	    });
	    ImageIcon icn3=new ImageIcon("delapp4wrsh1.png");
	    JButton btndel=new JButton(icn3);
	    btndel.setBounds(180, 450, 100, 30);
	    lblBg.add(btndel);
	    btndel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				String strworkshopid;
				strworkshopid=txtworkshopid.getText();
				obj.deleteFromtblWorkshop(strworkshopid);
				JOptionPane.showMessageDialog(null, "data deleted");
				
				
			}
	    	
	    });
	    
	    
	    ImageIcon icn4=new ImageIcon("uppapp4wrsh1.png");
	    
	    JButton btnup=new JButton(icn4);
	    btnup.setBounds(290, 450, 100, 30);
	    lblBg.add(btnup);
	    btnup.addActionListener(new ActionListener()
	    {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				String strworkshopid,strworkshopname,strtime,strdur,strdate,strpaid,strlimit,strfac
				  ,strseat,stramt,strday;
				strworkshopid=txtworkshopid.getText();
				  strworkshopname=txtworkshopname.getText();
				  strtime=txttime.getText();
				  strdur=txtdur.getText();
				  strdate=txtdate.getText();
				  strlimit=txtlimit.getText();
				  strfac=txtfac.getText();
				  strseat=txtseat.getText();
				  stramt=txtamt.getText();
				  strday=String.valueOf(cbodays.getSelectedItem());
				  if(rdbyes.isSelected())
					{
					strpaid="yes";
					}
					else
					{
						strpaid="no";	
					}
						obj.updateintotblWorkshop(strworkshopid,strworkshopname,strtime,strdur,strdate,strpaid,strlimit,strfac
								  ,strseat,stramt,strday);
						JOptionPane.showMessageDialog(null, "data updated");
					
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
			 	 dispose();
			 	orgframe frm =new orgframe();
				
			}
	    
	    });
	    repaint();
	    setTitle("APPLY FOR WORKSHOP");
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setVisible(true);
		setDefaultCloseOperation(2);
	    
	}
	
	
	
}





