package first_programming_job;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Maicol", 45.2f);
		Student s2 = new Student("Stiven", 64.3f);
		Student s3 = new Student("Carlos", 12.6f);
		Student s4 = new Student("Juan", 84.5f);
		Student students[] = {s1,s2,s3,s4};
		FinancialArea f1 = new FinancialArea();
		f1.receiveStudent(students);
		
	}

}
