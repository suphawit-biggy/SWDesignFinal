package OriSystemA;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Dec 12, 2016
 */
public class Course {
	protected String courseName;
	private int midtermExamScore;
	private int howeworkScore;
	private int projectScore;
	private int finalExamScore;
	private String Grade;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setMidtermExamScore(int midtermExamScore) {
		this.midtermExamScore = midtermExamScore;
	}

	public void setHoweworkScore(int howeworkScore) {
		this.howeworkScore = howeworkScore;
	}

	public void setProjectScore(int projectScore) {
		this.projectScore = projectScore;
	}

	public int GetTotalScore() {
		return this.midtermExamScore + this.howeworkScore + this.projectScore + this.finalExamScore;
	}

	public void setFinalExamScore(int finalExamScore) {
		this.finalExamScore = finalExamScore;
	}

	public void SetGrade(String g) {
		this.Grade = g;
	}

	public String GetGradeDetail() {
		String studyresult = "Subject " + courseName + " with Total Score " + this.GetTotalScore() + " Get Grade "
				+ this.Grade;
		return studyresult;
	}
}