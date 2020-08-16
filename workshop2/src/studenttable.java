import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class studenttable extends JFrame 
{

	JTable tbl;
    JPanel pnl;
    Container c=null;
    
	public studenttable()
	{
		c=getContentPane();
	    setLayout(null);
	    DBhandler obj=new DBhandler();
	    
	    pnl=new JPanel();
		pnl.setLayout(null);
		pnl.setBounds(50, 200, 700, 475);
		pnl.setBackground(Color.BLUE);
		c.add(pnl);
		
		JLabel lbl[]=new JLabel[12];
		int x=50,y=10;
		String lblnm[]={"Rollno","Name","UName", "Password","CPassword" ,"Sem","Gender" ,"Dob" ,"MobileNo " ,"Email","Address","Time"};
		for(int i=0;i<12;i++)
		{
			lbl[i]=new JLabel(lblnm[i]);
			lbl[i].setBounds(x, y, 150, 23);
			y=y+40;
			lbl[i].setFont(new Font("lbl[i]",Font.BOLD,20));
			lbl[i].setForeground(Color.BLACK);
			pnl.add(lbl[i]);

			
		}
		JLabel lbl1[]=new JLabel[12];
		int x1=250,y1=10;
		for(int i=0;i<12;i++)
		{
			lbl1[i]=new JLabel();
			lbl1[i].setBounds(x1, y1, 250, 23);
			y1=y1+40;
			lbl1[i].setFont(new Font("lbl1[i]",Font.BOLD,20));
			lbl1[i].setForeground(Color.BLACK);
			pnl.add(lbl1[i]);

			
		}
		
	    tbl=obj.getstudenttable();
	    tbl.setBounds(150, 150, 1500, 1000);
	    tbl.addMouseListener(new MouseAdapter()
        {
        	public void mouseClicked(MouseEvent evt)
        	{
                int row=tbl.rowAtPoint(evt.getPoint());	
                int col=tbl.columnAtPoint(evt.getPoint());
        	    
                String rol=(String)tbl.getValueAt(row, 0);
                String nm=(String)tbl.getValueAt(row, 1);
                String unm=(String)tbl.getValueAt(row, 2);
                String pw=(String)tbl.getValueAt(row, 3);
                String cpw=(String)tbl.getValueAt(row, 4);
                String sem=(String)tbl.getValueAt(row, 5);
                String gen=(String)tbl.getValueAt(row, 6);
                String dob=(String)tbl.getValueAt(row, 7);
                String mb=(String)tbl.getValueAt(row, 8);
                String email=(String)tbl.getValueAt(row, 9);
                String add=(String)tbl.getValueAt(row, 10);
                String time=(String)tbl.getValueAt(row, 11);
                
                lbl1[0].setText(rol);
                lbl1[1].setText(nm);
                lbl1[2].setText(unm);
                lbl1[3].setText(pw);
                lbl1[4].setText(cpw);
                lbl1[5].setText(sem);
                lbl1[6].setText(gen);
                lbl1[7].setText(dob);
                lbl1[8].setText(mb);
                lbl1[9].setText(email);
                lbl1[10].setText(add);
                lbl1[11].setText(time);
              
        	}
        	
        });
        	  
	    ImageIcon icn1=new ImageIcon("button.png");
	    JButton btnbck=new JButton(icn1);
	    btnbck.setBounds(1190,40, 45, 35);
	    c.add(btnbck);
	    btnbck.addActionListener(new ActionListener(){
	    	
	    	
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
			 	
			 	Studentdtl frm=new Studentdtl();
			 	 dispose();
			}
	    });
	  
	  
	  JScrollPane jsp=new  JScrollPane(tbl);
	  jsp.setBounds(50, 50, 700, 100);
	  jsp.setPreferredSize(new Dimension(580,400));
	  c.add(jsp);
	  
	
	    setTitle("Student");
        setVisible(true);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setDefaultCloseOperation(2);
	}
}
