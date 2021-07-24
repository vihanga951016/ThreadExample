package Package;

public class Task1 extends Thread{

	MainTask task1;

	public Task1(MainTask task1) {
		super();
		this.task1 = task1;
	}
	
	public void run() {
		task1.excecuteTask("%%");
	}
}
