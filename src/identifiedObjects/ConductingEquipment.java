package identifiedObjects;

import java.util.Hashtable;
import java.util.Map;

public abstract class ConductingEquipment extends Equipment {

	private Terminal terminal;
	private String term1Name;
	
	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

	public String getTerm1Name() {
		return term1Name;
	}

	public void setTerm1Name(String term1Name) {
		this.term1Name = term1Name;
	}

	private static Map<String, Func<Hashtable, ConductingEquipment>> constructors;
	
	
	
	
	
	public ConductingEquipment(Hashtable<String, String> objValues) {
		super(objValues);
	}
	
	protected String state() {
		return null;
	}

}
