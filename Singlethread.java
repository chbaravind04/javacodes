class MultipleTask implements Runnable { 
	            public void run() { 
	            	task1();
	            	task2();
	            	task3();
	            } // end of run()
	                    void task1() {
	                    	System.out.println("Task1 work");
	                    } // end of the task1()
	                    void task2() { 
	                    	System.out.println("Task2 work");
	                    } // end of the task2()
	                    void task3() { 
	                    	System.out.println("Task3 work");
	                    } // end of the task3()
	                    
} // end of the class
public class MTSingleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             MultipleTask mt=new MultipleTask();
             Thread t=new Thread(mt);
             t.start();
             
	}

}
