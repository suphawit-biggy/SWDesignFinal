package Pattern2;

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

		Context context = new Context();
		GradeCalculatorByCriteria i = new GradeCalculatorByCriteria();
		i.IsetState(context);
		System.out.println(context.getState().toString());
		context.getState().SetMaxA(100);
		context.getState().SetMaxB(80);
		context.getState().SetMaxC(60);
		context.getState().SetMaxD(50);
		context.getState().SetMaxF(50);

		context.getState().SetScore(s1);
		s1.SetGrade(context.getState().GetGrade());
		System.out.println(s1.GetStudyResult());
		context.getState().SetScore(s2);
		s2.SetGrade(context.getState().GetGrade());
		System.out.println(s2.GetStudyResult());
		context.getState().SetScore(s3);
		s3.SetGrade(context.getState().GetGrade());
		System.out.println(s3.GetStudyResult());
		context.getState().SetScore(s4);
		s4.SetGrade(context.getState().GetGrade());
		System.out.println(s4.GetStudyResult());

		System.out.println("");
		System.out.println("Rescale the score criteria");

		context.getState().SetMaxA(100);
		context.getState().SetMaxB(80);
		context.getState().SetMaxC(70);
		context.getState().SetMaxD(50);
		context.getState().SetMaxF(20);

		context.getState().SetScore(s1);
		s1.SetGrade(context.getState().GetGrade());
		System.out.println(s1.GetStudyResult());
		context.getState().SetScore(s2);
		s2.SetGrade(context.getState().GetGrade());
		System.out.println(s2.GetStudyResult());
		context.getState().SetScore(s3);
		s3.SetGrade(context.getState().GetGrade());
		System.out.println(s3.GetStudyResult());
		context.getState().SetScore(s4);
		s4.SetGrade(context.getState().GetGrade());
		System.out.println(s4.GetStudyResult());

		System.out.println("");
		System.out.println("Rescale the score criteria for Grading by Mean");
		MeanAndSDRangeCalculator cals = new MeanAndSDRangeCalculator();
		cals.IsetState(context);
		System.out.println(context.getState().toString());
		cals.AddScore(s1.GetTotalScore("OOP"));
		cals.AddScore(s2.GetTotalScore("OOP"));
		cals.AddScore(s3.GetTotalScore("OOP"));
		cals.AddScore(s4.GetTotalScore("OOP"));
		cals.SetMaxA(0);
		cals.SetMaxB(0);
		cals.SetMaxC(0);
		cals.SetMaxD(0);
		cals.SetMaxF(0);

		cals.SetScore(s1);
		s1.SetGrade(cals.GetGrade());
		System.out.println(s1.GetStudyResult());
		cals.SetScore(s2);
		s2.SetGrade(cals.GetGrade());
		System.out.println(s2.GetStudyResult());
		cals.SetScore(s3);
		s3.SetGrade(cals.GetGrade());
		System.out.println(s3.GetStudyResult());
		cals.SetScore(s4);
		s4.SetGrade(cals.GetGrade());
		System.out.println(s4.GetStudyResult());
	}

}
