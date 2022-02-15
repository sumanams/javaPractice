package javaPractice;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println(1/0);
		}
		catch (ArithmeticException e  ) {
			System.out.println("Arithmetic exception :"+e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Index out of size of the array");
        }
		catch (Exception e){
			System.out.println("Caught exception :"+e.getMessage());
		}
		
		finally {
			
		}
	}

}
