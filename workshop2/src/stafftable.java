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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class stafftable extends JFrame
{
	Container c=null;
	JTable tbl;
	JPanel pnl;
	DBhandler obj =new DBhandler();
	public stafftable()
	{
		
		c=getContentPane();
		setLayout(null);
		
		pnl=new JPanel();
		pnl.setLayout(null);
		pnl.setBounds(50, 200, 700, 450);
		pnl.setBackground(Color.RED);
		c.add(pnl);
		
		JLabel lbl[]=new JLabel[8];
		int x=50,y=10;
		String lblnm[]={"Id","Name", "Password" ,"Gender" ,"Dob" ,"MobileNo ","Pincode" ,"Email"};
		for(int i=0;i<8;i++)
		{
			lbl[i]=new JLabel(lblnm[i]);
			lbl[i].setBounds(x, y, 150, 23);
			y=y+50;
			lbl[i].setFont(new Font("lbl[i]",Font.BOLD,20));
			lbl[i].setForeground(Color.BLACK);
			pnl.add(lbl[i]);

			
		}
		JLabel lbl1[]=new JLabel[8];
		int x1=250,y1=10;
		for(int i=0;i<8;i++)
		{
			lbl1[i]=new JLabel();
			lbl1[i].setBounds(x1, y1, 250, 23);
			y1=y1+50;
			lbl1[i].setFont(new Font("lbl1[i]",Font.BOLD,20));
			lbl1[i].setForeground(Color.BLACK);
			pnl.add(lbl1[i]);

			
		}
		
		tbl=obj.getstafftable();
		tbl.setBounds(150, 150, 1500, 100);
		tbl.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent evt)
			{
				int row=tbl.rowAtPoint(evt.getPoint());	
                int col=tbl.columnAtPoint(evt.getPoint());
                
                String id=(String)tbl.getValueAt(row, 0);
                String nm=(String)tbl.getValueAt(row, 1);
                String pwd=(String)tbl.getValueAt(row, 2);
                String gen=(String)tbl.getValueAt(row, 3);
                String dob=(String)tbl.getValueAt(row, 4);
                String mbno=(String)tbl.getValueAt(row, 5);
                String pncd=(String)tbl.getValueAt(row, 6);
                String email=(String)tbl.getValueAt(row, 7);
                lbl1[0].setText(id);
                lbl1[1].setText(nm);
                lbl1[2].setText(pwd);
                lbl1[3].setText(gen);
                lbl1[4].setText(dob);
                lbl1[5].setText(mbno);
                lbl1[6].setText(pncd);
                lbl1[7].setText(email);
			}
		});
		ImageIcon icn4=new ImageIcon("button.png");
	    JButton btnbck=new JButton(icn4);
	    btnbck.setBounds(1190,40, 45, 35);
	    add(btnbck);
	    btnbck.addActionListener(new ActionListener(){
	    	
	    	
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
			 	staffframe frm7 =new staffframe();
			 	 dispose();
				
			}
	    });
		
		JScrollPane jsp=new  JScrollPane(tbl);
		jsp.setBounds(50, 50, 700, 100);
	    jsp.setPreferredSize(new Dimension(580,400));
	    c.add(jsp);
		
		setVisible(true);
		setTitle("Staff Details");
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setDefaultCloseOperation(2);
		
	}

}
