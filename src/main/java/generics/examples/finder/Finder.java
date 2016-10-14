package generics.examples.finder;

public class Finder {

	public <T> T findByName(Class<T> entityClass, String name) 
	{
		T instance = null ;
		try {
			instance = entityClass.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return instance ;
	}
}
