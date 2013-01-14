package com.georgeconsulting.expense;

import java.sql.*;

public class FetchQuery {
	//Fields
	PreparedStatement stmt;
	ResultSet rs;
	
	//Constructor
	public FetchQuery(Connection conn, String queryStmt) throws SQLException {
		//
		stmt = conn.prepareStatement(queryStmt);
		
		//Sets result set with desired query
		rs = stmt.executeQuery();
	}
}
