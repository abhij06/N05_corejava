package org.tnsif.jdbc.mvc;

import java.sql.Connection;

public class dbExecutor {

	public static void main(String[] args) {
		Connection cn=DButil.getCn();
		System.out.println(cn);
	}

}
