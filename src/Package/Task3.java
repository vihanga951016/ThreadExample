package Package;

public class Task3 extends Thread{

	MainTask task3;

	public Task3(MainTask task3) {
		super();
		this.task3 = task3;
	}
	
	public void run() {
		task3.excecuteTask("()");
	}
//	for(int i=0;i<20;i++) {
//	System.out.println("++"+i);
//}
	
}
