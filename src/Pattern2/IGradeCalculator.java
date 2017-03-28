package Pattern2;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Dec 12, 2016
 */
public interface IGradeCalculator {
	void SetMaxA(int score);// Set Maximum score for Grade A

	void SetMaxB(int score);// Set Maximum score for Grade B

	void SetMaxC(int score);// Set Maximum score for Grade C

	void SetMaxD(int score);// Set Maximum score for Grade D

	void SetMaxF(int score);// Set Maximum score for Grade F

	void SetScore(Student s);// Set score for grade calculation

	String GetGrade();
}