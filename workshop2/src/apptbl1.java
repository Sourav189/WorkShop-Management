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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class apptbl1 extends JFrame 
{
	JTable tbl;
    JPanel pnl;
    Container c=null;
      

  public apptbl1()
     {
	    c=getContentPane();
	    setLayout(null);
	    DBhandler obj=new DBhandler();
	    
	    pnl=new JPanel();
	    pnl.setLayout(null);
	    pnl.setBackground(Color.GREEN);
	    pnl.setBounds(50,200,700,450);
	    c.add(pnl);
	  
	    
	    String lblnm[]={"Wid :","WName :","Time :","Duration :","Date :","Paid :","Limit :","Faculty :","Seat Available :"
	    		,"Amount :","Day :","Status :"};
	    int x=50,y=10;
	    
	    JLabel lbl[]=new JLabel[11];
	    for(int i=0;i<11;i++)
	    {
	      lbl[i]=new JLabel(lblnm[i] );
	      lbl[i].setBounds(x, y, 150, 24);
	      y=y+40;
	      lbl[i].setFont(new Font("lbl[i]",Font.BOLD,20));
	      lbl[i].setForeground(Color.BLACK);
	      pnl.add(lbl[i]);
	    	
	    }
	    
	    JLabel lbll[]=new JLabel[11];
	    int y1=10;
	    for(int z=0;z<11;z++)
	    {
	    	
	    	lbll[z]=new JLabel();
	    	lbll[z].setBounds(250,y1,150,23);
	        y1=y1+40;
	        lbll[z].setFont(new Font("lbl[z]",Font.BOLD,20));
		    lbll[z].setForeground(Color.BLACK);
		    pnl.add(lbll[z]);
	    
	    }
	    	
	    tbl=obj.getappWorkshoptable();
	    tbl.setBounds(150, 150, 1500, 1000);
	    tbl.addMouseListener(new MouseAdapter()
        {
        	public void mouseClicked(MouseEvent evt)
        	{
                int row=tbl.rowAtPoint(evt.getPoint());	
                int col=tbl.columnAtPoint(evt.getPoint());
            
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
                lbll[2].setText(duration);
                lbll[3].setText(Date);
                lbll[4].setText(Paid);
                lbll[5].setText(Limit);
                lbll[6].setText(Faculty);
                lbll[7].setText(SeatAvailable);
                lbll[8].setText(Amount);
                lbll[9].setText(Day);
                lbll[10].setText(Status);
                
                JFrame frm1=new JFrame();
                 frm1.setLayout(null);
                 frm1.setVisible(true);
                 frm1.setSize(Toolkit.getDefaultToolkit().getScreenSize());
                 frm1.setDefaultCloseOperation(2);
                 
                 ImageIcon icn=new ImageIcon("studentlogin.jpg");
        		 JLabel lblBg=new JLabel(icn);
        	     lblBg.setSize(Toolkit.getDefaultToolkit().getScreenSize());
           	     frm1.add(lblBg);
        	    
           	     JLabel lbl[]=new JLabel[7];
        	     String lblnm[]={"Booking Id:","Workshop Id:","Roll No:","Amount :","Seat No:","Time:","Workshop Name:"};
        		int x=80,y=100;
        	     for(int i=0;i<7;i++)
        		{
        			lbl[i]=new JLabel(lblnm[i] );
        		      lbl[i].setBounds(x, y, 200, 25);
        		      y=y+50;
        		      lbl[i].setFont(new Font("lbl[i]",Font.BOLD,23));
        		      lbl[i].setForeground(Color.WHITE);
        		      lblBg. add(lbl[i]);
        		}
                JTextField txt[]=new JTextField[6];
        	    int y1[]={100,150,200,250,350,400};
        	    for(int z=0;z<6;z++)
        	    {
        	    	
        	    	txt[z]=new JTextField();
        	    	txt[z].setBounds(340,y1[z],110,25);
        	       
        	        
        	        lblBg.add(txt[z]);
        	    
        	    }       
        	    
        	    JComboBox cbostno=new JComboBox();
        	    cbostno.setBounds(340,300,110,25);
        	   lblBg.add(cbostno);
        	   for(int i=1;i<30;i++)
        	   {
        		   cbostno.addItem(i);
        	   }

        	    int id1=obj.getMaxbookingidTblEmp();
       		    txt[0].setText(String.valueOf(id1));
       		    txt[0].setEnabled(false);
        	
       		    txt[1].setText(wid);
        	    txt[2].setText(Studentlogin.id);
        	    txt[3].setText(Amount);
        	    txt[4].setText(Time);
        	    txt[5].setText(WName);
        	    
        	    JButton btnsub=new JButton("Submit");
        	    btnsub.setBounds(340,500, 100, 35);
        	    lblBg.add(btnsub);
        	    btnsub.addActionListener(new ActionListener(){
        	    	
        	    	
        			@Override
        			public void actionPerformed(ActionEvent arg0)
        			{
        			 String strbid,strwid,strrol,stramt,strsno,strtime,strbok,strwnm;
        				strbid=txt[0].getText();
        				strwid=String.valueOf(txt[1].getText());
        				strrol=String.valueOf(txt[2].getText());
        				stramt=txt[3].getText();
        				strsno=String.valueOf(cbostno.getSelectedItem());
        				strtime=String.valueOf(txt[4].getText());
        				strbok="False";
        				strwnm=txt[5].getText();
        				System.out.println(strbid+" "+strwid+" "+strrol+" "+stramt+" "+strsno+" "+strtime+" "+strbok+" "+strwnm);
        				obj.insertintotblBookingStatus(strbid,strwid,strrol,stramt,strsno,strtime,strbok,strwnm);
        			
        				cbostno.removeItemAt(cbostno.getSelectedIndex());
        			
        			}
        	    });
        	    
        	    
        	    ImageIcon icn1=new ImageIcon("button.png");
        	    JButton btnbck=new JButton(icn1);
        	    btnbck.setBounds(1190,40, 45, 35);
        	    lblBg.add(btnbck);
        	    btnbck.addActionListener(new ActionListener(){
        	    	
        	    	
        			@Override
        			public void actionPerformed(ActionEvent arg0)
        			{
        			 	 
        				 apptbl1 frm=new apptbl1();
        				 frm1.dispose();
        			}
        	    });
        	    
        	    
        	    
        	    dispose(); 
              
                }
        	});
	  	  
	  
	  JScrollPane jsp=new  JScrollPane(tbl);
	  jsp.setBounds(50, 50, 700, 100);
	  jsp.setPreferredSize(new Dimension(580,400));
	  c.add(jsp);
	  
	    ImageIcon icn1=new ImageIcon("button.png");
	    JButton btnbck=new JButton(icn1);
	    btnbck.setBounds(1190,40, 45, 35);
	    add(btnbck);
	    btnbck.addActionListener(new ActionListener(){
	    	
	    	
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				Studentlogin frm= new Studentlogin();
				 
				 dispose();
			}
	    });
	
	    setTitle("Approved");
        setVisible(true);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setDefaultCloseOperation(2);
    }

}
