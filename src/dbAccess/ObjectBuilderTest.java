package dbAccess;

import identifiedObjects.ACLineSegment;
import identifiedObjects.Terminal;
import identifiedObjects.enums.PhaseCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ObjectBuilderTest {

	public static void main(String[] args) throws Exception {
		
		TerminalBuilder builder = new TerminalBuilder(); //fix error
		builder.buildAllTerminals();
	}
}
