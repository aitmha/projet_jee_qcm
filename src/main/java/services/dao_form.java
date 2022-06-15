package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.form;

public class dao_form {
	static Connection cnx = null;
	public static void   startConnection() {
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbqcm", "root", "");
	  }catch(Exception e) {
		System.out.println(e);
	  }
	}
	public static List<form> getReponseFor(int id_question) {
		List<form> lsform = new ArrayList<form>();
		try {
			startConnection();
			String sql = "select * from form";
			PreparedStatement s =  cnx.prepareStatement(sql);
			s.setInt(1, id_question);
			ResultSet rs =s.executeQuery();
			while(rs.next()) {
				form fo = new form();
				
				fo.setId_form(rs.getInt(1));
				fo.setLib_form(rs.getString(2));
				lsform.add(fo);
			}
			cnx.close();
		}catch(Exception e1) {System.out.println(e1);}
		return lsform;
	}
}
