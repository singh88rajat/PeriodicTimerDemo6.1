package assign1session6;

public class PeriodicTimerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i < 10;i++)
		{
			try {
				Thread.sleep(4000); // Sleep function to make delay in output
				System.out.println("Timeout "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}

}
