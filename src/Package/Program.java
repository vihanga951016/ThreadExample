package Package;

public class Program {

	public static void main(String[] args) {
		
		MainTask mainTask = new MainTask();
		
		
		Task1 task1 = new Task1(mainTask);
		Task2 task2 = new Task2(mainTask);
		Task3 task3 = new Task3(mainTask);
		
		task1.start();
		task2.start();
		task3.start();
	}

}
