package identifiedObjects;

import java.util.Hashtable;
import java.util.Map;

public abstract class ConductingEquipment extends Equipment {

	private Terminal terminal1;
	private Terminal terminal2;
	
	
	public Terminal getTerminal1() {
		return terminal1;
	}

	public void setTerminal1(Terminal terminal1) {
		this.terminal1 = terminal1;
	}
	
	public Terminal getTerminal2() {
		return terminal2;
	}

	public void setTerminal2(Terminal terminal2) {
		this.terminal2 = terminal2;
	}
	

	public static ConductingEquipment newConductingEquipment(Hashtable<String, String> objValues) {
		switch(objValues.get("Type")) {
			case "ACLineSegment": return new ACLineSegment(objValues);
			case "Disconnector": return new Disconnector(objValues);
			case "Breaker": return new Breaker(objValues);
			case "Fuse": return new Fuse(objValues);
			case "Jumper": return new Jumper(objValues);
			case "Recloser": return new Recloser(objValues);
			case "Switch": return new Switch(objValues);
			default: throw new RuntimeException("Invalid ConductingEquipment Type");
		}
	}
	
	
	public ConductingEquipment(Hashtable<String, String> objValues) {
		super(objValues);				
	}

}
