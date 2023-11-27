import java.util.*;

abstract class telephone{
	abstract void lift();
	abstract void disconnected();
}
class smarttelephone extends telephone{
	public void lift() {
		System.out.println("The call can be lifted");
	}
	public void disconnected() {
		System.out.println("The line is disconnected");
	}
}
public class Telephone{
	
	public static void main(String[] args) {
		Scanner P=new Scanner(System.in);
		System.out.println("Enter line status(Disconnected or Online):");
		String stat=P.nextLine();
		smarttelephone s=new smarttelephone();
		if(stat.equals("Disconnected")) {
			s.disconnected();
		}
		else {
			s.lift();
		}
		

	}

}
