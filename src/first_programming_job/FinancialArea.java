package first_programming_job;

public class FinancialArea {

	void receiveStudent(Student[] s) {
		float higherPayment = higherPayment(s);
		getDiffAvg(higherPayment, s);
	}
	
	float higherPayment(Student[] s) {
		float maxPayment = s[0].payment;
		for(int i =1; i < s.length; i++) {
			if(s[i].payment > maxPayment ) {
				maxPayment = s[i].payment;
			}
		}
		return maxPayment;
	}
	
	void getDiffAvg(float maxPayment, Student[] s) {
		float totalPayments = 0;
		for(int i=0; i < s.length; i++) {
			totalPayments += s[i].payment;
		}
		float average = totalPayments / s.length;
		float paymentDifference = average - maxPayment;
		System.out.print("Difference between payment average and student with the greatest payment is: " + paymentDifference);
	}
}
