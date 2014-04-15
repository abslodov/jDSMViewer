package dbAccess;

import identifiedObjects.Terminal;
import identifiedObjects.enums.PhaseCode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TerminalBuilder {

	public List<Terminal> buildAllTerminals() throws Exception {
		
		System.out.println("Build AC Line Segments...");
        
        /*
        | TerminalID         | bigint(20)  | NO   | PRI | 0       |       |
        | Name               | varchar(45) | YES  |     | NULL    |       |
        | AliasName          | varchar(45) | YES  |     | NULL    |       |
        | ConnectivityNodeID | bigint(20)  | YES  |     | NULL    |       |
        | TopologicalNodeID  | varchar(45) | YES  |     | NULL    |       |
        | connected          | varchar(45) | YES  |     | NULL    |       |
        | phases             | varchar(45) | YES  |     | NULL    |       |
        | sequenceNumber     | varchar(45) | YES  |     | NULL    |       |
        */
        
        // Terminal SQL Thoughts...
        // Uncertain fields, need to be addressed in the data & object models:
        // * mRID
        // * DeviceTypeID
        // * Device_ID
        // * BaseVolatageID
        // * ACLineSegmentID
		
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
        
          try {
              con = ConnectionUtil.getConnection();
        	  String sql = "SELECT Name, AliasName, ConnectivityNodeID, connected,"
	          		+ "phases, sequenceNumber FROM Terminal";
	          
	          st = con.prepareStatement(sql);
	          // add parameter values, do other stuff to the prepared statement, before executing it...
	          
	          rs = st.executeQuery();
	          
	          List<Terminal> terminals = new ArrayList<Terminal>();
	          while (rs.next()) {
	          
	        	  Terminal t = new Terminal();
	        	  t.setAliasName(rs.getString("AliasName"));
	        	  t.setName(rs.getString("Name"));
	        	  t.setConnected(rs.getBoolean("connected")); // TODO - change connected column to bool type
	        	  t.setSequenceNumber(rs.getInt("sequenceNumber")); // TODO - change column to int
	        	  t.setPhases(PhaseCode.convert(rs.getString("phases")));
	        	  t.setId(rs.getDouble("TerminalID"));
	        	  
	        	  // TODO MAGIC!!! Node ID fields
	        	  
	        	  terminals.add(t);
	          }
	          
	          // List of all terminals in the database in memory.
	          
	          // Find all terminals of phase code N
	          //List<Terminal> nTerms = new ArrayList<Terminal>();
	          //for (Terminal t : terminals) {
	          //	  if (t.getPhases() == PhaseCode.N) nTerms.add(t);
	          //}
	          
	          return terminals;
          } 
          catch (SQLException s) {
        	  s.printStackTrace();
        	  return null;
          }
          finally {
        	  if (con != null) con.close();
        	  if (st != null) st.close();
        	  if (rs != null) rs.close();
          }
	}
}
