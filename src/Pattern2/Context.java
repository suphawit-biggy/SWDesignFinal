package Pattern2;

/**
 * @author Suphawit Kasemsirisopha [572115056] on Dec 12, 2016
 */
public class Context {
	private IGradeCalculator iGradeCalculator;

	public Context() {
		iGradeCalculator = null;
	}

	public void setState(IGradeCalculator iGradeCalculator) {
		this.iGradeCalculator = iGradeCalculator;
	}

	public IGradeCalculator getState() {
		return iGradeCalculator;
	}

}
