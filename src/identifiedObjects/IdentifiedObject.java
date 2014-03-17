package identifiedObjects;
import java.util.Hashtable;

	public abstract class IdentifiedObject {

	protected String name;
	
	public String getName(){
		return name;
	}
	
	protected String type;
	
	public String getType(){
		return type;
	}
	
	public IdentifiedObject(Hashtable<String,String> objValues) {
		name = objValues.get("Name");
		type = objValues.get("Type"); 
	}

	public IdentifiedObject() {
	
	}

}
