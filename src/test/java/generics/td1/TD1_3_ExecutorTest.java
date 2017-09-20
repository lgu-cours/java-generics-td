package generics.td1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

public class TD1_3_ExecutorTest {
	
	@Test
	public void test() {
		System.out.println("\n--- Executor ");
		AddTask task = new AddTask(10,2);
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();	
				
		System.out.println("before submit");
		Future<Integer> future = executorService.submit(task); // Asynchrone  
		System.out.println("after submit");
		executorService.shutdown();
		System.out.println("after shutdown");
		
		try {
			System.out.println("get()....");
			Integer result = future.get(); // Attente de fin de tache
			System.out.println(result);
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}		

}
