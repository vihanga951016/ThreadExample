package Package;

public class Task2 extends Thread{
	
	MainTask task2;

	public Task2(MainTask task2) {
		super();
		this.task2 = task2;
	}
	
	public void run() {
		task2.excecuteTask("^^");
	}
}
