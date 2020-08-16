import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import oracle.jdbc.pool.OracleDataSource;

public class DBhandler extends JFrame{

	
	public void insertintotblWorkshop(String strworkshopid,String strworkshopname,String strtime
			,String strdur,String strdate,String strpaid,String strlimit,String strfac
			  ,String strseat,String stramt,String strday, String strstatus)
	{
		Connection con=getDBcon();
		try {
			PreparedStatement stmt=con.prepareStatement("insert into tblWorkshop values(?,?,?,?,?,?,?,?,?,?,?,?)");
			stmt.setString(1, strworkshopid);
			stmt.setString(2, strworkshopname);
			stmt.setString(3, strtime);
			stmt.setString(4, strdur);
			stmt.setString(5, strdate);
			stmt.setString(6, strpaid);
			stmt.setString(7, strlimit);
			stmt.setString(8, strfac);
			stmt.setString(9, strseat);
			stmt.setString(10, stramt);
			stmt.setString(11, strday);
			stmt.setString(12, strstatus);
	stmt.executeUpdate();
		con.close();

System.out.println("Data inserted");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
	
	public void deleteFromtblWorkshop(String strworkshopid)
	{
		Connection con=getDBcon();
		try {
			PreparedStatement stmt=con.prepareStatement("delete from tblWorkshop where Wid=?");
			stmt.setString(1, strworkshopid);;
			
	    stmt.executeUpdate();
		con.close();
		System.out.println("Data deleted");
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}	

	public void updateintotblWorkshop(String strworkshopid,String strworkshopname,String strtime
			,String strdur,String strdate,String strpaid,String strlimit,String strfac
			  ,String strseat,String stramt,String strday)
	{
		Connection con=getDBcon();
		try {
			PreparedStatement stmt=con.prepareStatement("update tblWorkshop set WName=?,"
					+ "timee=?,dur=?, dt=?,isPaid=?,Limitt=?, Faculty=?,SeatAvailable=?,"
					+ " Amt=?,dayy=? where Wid=?");
			
			
			stmt.setString(1, strworkshopname);
			stmt.setString(2, strtime);
			stmt.setString(3, strdur);
			stmt.setString(4, strdate);
			stmt.setString(5, strpaid);
			stmt.setString(6, strlimit);
			stmt.setString(7, strfac);
			stmt.setString(8, strseat);
			stmt.setString(9, stramt);
			stmt.setString(10, strday);
			stmt.setString(11, strworkshopid);;
		
			
			 
			
			
			
			
			stmt.executeUpdate();
		con.close();
		System.out.println("Data updated");
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}	

	
	public boolean isValidUsrr(String strCid, String strPwd) {
		// TODO Auto-generated method stub
	boolean res=false;
	//1. 
	Connection con=getDBcon();
	//2.

	try {
		PreparedStatement stmt;
		stmt = con.prepareStatement("select * from tblCompanyDetails where Cid=?and Pwd=?");
		//3.
		stmt.setString(1,strCid);
		stmt.setString(2,strPwd);
		//4.
		ResultSet rset=stmt.executeQuery();
		if(rset.next()){
			res=true;
		}
		else
		{
			res=false;
		}
	
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return res;
	}
	
	
	
	
	public Connection getDBcon()
	{
		Connection con =null;
		OracleDataSource ods;
		 try {
			ods= new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
		con=ods.getConnection("sourav", "icsd");
		 System.out.println("conn established");
		
		 } 
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		 
	}

	public boolean validuser(String strunm, String strpwd)
	{
	boolean res=false;
	Connection con=getDBcon();
	try {
		PreparedStatement stmt=con.prepareStatement("select * from tblAdmin2 where unm=?and upwd=?");
		stmt.setString(1, strunm);
		stmt.setString(2, strpwd);
		ResultSet rset=stmt.executeQuery();
		if(rset.next())
		{
			res=true;
		}
		else
		{
			res=false;
		}
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		return res;
	}

	public void Insertintotblstaff(String strid, String strname, String strpwd, String strgender, String strdob,
			String strmbno, String strpin, String stremail) 
	{
	
		Connection con=getDBcon();
		try 
		{
	      PreparedStatement stmt=con.prepareStatement("insert into tblstaff values(?,?,?,?,?,?,?,?)");
	      stmt.setString(1, strid);
	      stmt.setString(2, strname);
	      stmt.setString(3, strpwd);
	      stmt.setString(4, strgender);
	      stmt.setString(5, strdob);
	      stmt.setString(6, strmbno);
	      stmt.setString(7, strpin);
		  stmt.setString(8, stremail);

		  
		  stmt.executeUpdate();
		  con.close();
		  JOptionPane.showMessageDialog(null, "Data inserted");
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public void deletefromtblstaff(String strid) 
	{
		Connection con=getDBcon();
		try {
			PreparedStatement stmt=con.prepareStatement("delete from tblstaff where Userid =?");
			stmt.setString(1, strid);
			stmt.executeUpdate();
			  con.close();
			  JOptionPane.showMessageDialog(null, "Data deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Updatetblstaff(String strid, String strname, String strpwd, String strgender, String strdob,
			String strmbno, String strpin, String stremail)
	{
		Connection con=getDBcon();
		try 
		{
			PreparedStatement stmt=con.prepareStatement("update  tblstaff set UName=?,UPwd=?,gender=?,Dob=?,MobileNunber=?,Pincode =?, EmailId=? where Userid=?");
		      stmt.setString(1, strname);
		       stmt.setString(2, strpwd);
		      stmt.setString(3, strgender);
		      stmt.setString(4, strdob);
		      stmt.setString(5, strmbno);
		      stmt.setString(6, strpin);
			  stmt.setString(7, stremail);	
			  stmt.setString(8, strid);	
		
		stmt.executeUpdate();
		con.close();
		JOptionPane.showMessageDialog(null, "Data updated");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	public LinkedList disptblstaff() 
	{
	LinkedList lst=new LinkedList();	
	Connection con =getDBcon();
	try 
	{
		
		PreparedStatement stmt=con.prepareStatement("select * from tblstaff");
		ResultSet rset=stmt.executeQuery();
		while(rset.next())
		{
			String strid, strname,strpwd,strgender,strdob, strmbno, strpin, stremail;
			strid=rset.getString("Userid");
			strname=rset.getString("UName");
			strpwd=rset.getString("UPwd");
			strgender=rset.getString("gender");
			strdob=rset.getString("Dob");
			strmbno=rset.getString("MobileNunber"); 
			strpin=rset.getString("Pincode");
			stremail=rset.getString("EmailId");
			staff s1=new staff(strid, strname,strpwd,strgender,strdob, strmbno, strpin, stremail);
			lst.add(s1);
			System.out.println(s1);
		}
		
		con.close();
	} 
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return lst;
	}

	public staff getstaffrow(String strid) 
	{
		staff s1=null;
		Connection con=getDBcon();
		try 
		{
			PreparedStatement stmt=con.prepareStatement("select * from tblstaff where Userid=?");
			stmt.setString(1, strid);
			ResultSet rset=stmt.executeQuery();
			while(rset.next())
			{
				String  strname,strpwd,strgender,strdob, strmbno, strpin, stremail;
				strname=rset.getString("UName");
				strpwd=rset.getString("UPwd");
				strgender=rset.getString("gender");
				strdob=rset.getString("Dob");
				strmbno=rset.getString("MobileNunber"); 
				strpin=rset.getString("Pincode");
				stremail=rset.getString("EmailId");
				 s1=new staff(strid, strname,strpwd,strgender,strdob, strmbno, strpin, stremail);
				System.out.println(s1);
			}
			
			con.close();
		
		
		
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s1;
	}

	public void inserttblCompanyDetails(String strid, String strname, String stradd, String stremail, String strdir,
			String strweb,String intcnc, String strpwd)
	{
		Connection con=getDBcon();
		try 
		{
	      PreparedStatement stmt=con.prepareStatement("insert into tblCompanyDetails values(?,?,?,?,?,?,?,?)");
	      stmt.setString(1, strid);
	      stmt.setString(2, strname);
	      stmt.setString(3, stradd);
	      stmt.setString(4, stremail);
	      stmt.setString(5, strdir);
	      stmt.setString(6, strweb);
	      stmt.setString(7, intcnc);
	      stmt.setString(8, strpwd);
		  
		  stmt.executeUpdate();
		  con.close();
		  JOptionPane.showMessageDialog(null, "Data inserted");
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
	}

	public void insertintotblStudent(Integer intcnc, String strname,String struname, String strpwd, String strcpwd, String strsem,
			String strgender, String strdob, String intcnc2, String stremail, String stradd,
			String strtime) 
	{
		Connection con=getDBcon();
		try 
		{
	      PreparedStatement stmt=con.prepareStatement("insert into tblStudent values(?,?,?,?,?,?,?,?,?,?,?,?)");
	      stmt.setLong(1, intcnc);
	      stmt.setString(2, strname);
	      stmt.setString(3, struname);
	      stmt.setString(4, strpwd);
	      stmt.setString(5, strcpwd);
	      stmt.setString(6, strsem);
	      stmt.setString(7, strgender);
	      stmt.setString(8, strdob);
	      stmt.setString(9, intcnc2);
	      stmt.setString(10, stremail);
	      stmt.setString(11, stradd);
	      stmt.setString(12, strtime);
	      
	     
		  
		  stmt.executeUpdate();
		  con.close();
		  JOptionPane.showMessageDialog(null, "Data inserted");
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 


		
		
	}

	
	public void updateintotblStudent(String strrol, String strname, String struname, String strpwd, String strcpwd,
			String strsem, String strgender, String strdob, String strmbno, String stremail, String stradd,
			String strtime) 
	{
		
		Connection con=getDBcon();
		try 
		{
	      PreparedStatement stmt=con.prepareStatement("update tblStudent set SName=?,Username=?,Pwd=?, CPwd=?,Sem =?,Gender=?, DOB=?,MobileNo=?, EmailId=?,Address =?,STime=? where Rollno=?");
	      stmt.setString(12, strrol);
	      stmt.setString(1, strname);                           
	      stmt.setString(2, struname);
	      stmt.setString(3, strpwd);
	      stmt.setString(4, strcpwd);
	      stmt.setString(5, strsem);
	      stmt.setString(6, strgender);
	      stmt.setString(7, strdob);
	      stmt.setString(8, strmbno);
	      stmt.setString(9, stremail);
	      stmt.setString(10, stradd);
	      stmt.setString(11, strtime);
	      
	     
		  
		  stmt.executeUpdate();
		  con.close();
		  JOptionPane.showMessageDialog(null, "Data updated");
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public void deletefromtblStudent(String strrol)
	{
		
		Connection con=getDBcon();
		try 
		{
	      PreparedStatement stmt=con.prepareStatement("delete from tblStudent where Rollno=?");
	       stmt.setString(1, strrol);
	      
	     
		  
		  stmt.executeUpdate();
		  con.close();
		  JOptionPane.showMessageDialog(null, "Data deleted");
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public boolean isavalidstaff(String struid, String strpwd)
	{
	boolean res=false;
	Connection con=getDBcon();
	try {
		PreparedStatement stmt=con.prepareStatement("select * from tblstaff where Userid =? and UName=?");
		stmt.setString(1, struid);
		stmt.setString(2, strpwd);
		ResultSet rset=stmt.executeQuery();
		if(rset.next())
		{
			res=true;
		}
		else
		{
			res=false;
		}
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return res;
	}

	public JTable getWorkshoptable() 
	{
		String []colname={"Wid","WName","Time","Duration","date","Paid","limit","Faculty","SAvailable"
			,"Amount","Day","Status"};
		Connection con=getDBcon();	
		try
		{
			PreparedStatement stmt=con.prepareStatement("select * from tblWorkshop");
			ResultSet rset=stmt.executeQuery();
			DefaultTableModel model=new DefaultTableModel(colname,0);
			JTable tbl=new JTable(model);
			while(rset.next())
			{
				Vector row=new Vector();
				String strworkshopid=rset.getString("Wid");
				String strworkshopname=rset.getString("WName");
				String strtime=rset.getString("timee");
				String strdur=rset.getString("dur");
				String strdate=rset.getString("dt"); 
				String strispaid=rset.getString("isPaid");
				String strlimit=rset.getString("limitt");
				String strfac=rset.getString("faculty");
				String strseat=rset.getString("SeatAvailable");
				String stramt=rset.getString("Amt");
			    String strday=rset.getString("dayy");
			    String strstatus=rset.getString("status");
		
			    TableColumnModel tcm=tbl.getColumnModel();
			    tcm.getColumn(11).setPreferredWidth(110);
			    tcm.getColumn(8).setPreferredWidth(100);
			
			row.add(strworkshopid);
			row.add(strworkshopname);
			row.add(strtime);
			row.add(strdur);
			row.add(strdate);
			row.add(strispaid);
			row.add(strlimit);
			row.add(strfac);
			row.add(strseat);
			row.add(stramt);
			row.add(strday);
			row.add(strstatus);
			System.out.println(strworkshopid+" "+strworkshopname+" "+strtime+" "+strdur+" "+strdate
					+" "+strispaid+" "+strlimit+" "+strfac+" "+strseat+" "+stramt+" "+strday+" "+strstatus);
			model.addRow(row);
			
			
			
			}
		return  tbl;
		}
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public JTable getstafftable()
	{

		String []colname={"Id","Name","Password","Gender","DOB","Mobile No","Pincode","Email"};	
		Connection con=getDBcon();	
		try
		{
			PreparedStatement stmt=con.prepareStatement("select * from tblstaff");
			ResultSet rset=stmt.executeQuery();
			DefaultTableModel model=new DefaultTableModel(colname,0);
			JTable tbl=new JTable(model);
			while(rset.next())
			{
				Vector row=new Vector();
				String struid=rset.getString("Userid");
				String strname=rset.getString("UName");
				String strpwd=rset.getString("UPwd");
				String strgendr=rset.getString("gender");
				String strdob=rset.getString("Dob"); 
				String strmbno=rset.getString("MobileNunber");
				String strpncd=rset.getString("Pincode");
				String streid=rset.getString("EmailId");
			
				TableColumnModel tcm=tbl.getColumnModel();
			    tcm.getColumn(7).setPreferredWidth(110);
					
			    row.add(struid);
				row.add(strname);
				row.add(strpwd);
				row.add(strgendr);
				row.add(strdob);
				row.add(strmbno);
				row.add(strpncd);
				row.add(streid);
				model.addRow(row);
			}
		return tbl;
	}
		
		catch (SQLException e) 
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
}

	public JTable getappWorkshoptable() 
	{
		String []colname={"Wid","WName","Time","Duration","date","Paid","limit","Faculty","SAvailable"
				,"Amount","Day","Status"};
			Connection con=getDBcon();	
			try
			{   String strrstatus="APPROVED";
				PreparedStatement stmt=con.prepareStatement("select * from tblWorkshop where status =?");
				stmt.setString(1, strrstatus);
				ResultSet rset=stmt.executeQuery();
				DefaultTableModel model=new DefaultTableModel(colname,0);
				JTable tbl=new JTable(model);
				while(rset.next())
				{
					Vector row=new Vector();
					String strworkshopid=rset.getString("Wid");
					String strworkshopname=rset.getString("WName");
					String strtime=rset.getString("timee");
					String strdur=rset.getString("dur");
					String strdate=rset.getString("dt"); 
					String strispaid=rset.getString("isPaid");
					String strlimit=rset.getString("limitt");
					String strfac=rset.getString("faculty");
					String strseat=rset.getString("SeatAvailable");
					String stramt=rset.getString("Amt");
				    String strday=rset.getString("dayy");
				    String strstatus=rset.getString("status");
						
				    TableColumnModel tcm=tbl.getColumnModel();
				    tcm.getColumn(11).setPreferredWidth(110);
				    tcm.getColumn(8).setPreferredWidth(100);
				    
				row.add(strworkshopid);
				row.add(strworkshopname);
				row.add(strtime);
				row.add(strdur);
				row.add(strdate);
				row.add(strispaid);
				row.add(strlimit);
				row.add(strfac);
				row.add(strseat);
				row.add(stramt);
				row.add(strday);
				row.add(strstatus);
				System.out.println(strworkshopid+" "+strworkshopname+" "+strtime+" "+strdur+" "+strdate
						+" "+strispaid+" "+strlimit+" "+strfac+" "+strseat+" "+stramt+" "+strday+" "+strstatus);
				model.addRow(row);
				
				
				
				}
			return  tbl;
			}
			
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			return null;
	}

	public boolean isavalidstudent(String strrollno, String strpwd) 
	{
		boolean res=false;
		Connection con=getDBcon();
		try {
			PreparedStatement stmt=con.prepareStatement("select * from tblStudent where Rollno =? and Pwd=?");
			stmt.setString(1, strrollno);
			stmt.setString(2, strpwd);
			ResultSet rset=stmt.executeQuery();
			if(rset.next())
			{
				res=true;
			}
			else
			{
				res=false;
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return res;
	}

	
	public JTable getpendingtbl()
	{
		String []colname={"Wid","WName","Time","Duration","date","Paid","limit","Faculty","SAvailable"
				,"Amount","Day","Status"};
			Connection con=getDBcon();	
			try
			{   
				PreparedStatement stmt=con.prepareStatement("select * from tblWorkshop where status =?");
				stmt.setString(1, "PENDING");
				ResultSet rset=stmt.executeQuery();
				DefaultTableModel model=new DefaultTableModel(colname,0);
				JTable tbl=new JTable(model);
				while(rset.next())
				{
					Vector row=new Vector();
					String strworkshopid=rset.getString("Wid");
					String strworkshopname=rset.getString("WName");
					String strtime=rset.getString("timee");
					String strdur=rset.getString("dur");
					String strdate=rset.getString("dt"); 
					String strispaid=rset.getString("isPaid");
					String strlimit=rset.getString("limitt");
					String strfac=rset.getString("faculty");
					String strseat=rset.getString("SeatAvailable");
					String stramt=rset.getString("Amt");
				    String strday=rset.getString("dayy");
				    String strstatus=rset.getString("status");
				
				    TableColumnModel tcm=tbl.getColumnModel();
				    tcm.getColumn(11).setPreferredWidth(110);
				    tcm.getColumn(8).setPreferredWidth(100);
				    
				row.add(strworkshopid);
				row.add(strworkshopname);
				row.add(strtime);
				row.add(strdur);
				row.add(strdate);
				row.add(strispaid);
				row.add(strlimit);
				row.add(strfac);
				row.add(strseat);
				row.add(stramt);
				row.add(strday);
				row.add(strstatus);
				System.out.println(strworkshopid+" "+strworkshopname+" "+strtime+" "+strdur+" "+strdate
						+" "+strispaid+" "+strlimit+" "+strfac+" "+strseat+" "+stramt+" "+strday+" "+strstatus);
				model.addRow(row);
				
				
				
				}
			return  tbl;
			}
			
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		return null;
	}

	public JTable getstudenttable()
	{
		String []colname={"RollNo","Name","UName","Password","CPassword","Sem","Gender","DOB","Mobile No","EMail"
				,"Address","Time"};
			Connection con=getDBcon();	
			try
			{   
				PreparedStatement stmt=con.prepareStatement("select * from tblStudent ");
				ResultSet rset=stmt.executeQuery();
				DefaultTableModel model=new DefaultTableModel(colname,0);
				JTable tbl=new JTable(model);
				while(rset.next())
				{
					Vector row=new Vector();
					String strrol=rset.getString("Rollno");
					String strname=rset.getString("SName");
					String strUname=rset.getString("Username");
					String strpass=rset.getString("Pwd");
					String strcpass=rset.getString("CPwd"); 
					String strSem=rset.getString("Sem");
					String strgen=rset.getString("Gender");
					String strdob=rset.getString("DOB");
					String strmbno=rset.getString("MobileNo");
					String stremail=rset.getString("EmailId");
				    String stradd=rset.getString("Address");
				    String strtime=rset.getString("STime");
			
				    
				    
				row.add(strrol);
				row.add(strname);
				row.add(strUname);
				row.add(strpass);
				row.add(strcpass);
				row.add(strSem);
				row.add(strgen);
				row.add(strdob);
				row.add(strmbno);
				row.add(stremail);
				row.add(stradd);
				row.add(strtime);
				System.out.println(strrol+" "+strname+" "+strUname+" "+strpass+" "+strcpass
						+" "+strSem+" "+strgen+" "+strdob+" "+strmbno+" "+stremail+" "+stradd+" "+strtime);
				model.addRow(row);
				
				
				
				}
			return  tbl;
			}
			
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		return null;
	}

	public void updateStatus(String status, String wid) 
	{
		Connection con=getDBcon();
		try 
		{
			PreparedStatement stmt=con.prepareStatement("Update tblWorkshop set status=?where Wid=? ");
			stmt.setString(1, status);
			stmt.setString(2, wid);
			
	        stmt.executeUpdate();
	        con.close();
	
		
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void updatetime(String time, String id) 
	{
		Connection con=getDBcon();
		try 
		{
			PreparedStatement stmt=con.prepareStatement("Update tblWorkshop  set timee=?where Wid=? ");
			stmt.setString(1, time);
			stmt.setString(2, id);
			
	        stmt.executeUpdate();
	        con.close();
	
		
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getMaxbookingidTblEmp()
	{
		int id1=0;
		Connection con=getDBcon();
		try {
			PreparedStatement stmt=con.prepareStatement("select max(Bookingid)as id from tblBookingStatus");
		ResultSet rset=stmt.executeQuery();
		if(rset.next()){
			id1=rset.getInt("id");
		}
		else{
			id1=0;
		}
		id1=id1+1;
				con.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id1;
		
		
		
	}

	public void insertintotblBookingStatus(String strbid, String strwid, String strrol, String stramt, String strsno,
			String strtime, String strbok, String strwnm) 
	{Connection con=getDBcon();
	try 
	{
      PreparedStatement stmt=con.prepareStatement("insert into tblBookingStatus values(?,?,?,?,?,?,?,?)");
      stmt.setString(1, strbid);
      stmt.setString(2, strwid);
      stmt.setString(3, strrol);
      stmt.setString(4, stramt);
      stmt.setString(5, strsno);
      stmt.setString(6, strtime);
      stmt.setString(7, strbok);
      stmt.setString(8, strwnm);
      stmt.executeUpdate();
	  con.close();
	  JOptionPane.showMessageDialog(null, "Data inserted");
		
	}
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 

	}
	public boolean checkid(String strid)
	{
		boolean Flag=false;
		Connection con=getDBcon();
		try {
			PreparedStatement stmt=con.prepareStatement("select * from tblCompanyDetails where Cid=?");
			stmt.setString(1, strid);
			ResultSet rset=stmt.executeQuery();
			if(rset.next())
			{

				Flag=true;

			}
			else
			{
				Flag=false;

			}

			con.close();
		}		
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		return Flag;}


	
		
	
}