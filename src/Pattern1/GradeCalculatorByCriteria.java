package Pattern1;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Dec 12, 2016
 */
public class GradeCalculatorByCriteria implements IGradeCalculator {
	int a, b, c, d, f, temp;

	public void AddScore(int s) {
	}

	@Override
	public void SetMaxA(int score) {
		this.a = score;
	}

	@Override
	public void SetMaxB(int score) {
		this.b = score;
	}

	@Override
	public void SetMaxC(int score) {
		this.c = score;
	}

	@Override
	public void SetMaxD(int score) {
		this.d = score;
	}

	@Override
	public void SetMaxF(int score) {
		this.f = score;
	}

	@Override
	public void SetScore(Student s) {
		this.temp = s.GetTotalScore(s.GetCourseName());
	}

	public String GetGrade() {
		if (temp > b) {
			return "A";
		} else if (temp > c) {
			return "B";
		} else if (temp > d) {
			return "C";
		} else if (temp > f) {
			return "D";
		} else
			return "F";
	}
}