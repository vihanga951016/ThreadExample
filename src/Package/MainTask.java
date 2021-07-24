package Package;

public class MainTask {

	public void excecuteTask(String symbol) {
		
		for(int i=0;i<10;i++){
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(symbol+i);
		}
	}
}
