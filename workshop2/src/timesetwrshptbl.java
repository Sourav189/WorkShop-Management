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

public class timesetwrshptbl extends JFrame
{
	JTable tbl;
    JPanel pnl;
    Container c=null;
  
    JLabel lbl[]=new JLabel[12];
  public timesetwrshptbl()
     {
	    
	    c=getContentPane();
	    c.setLayout(null);
	    DBhandler obj=new DBhandler();
	    
	    
	    
	    pnl=new JPanel();
	    pnl.setLayout(null);
	    pnl.setBackground(Color.GREEN);
	    pnl.setBounds(50,200,700,475);
	    c.add(pnl);
	  
	    
	    String lblnm[]={"Wid :","WName :","Time :","Duration :","Date :","Paid :","Limit :","Faculty :","Seat Available :"
	    		,"Amount :","Day :","Status :"};
	    int x=50,y=10;
	    
	    for(int i=0;i<12;i++)
	    {
	      lbl[i]=new JLabel(lblnm[i] );
	      lbl[i].setBounds(x, y, 150, 20);
	      y=y+40;
	      lbl[i].setFont(new Font("lbl[i]",Font.BOLD,20));
	      lbl[i].setForeground(Color.BLACK);
	      pnl.add(lbl[i]);
	    	
	    }
	    
	    JLabel lbll[]=new JLabel[12];
	    int y1=10;
	    for(int z=0;z<12;z++)
	    {
	    	
	    	lbll[z]=new JLabel();
	    	lbll[z].setBounds(250,y1,150,23);
	        y1=y1+40;
	        lbll[z].setFont(new Font("lbl[z]",Font.BOLD,20));
		    lbll[z].setForeground(Color.BLACK);
		    pnl.add(lbll[z]);
	    
	    }
	    	    
	    tbl=obj.getWorkshoptable();
	    tbl.setRowHeight(20);
	    tbl.setBounds(150, 150, 1000, 100);
        tbl.addMouseListener(new MouseAdapter()
        {
        	public void mouseClicked(MouseEvent evt)
        	{
                int row=tbl.rowAtPoint(evt.getPoint());	
                int col=tbl.columnAtPoint(evt.getPoint());
                String status="APPROVED";
            
                String wid,WName, Time,duration, Date, Paid,Limit,Faculty,SeatAvailable
	    		,Amount,Day ,Status ;
                wid=(String)tbl.getValueAt(row, 0);
                WName=(String)tbl.getValueAt(row, 1);
                Time=(String)tbl.getValueAt(row, 2);
                duration=(String)tbl.getValueAt(row, 3);
                Date=(String)tbl.getValueAt(row, 4);
                Paid=(String)tbl.getValueAt(row, 5);
                Limit=(String)tbl.getValueAt(row, 6);
                Faculty=(String)tbl.getValueAt(row, 7);
                SeatAvailable=(String)tbl.getValueAt(row, 8);
                Amount=(String)tbl.getValueAt(row, 9);
	    	    Day=(String)tbl.getValueAt(row, 10);
	    		Status=(String)tbl.getValueAt(row, 11);
                
	    		
	    		lbll[0].setText(wid);
                lbll[1].setText(WName);
                lbll[2].setText(Time);
                lbll[3].setText(duration);
                lbll[4].setText(Date);
                lbll[5].setText(Paid);
                lbll[6].setText(Limit);
                lbll[7].setText(Faculty);
                lbll[8].setText(SeatAvailable);
                lbll[9].setText(Amount);
                lbll[10].setText(Day);
                lbll[11].setText(Status);        
        	
JFrame frm1=new  JFrame();
                
                
                frm1.setBounds(200,200,400,400);
                frm1.setLayout(null);
                frm1.setVisible(true);
                frm1.setTitle("Set Time");
                frm1.setDefaultCloseOperation(2);
                
                
                JTextField txt=new JTextField();
                txt.setBounds(100, 100, 100, 20);
                frm1.add(txt); 
                
                
                JButton btn=new JButton("Set");
                btn.setBounds(100, 170, 100, 20);
                frm1.add(btn);
                btn.addActionListener(new ActionListener(){

					
					public void actionPerformed(ActionEvent arg0) 
					{
						String id,time;
		                id=(String)tbl.getValueAt(row, 0);
		                time=txt.getText();	
		                obj.updatetime(time, id);
		               if(time.trim().isEmpty())
		               {
		                JOptionPane.showMessageDialog(null, "Enter The Time");
		               }
		               else
		               {
		            	   JOptionPane.showMessageDialog(null, "Time Updated");
		            	   frm1.dispose();
		            	   dispose();
		            	   timesetwrshptbl frm=new timesetwrshptbl();
		               }
					} 
					});

        	
        	
        	
        	
        	
        	
        	}
        	});
        ImageIcon icn4=new ImageIcon("button.png");
	    JButton btnbck=new JButton(icn4);
	    btnbck.setBounds(1190,40, 45, 35);
	    c.add(btnbck);
	    btnbck.addActionListener(new ActionListener(){
	    	
	    	
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
			 	 dispose();
			 	StaffLogin frm=new StaffLogin();;
			}
	    });
	  
	  JScrollPane jsp=new  JScrollPane(tbl);
	  jsp.setBounds(50, 50, 700, 100);
	  jsp.setPreferredSize(new Dimension(580,400));
	  c.add(jsp);
	  
	
	    setTitle("Admin");
        setVisible(true);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setDefaultCloseOperation(2);
    }

}
