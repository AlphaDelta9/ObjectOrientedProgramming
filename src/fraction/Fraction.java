package fraction;

public abstract class Fraction implements Comparable<Fraction>{
	private Integer numerator,denominator;
	public Fraction() {
	}
	public Fraction(Integer numerator,Integer denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
	public Integer getNumerator() {
		return numerator;
	}
	public Integer getDenominator() {
		return denominator;
	}
	public void setNumerator(Integer numerator) {
		this.numerator = numerator;
	}
	public void setDenominator(Integer denominator) {
		this.denominator = denominator;
	}

	@Override
	public int compareTo(Fraction o) {
		// TODO Auto-generated method stub
		return Double.compare(getNumerator().doubleValue()/getDenominator().doubleValue(), o.getNumerator().doubleValue()/o.getDenominator().doubleValue());
	}
}
