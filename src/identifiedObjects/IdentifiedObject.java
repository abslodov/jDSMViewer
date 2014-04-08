package identifiedObjects;
import java.util.Hashtable;

	public abstract class IdentifiedObject {

	protected double id;
	protected String name;
	protected String aliasName;
	protected String type;
	
	public double getId() { return id; }
	public void setId(double id) { this.id = id; }

	public String getAliasName() {
		return aliasName;
	}
	
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	
	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public IdentifiedObject() {
	
	}

}
