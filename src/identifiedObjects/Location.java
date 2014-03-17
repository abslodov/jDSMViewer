package identifiedObjects;

import java.util.Hashtable;
import java.util.HashSet;

public class Location extends IdentifiedObject {

	private HashSet<Terminal> terminals;
	private PositionPoint position;
	
	public HashSet<Terminal> getTerminals() {
		return terminals;
	}

	private void setTerminals(HashSet<Terminal> terminals) {
		this.terminals = terminals;
	}

	public HashSet<ConnectivityNode> getNodes() {
		HashSet<ConnectivityNode> nodes = new HashSet<ConnectivityNode>();
		for(Terminal t: this.terminals){
			nodes.add(t.getConnectionPoint());
		}
		return nodes;
	}

	public PositionPoint getPosition() {
		return position;
	}

	private void setPosition(PositionPoint position) {
		this.position = position;
	}

	
	public Location(Hashtable<String, String> objValues, PositionPoint position) {
		super(objValues);
		this.position = position;
		this.terminals = new HashSet<Terminal>();
	}

	public void addTerminal(Terminal term) {
		this.terminals.add(term);
	}

}


