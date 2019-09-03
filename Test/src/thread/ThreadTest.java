package thread;

public class ThreadTest implements Runnable {
	private Thread th;
	private String name;
	public ThreadTest(String name) {
		
		this.name = name;
		System.out.println(" Creating :  " + name);
	}


	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running " + name);
        try {
            for (int i = 2; i > 0; i--) {
                System.out.println("Thread: " + name + ", " + i);
              
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " interrupted.");
        }
        System.out.println("Thread " + name + " exiting.");
	}
		
	public void start() {
		System.out.println("Start  "+name);
		if(th==null) {
			th = new Thread(this,name);
			th.start();
		}
	}

}
