import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class buttonframe extends JFrame {

	public buttonframe()
	{
		Container c=null;
		c=getContentPane();
		setLayout(null);
		
		ImageIcon icn=new ImageIcon("wallpaper2you_22674.jpg");
		JLabel lblBG =new JLabel(icn);
		lblBG.setSize(Toolkit.getDefaultToolkit().getScreenSize());		
		c.add(lblBG);
		
		
		
		JButton btnaw=new JButton("Approved Workshop");
		btnaw.setBounds(230, 230, 200, 50);
		lblBG.add(btnaw);
		btnaw.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				
				approvedtbl frm=new approvedtbl();
				dispose();
			}
			
		});
		JButton btnpw=new JButton("Pending Workshop");
		btnpw.setBounds(470, 230, 200, 50);
		lblBG.add(btnpw);
		btnpw.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				pendingtbl frm=new pendingtbl();
				dispose();
			}
			
		});
		
		
		JButton btnsd=new JButton("Staff Details");
		btnsd.setBounds(710, 230, 200, 50);
		lblBG.add(btnsd);
		btnsd.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0)
			{
				
			   staffframe frm=new staffframe();
			   dispose();
			}
			
		});
		
		JButton btnwd=new JButton("Workshop Details ");
		btnwd.setBounds(950, 230, 200, 50);
		lblBG.add(btnwd);
		btnwd.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent arg0) 
			{
				
				Workshoptable frm=new Workshoptable();
				dispose();
			}
		
		});
		
		ImageIcon icn4=new ImageIcon("button.png");
	    JButton btnbck=new JButton(icn4);
	    btnbck.setBounds(1190,40, 45, 35);
	    lblBG.add(btnbck);
	    btnbck.addActionListener(new ActionListener(){
	    	
	    	
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
			 	
			 	adminframe frm=new adminframe();
			 	 dispose();
			}
	    });
		
		
		setTitle("Admin");
	    setVisible(true);
	    setSize(Toolkit.getDefaultToolkit().getScreenSize());
	    setDefaultCloseOperation(2);
	}
	
	
	
}
