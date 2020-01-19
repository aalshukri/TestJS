// Java code for thread creation by extending 
// the Thread class 
class SingleThread extends Thread 
{ 
   private volatile boolean active = true;

   private volatile int counter = 0;

   public void run() 
   { 	
	int counter=0;

	while(active){
		try
		{ 
		    // Displaying the thread that is running 
		    System.out.println ("SingleThread " + Thread.currentThread().getId() + " is running ("+counter+")");   
		} 
		catch (Exception e) 
		{ 
		    // Throwing an exception 
		    System.out.println ("Exception is caught"); 
		} 
		counter++;
	}
    } 



   public void stopRunning() {
      active = false;   // line 2
   }

	// only accessable by one thread at a time
	public synchronized void showDetails() {
		counter++;
		System.out.println ("Synchronized method only accessable by one thread at a time counter("+counter+")");
	}
	
} 
  

/*
Thread Class vs Runnable Interface
 If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance.
 Implement the Runnable interface, our class can still extend other base classes.

*/
class SingleThreadRunnable implements Runnable 
{ 

    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("SingleThreadRunnable " + 
                  Thread.currentThread().getId() + 
                  " is running"); 
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
 

} 



// Main Class 
public class MultiThreadDemo
{ 
    public static void main(String[] args) 
    { 
        int n = 8; // Number of threads 
        for (int i=0; i<8; i++) 
        { 
            SingleThread object = new SingleThread(); 
            object.start(); 

		//wait
		try{Thread.sleep(10);}catch(Exception e){}


	    object.showDetails();

	    object.stopRunning();

	    


	    //To create instance of thread implimenting Runnable.
            Thread objRun = new Thread( new SingleThreadRunnable() ); 
            objRun.start(); 
	   



        } 
    } 
} 
