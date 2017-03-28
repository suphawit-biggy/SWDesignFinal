package Pattern1;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Dec 12, 2016
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setFirstName("Alex");
		s1.setLastName("Kristopher");
		s1.setStudentId("0001");
		s1.SetCourseName("OOP");
		s1.SetHomeWorkScore("OOP", 20);
		s1.SetProjectScore("OOP", 20);
		s1.SetStudentMidtermScore("OOP", 22);
		s1.SetFinalExamScore("OOP", 24);

		Student s2 = new Student();
		s2.setFirstName("Chris");
		s2.setLastName("Tesla");
		s2.setStudentId("0002");
		s2.SetCourseName("OOP");
		s2.SetHomeWorkScore("OOP", 10);
		s2.SetProjectScore("OOP", 15);
		s2.SetStudentMidtermScore("OOP", 20);
		s2.SetFinalExamScore("OOP", 17);

		Student s3 = new Student();
		s3.setFirstName("David");
		s3.setLastName("Bahmm");
		s3.setStudentId("0003");
		s3.SetCourseName("OOP");
		s3.SetHomeWorkScore("OOP", 4);
		s3.SetProjectScore("OOP", 4);
		s3.SetStudentMidtermScore("OOP", 12);
		s3.SetFinalExamScore("OOP", 10);

		Student s4 = new Student();
		s4.setFirstName("Alex");
		s4.setLastName("Kristopher");
		s4.setStudentId("0004");
		s4.SetCourseName("OOP");
		s4.SetHomeWorkScore("OOP", 15);
		s4.SetProjectScore("OOP", 15);
		s4.SetStudentMidtermScore("OOP", 14);
		s4.SetFinalExamScore("OOP", 15);

		Context context = new Context(new GradeCalculatorByCriteria());
		context.executeSetMaxA(100);
		context.executeSetMaxB(80);
		context.executeSetMaxC(60);
		context.executeSetMaxD(50);
		context.executeSetMaxF(50);

		context.executeSetScore(s1);
		s1.SetGrade(context.executeGetGrade());
		System.out.println(s1.GetStudyResult());
		context.executeSetScore(s2);
		s2.SetGrade(context.executeGetGrade());
		System.out.println(s2.GetStudyResult());
		context.executeSetScore(s3);
		s3.SetGrade(context.executeGetGrade());
		System.out.println(s3.GetStudyResult());
		context.executeSetScore(s4);
		s4.SetGrade(context.executeGetGrade());
		System.out.println(s4.GetStudyResult());

		System.out.println("");
		System.out.println("Rescale the score criteria");

		context.executeSetMaxA(100);
		context.executeSetMaxB(80);
		context.executeSetMaxC(70);
		context.executeSetMaxD(50);
		context.executeSetMaxF(20);

		context.executeSetScore(s1);
		s1.SetGrade(context.executeGetGrade());
		System.out.println(s1.GetStudyResult());
		context.executeSetScore(s2);
		s2.SetGrade(context.executeGetGrade());
		System.out.println(s2.GetStudyResult());
		context.executeSetScore(s3);
		s3.SetGrade(context.executeGetGrade());
		System.out.println(s3.GetStudyResult());
		context.executeSetScore(s4);
		s4.SetGrade(context.executeGetGrade());
		System.out.println(s4.GetStudyResult());

		System.out.println("");
		System.out.println("Rescale the score criteria for Grading by Mean");
		context = new Context(new MeanAndSDRangeCalculator());
		context.executeAddScore(s1.GetTotalScore("OOP"));
		context.executeAddScore(s2.GetTotalScore("OOP"));
		context.executeAddScore(s3.GetTotalScore("OOP"));
		context.executeAddScore(s4.GetTotalScore("OOP"));
		context.executeSetMaxA(0);
		context.executeSetMaxB(0);
		context.executeSetMaxC(0);
		context.executeSetMaxD(0);
		context.executeSetMaxF(0);

		context.executeSetScore(s1);
		s1.SetGrade(context.executeGetGrade());
		System.out.println(s1.GetStudyResult());
		context.executeSetScore(s2);
		s2.SetGrade(context.executeGetGrade());
		System.out.println(s2.GetStudyResult());
		context.executeSetScore(s3);
		s3.SetGrade(context.executeGetGrade());
		System.out.println(s3.GetStudyResult());
		context.executeSetScore(s4);
		s4.SetGrade(context.executeGetGrade());
		System.out.println(s4.GetStudyResult());
	}

}
