package dbaccess;

import java.sql.*;



public class EntityDBHandler {
	
	
	/*To add entity, we have to do the following -
	 *  1 -> Add entity to the entity table
	 *  2 -> Add attributes to the attribute table
	 *  3 -> create relationship between entities and attributes
	 *  4 -> in the relationship table, set the constraints 
	*/
	public void addEntity() {
		try {
			Class.forName("org.sqlite3.JDBC");
			Connection conn = DriverManager.getConnection("jdbc::sqlite3::Entities.db");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//add entity
	}
}
