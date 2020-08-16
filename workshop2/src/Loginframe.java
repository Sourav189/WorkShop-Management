import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Loginframe extends JFrame

{
	Container c=null;
	
	public Loginframe()
	{
	setLayout(null);
	c=getContentPane();
	 
	ImageIcon icn=new ImageIcon("download.png");
	JLabel lblBg=new JLabel(icn);
	lblBg.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	c.add(lblBg);
	
	
	JLabel lbl=new JLabel("Login As:");
	lbl.setForeground(Color.BLUE);
	lbl.setBounds(590,50, 200, 50);
	lblBg.add(lbl);
	lbl.setFont(new Font("lbl",Font.BOLD,40));
	
    JCheckBox chborg=new JCheckBox("Organisation");
    chborg.setForeground(Color.BLUE);
    chborg.setFont(new Font("chborg",Font.BOLD,20));
    chborg.setBounds(420,120,150,30);
    lblBg.add(chborg);
   

    JCheckBox chbadmin=new JCheckBox("Admin");
    chbadmin.setFont(new Font("chbadmin",Font.BOLD,20));
    chbadmin.setBounds(580,120,90,30);
    chbadmin.setForeground(Color.BLUE);
    lblBg.add(chbadmin);
   
    JCheckBox chbstaff=new JCheckBox("Staff");
    chbstaff.setForeground(Color.BLUE);
    chbstaff.setBounds(690,120,70,30);
    chbstaff.setFont(new Font("chbstaff",Font.BOLD,20));
    lblBg.add(chbstaff);

    JCheckBox chbstudent =new JCheckBox("Student");
    chbstudent.setForeground(Color.BLUE);
    chbstudent.setFont(new Font("chbstudent",Font.BOLD,20));
    chbstudent.setBounds(780,120,130,30);
    lblBg.add(chbstudent);
    
    
    ButtonGroup grp=new ButtonGroup();
    grp.add(chbstudent);grp.add(chbstaff);
    grp.add(chbadmin);grp.add(chborg);

    ImageIcon icn2=new ImageIcon("button_submit.png");

    JButton btnsub =new  JButton(icn2);
    btnsub.setBounds(620,180, 120, 40);
    lblBg.add(btnsub);
    btnsub.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		if(chborg.isSelected())
		{
			
			orgframe frm =new orgframe();
			dispose();
		}
		
		if(chbadmin.isSelected())
		{
	        
		    adminframe frm=new adminframe();	
		    dispose();
		}
		
		if(chbstaff.isSelected())
		{
		
			StaffLogin frm=new StaffLogin();
			dispose();
		}
		
		if(chbstudent.isSelected())
		{
			Studentlogin frm= new Studentlogin();
			dispose();
			
		}
		
		
		}
    	
    	
    	
    });
    
    
    setTitle("Login");
    setVisible(true);
    setDefaultCloseOperation(2);
    setSize(Toolkit.getDefaultToolkit().getScreenSize());  
    
}
}