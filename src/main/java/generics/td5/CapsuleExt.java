package generics.td5;

import generics.td2.Capsule;

public class CapsuleExt<T> extends Capsule<T> {

	private int version = 0 ;
	
	CapsuleExt(T obj, int v)
	{
		super(obj);
		version = v ;
	}

	public int getVersion()
	{
		return version ;
	}
}
