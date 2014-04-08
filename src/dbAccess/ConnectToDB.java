
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class ConnectToDB {
    static int lport;
    static String rhost;
    static int rport;
    public static void go() {  
    	String user = JOptionPane.showInputDialog("SSH Username:");    	
    	
    	String password = null;
    	JPasswordField passwordField = new JPasswordField();
    	passwordField.setEchoChar('*');
    	Object[] obj = {"Please enter the password:\n\n", passwordField};
    	Object stringArray[] = {"OK","Cancel"};
    	if (JOptionPane.showOptionDialog(null, obj, "Need password",
    	JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, stringArray, obj) == JOptionPane.YES_OPTION)
    	password = new String(passwordField.getPassword());

        String host = "esrl-1.eecs.case.edu";
        int port=22;
        try
            {
            JSch jsch = new JSch();
            Session session = jsch.getSession(user, host, port);
            lport = 3306;
            rhost = "127.0.0.1";
            rport = 3306;
            session.setPassword(password);
            session.setConfig("StrictHostKeyChecking", "no");
            System.out.println("Establishing Connection...");
            session.connect();
            int assinged_port=session.setPortForwardingL(lport, rhost, rport);
            System.out.println("localhost:"+assinged_port+" -> "+rhost+":"+rport);
            }
        catch(Exception e){
        	System.err.print(e);
        	e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        try {
            go();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
          System.out.println("Trying to read PowerTransformer table...");
          Connection con = null;
          ResultSet update = null;
          Statement st = null;
          String driver = "com.mysql.jdbc.Driver";
          String url = "jdbc:mysql://" + rhost +":" + lport + "/";
          String db = "mydb";
          String dbUser = "root";
          String dbPasswd = "";
          try {
	          Class.forName(driver);
	          con = DriverManager.getConnection(url+db, dbUser, dbPasswd);
	          try {
		          st = con.createStatement();
		          String sql = "select TerminalID from Terminal where ConnectivityNodeID is not null";
		          update = st.executeQuery(sql);
		          while (update.next()) {
		              Long ptid = update.getLong("TerminalID");
		              System.out.println(ptid);
		          }
	          } 
	          catch (SQLException s) {
	        	  s.printStackTrace();
	          }
	          finally {
	        	  if (con != null) con.close();
	        	  if (st != null) st.close();
	        	  if (update != null) update.close();
	          }
          } catch (Exception e) {
          e.printStackTrace();
          } 
          
     }
   
}