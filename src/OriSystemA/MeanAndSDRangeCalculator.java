package OriSystemA;

import java.util.*;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Dec 12, 2016
 */
public class MeanAndSDRangeCalculator {
	private List<Integer> scorelist = new ArrayList<Integer>();

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

	public double GetMaxForGradeA() {
		return this.GetMean() + 1.5 * this.getStdDev();
	}

	public double GetMaxForGradeB() {
		return this.GetMean() + 1 * this.getStdDev();
	}

	public double GetMaxForGradeC() {
		return this.GetMean() + 0.5 * this.getStdDev();
	}

	public double GetMaxForGradeD() {
		return this.GetMean();
	}

	public double GetMaxForGradeF() {
		return this.GetMean() - 0.5 * this.getStdDev();
	}

	public double GetMinForGradeA() {
		return this.GetMean() + 1.0 * this.getStdDev();
	}

	public double GetMinForGradeB() {
		return this.GetMean() + 0.5 * this.getStdDev();
	}

	public double GetMinForGradeC() {
		return this.GetMean();
	}

	public double GetMinForGradeD() {
		return this.GetMean() - 0.5 * this.getStdDev();
	}

	public double GetMinForGradeF() {
		return this.GetMean() - this.getStdDev();
	}
}