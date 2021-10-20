package fraction;

public abstract class Fraction implements Comparable<Fraction>{
	private Integer numerator,denominator;
	private Integer number;
	public Fraction() {
		super();
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public int compareTo(Fraction o) {
		// TODO Auto-generated method stub
		return Double.compare(getNumerator().doubleValue()/getDenominator().doubleValue(), o.getNumerator().doubleValue()/o.getDenominator().doubleValue());
	}
}
