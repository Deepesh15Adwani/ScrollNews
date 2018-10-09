package com.SN.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.SN.client.GreetingService;
import com.SN.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import gwt.material.design.client.ui.MaterialToast;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {
	
	Connection con=null;
	Statement st=null;
	static public String tc;
	public String h=null;
	public String c=null;
	public String l=null;
	public String t=null;
	String news;
	
	public void init()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scrl","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			st=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public String check(String s1, String s2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs=null;
		String ss1="NOT";
		try {
			rs=st.executeQuery("select * from pdetails where Email='"+s1+"' and Password='"+s2+"'");
			if(rs.next())
			{
				ss1="Done";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				return ss1;
				
		
	}
	
	public String ins(String s3,String s4,String s5,String s6)throws IllegalArgumentException{
		
		init();
		int k=0;
		String ss1="NOT";
		
		try {
			k=st.executeUpdate("insert into pdetails values('"+s3+"','"+s4+"','"+s5+"','"+s6+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(k!=0)
		{
			ss1="apka kaam hogya ;";
		}
		return ss1;
		
	}
	
	
	public String data(String s8,String s9,String s10,String j1,String dt1)throws IllegalArgumentException{
		
		init();
		int k=0;
		String ss1="NOT";
		
		try {
			k=st.executeUpdate("insert into newsdata values('"+s8+"','"+s9+"','"+s10+"','"+j1+"',NOW())");

			if(k!=0)
				return "done";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ss1;
		
		
	}

	
	public String fu(String jk) throws IllegalArgumentException {
		
		tc=jk;
		
		return tc;
	}
	@Override
	public String checkk(String q4) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs=null;
		int k=0;
		news="";
		
		try {
			rs=st.executeQuery("select * from newsdata where tag='"+q4+"'order by TIMESTAMP DESC");
			
			 while (rs.next()) {
		            h= rs.getString(1);
		            c = rs.getString(2);
		            l= rs.getString(3);
		    
		            k++;
		            
		            news=news+h+"@"+c+"@"+l+"@~";
		            
		            
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		
		
		return k+" "+news ;
	}
	

}
