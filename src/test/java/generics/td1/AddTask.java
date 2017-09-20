package generics.td1;

import java.util.concurrent.Callable;

public class AddTask implements Callable<Integer> {

	private final int duration = 4000 ; // 4 secondes ( 4000 ms )
	
	private final int p1 ;
	private final int p2 ;
	
	public AddTask(int p1, int p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public Integer call() throws Exception {
		Thread.sleep(duration);
		return p1 + p2 ;
	}

}
