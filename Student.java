import java.util.*;
class Student{
	String name;
	int roll;
	public Student() {
		name="Unknown";
		roll="Unknown";
	}
	public Student(String name,int roll) {
		this.name=name;
		this.roll=roll;
	}
	public String getname() {
		return name;
		}
	public int getroll() {
		return roll;
	}
}
public class Studentclass {

	public static void main(String[] args) {
		Scanner P=new Scanner(System.in);
		System.out.print("Enter names: ");
		String stdname=P.nextLine();
		System.out.print("Enter Roll no. ");
		int r=P.nextInt();
		Student s=new Student(stdname,r);
		System.out.println("Student names:"+s.getname());
		System.out.println("Roll no.:"+s.getroll());

	}

}
