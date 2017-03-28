package Pattern2;

import java.util.*;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Dec 12, 2016
 */
public class MeanAndSDRangeCalculator implements IGradeCalculator {
	private List<Integer> scorelist = new ArrayList<Integer>();

	public void IsetState(Context context) {
		context.setState(this);
	}

	public String toString() {
		return "MeanAndSDRangeCalculator State";
	}

	public void AddScore(int s) {
		scorelist.add(s);
	}

	public double GetMean() {
		int j = 0;
		for (int ii : scorelist) {
			j = j + ii;
		}
		return j / scorelist.size();
	}

	public double getVariance() {
		double mean = GetMean();
		double temp = 0;
		for (int ii : scorelist)
			temp += (mean - ii) * (mean - ii);
		return temp / scorelist.size();
	}

	public double getStdDev() {
		return Math.sqrt(getVariance());
	}

	double a, b, c, d, f;
	int temp;

	@Override
	public void SetMaxA(int score) {
		this.a = this.GetMean() + 1.5 * this.getStdDev();
	}

	@Override
	public void SetMaxB(int score) {
		this.b = this.GetMean() + 1 * this.getStdDev();
	}

	@Override
	public void SetMaxC(int score) {
		this.c = this.GetMean() + 0.5 * this.getStdDev();
	}

	@Override
	public void SetMaxD(int score) {
		this.d = this.GetMean();
	}

	@Override
	public void SetMaxF(int score) {
		this.f = this.GetMean() - 0.5 * this.getStdDev();
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