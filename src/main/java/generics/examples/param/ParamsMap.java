package generics.examples.param;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ParamsMap<Type>  {

	Map<String,Param<Type>> map = new HashMap<String,Param<Type>>();
	
	public void storeParam(Param<Type> param) {
		map.put(param.getName(), param );
	}
	
	public Param<Type> getParam(String name) {
		return map.get(name);
	}

	public Set<String> getNames()
	{
		Set<String> names = map.keySet();
		return names ;
	}

}
