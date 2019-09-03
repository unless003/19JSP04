package thread;

public class mainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread running... ");
		 
        ThreadTest T1 = new ThreadTest("Thread-1-HR-Database");
        T1.start();
 
        ThreadTest T2 = new ThreadTest(" Thread - 2 - SendEmail ");
        T2.start();
        System.out.println("End");
	}

}
