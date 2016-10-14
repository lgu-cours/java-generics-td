package generics.examples.param;

public class Param<Type> {

	private final String name ;
	private final Type   value ;
	
	
	public Param(String name, Type value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name ;
	}
	
	public Type getValue() {
		return value ;
	}

	public Class<?> getValueClass() {
		return value.getClass() ;
	}

	@Override
	public String toString() {
		return "Param [name='" + name + "', value=" + value + "] ( " 
				+ value.getClass().getSimpleName() + " ) " ;
	}
	
	
}
