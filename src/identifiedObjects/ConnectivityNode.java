package identifiedObjects;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class ConnectivityNode extends IdentifiedObject implements Iterable<Terminal> {
	
	
	private List<Terminal> connections;
	
	public void add(Terminal term){
        connections.add(term);
    }
	
	public int getTerminalCount() {
        return connections.size();
    }
	
	public List<ConductingEquipment> getAdjacentConductingEquipment() {
		List<ConductingEquipment> equipment = new ArrayList<ConductingEquipment>(); 
		for(Terminal term : connections) {
			equipment.add(term.getParentEquipment());
		}
		return equipment;
	}
	
	public List<ConductingEquipment> getAllConductingEquipment() {
		List<ConductingEquipment> equipAccum = new ArrayList<ConductingEquipment>(); 
		
		for(Terminal term : connections) {
			// Add ConductingEqupiment to our accumulated list of all equipment.
			ConductingEquipment ce = term.getParentEquipment();
			equipAccum.add(ce);
			
			ConnectivityNode node = ce.getOtherTerminal(term).getConnectionPoint();
			equipAccum.addAll(node.getAllConductingEquipment()); 
		}
		
		return equipAccum;
	}
	
	//other term > other con node > other adjacent equip >  >stop at bus
	
	
	public ConnectivityNode(Hashtable<String, String> objValues) {
		super(objValues);
		
	}

	public ConnectivityNode() {
		
	}

	@Override
	public Iterator<Terminal> iterator() {
		return connections.iterator();
	}

}
