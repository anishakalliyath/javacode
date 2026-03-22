package automationbatch;

class AmazonDetails
{
	private int age = 30;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		AmazonDetails m1 = new AmazonDetails();
		m1.getAge();
		
		System.out.println(m1.getAge());
	
	}

}
