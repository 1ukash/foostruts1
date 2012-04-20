package ru.spbstu.telematics.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ApplicationManager {

	private DataSource ds;

	public ApplicationManager() {
		InitialContext cxt = null;
		try {
			cxt = new InitialContext();

			ds = (DataSource) cxt.lookup( "java:/comp/env/jdbc/postgres" );

			if ( ds == null ) {
				throw new RuntimeException("Data source not found!");
			}
		} catch (NamingException e) {
			throw new RuntimeException("No context!", e);
		}
	}
	
	public void doTestQuery() {
		Connection con = null;
		
		try {
			con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement("select name from person t");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String name = rs.getString(1);
				System.out.println(name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	

}
