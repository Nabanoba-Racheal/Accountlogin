package accountlogin;
import java.util.Scanner;
public class Accountlogin {

	public static void main(String[] args) {
		
	int accountPin=484323;
	
	Scanner pin=new Scanner(System.in);
	for(int attempts=1; attempts<=3;attempts++) {
		System.out.println("Attempts" + attempts + ":Enter your Pin");
		int correct_pin =pin.nextInt();
		pin.nextLine();
		
		if (correct_pin==accountPin) {		
		System.out.println("valid Pin");
			break;	
			}else {System.out.println("invalid pin");
			}
		if(attempts==3) {
			System.out.println("Account locked Please try again later");	
		}
			}
	
			
	
	
	
	
			
		
	}

}
