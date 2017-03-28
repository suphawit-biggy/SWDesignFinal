package OriSystemA;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Dec 12, 2016
 */
public class Student extends Person {
	private String studentId;
	private Course course = new Course();

	public String getStudentId() {
		return studentId;
	}

	public String GetCourseName() {
		return this.course.getCourseName();
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void SetStudentMidtermScore(String c, int m) {
		if (this.course.getCourseName() == c) {
			this.course.setMidtermExamScore(m);
		}
	}

	public void SetHomeWorkScore(String c, int h) {
		if (this.course.getCourseName() == c) {
			this.course.setHoweworkScore(h);
		}
	}

	public void SetProjectScore(String c, int p) {
		if (this.course.getCourseName() == c) {
			this.course.setProjectScore(p);
		}
	}

	public void SetFinalExamScore(String c, int f) {
		if (this.course.getCourseName() == c) {
			this.course.setFinalExamScore(f);
		}
	}

	public void SetCourseName(String c) {
		this.course.setCourseName(c);
	}

	public void SetGrade(String g) {
		this.course.SetGrade(g);
	}

	public int GetTotalScore(String c) {
		if (this.course.getCourseName() == c) {
			return this.course.GetTotalScore();
		} else
			return 0;
	}

	public String GetStudyResult() {
		return this.studentId + " " + this.getFirstName() + " " + this.getLastName() + " study "
				+ this.course.GetGradeDetail();
	}
}
