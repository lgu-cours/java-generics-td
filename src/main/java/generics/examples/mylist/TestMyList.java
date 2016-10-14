package generics.examples.mylist;



public class TestMyList {
	
	public static void main(String[] args) {
		System.out.println("-----");
		MyList<String> mylist = new MyList<String>(); 
		mylist.add("aaa");
		mylist.add("bbb");
		mylist.add("ccc");
		
		System.out.println("-----");

		String s0 = mylist.get(0);
		String s1 = mylist.get(1);
		String s2 = mylist.get(2);
		
		System.out.println(" . " + s0 );
		System.out.println(" . " + s1 );
		System.out.println(" . " + s2 );
		
		
		MyList<Integer> list = new MyList<Integer>();
		list.add(11);
		list.add(12);
		list.getClass();
	}
}
