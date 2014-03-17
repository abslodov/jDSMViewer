package identifiedObjects;
import java.util.Hashtable;
import java.lang.reflect.*;

public abstract class PowerSystemResource extends IdentifiedObject {

	public String getFieldSummary() throws IllegalAccessException {
		Class c = this.getClass();
		Field[] fields = c.getFields();
		
		StringBuffer sb = new StringBuffer();
		
		for (Field f : fields) {
			String fname = f.getName();
			String fval = f.get(this).toString();
			sb.append(fname + "=" + fval + "\n");	
		}
		
		return sb.toString();
		
	}

	public PowerSystemResource(Hashtable<String,String> data) {
		super(data);
	}

}
