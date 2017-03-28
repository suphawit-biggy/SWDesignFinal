package Pattern1;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Dec 12, 2016
 */
public class Context {
	private IGradeCalculator iGradeCalculator;

	public Context(IGradeCalculator iGradeCalculator) {
		this.iGradeCalculator = iGradeCalculator;
	}

	public void executeAddScore(int s) {
		iGradeCalculator.AddScore(s);
	}

	public void executeSetMaxA(int score) {
		iGradeCalculator.SetMaxA(score);
	}

	public void executeSetMaxB(int score) {
		iGradeCalculator.SetMaxB(score);
	}

	public void executeSetMaxC(int score) {
		iGradeCalculator.SetMaxC(score);
	}

	public void executeSetMaxD(int score) {
		iGradeCalculator.SetMaxD(score);
	}

	public void executeSetMaxF(int score) {
		iGradeCalculator.SetMaxF(score);
	}

	public void executeSetScore(Student s) {
		iGradeCalculator.SetScore(s);
	}

	public String executeGetGrade() {
		String executeGrade;
		executeGrade = iGradeCalculator.GetGrade();
		return executeGrade;
	}

}
