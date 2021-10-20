package fraction;

public class Mixed extends Fraction {
	public Mixed() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Mixed(Integer number,Integer numerator,Integer denominator) {
		// TODO Auto-generated method stub
		super(numerator+number*denominator,denominator);
		Integer rank;
		Boolean failSafe;
		if(getDenominator()!=0&&getNumerator()!=0) {
			for (rank = 9; rank > 2; rank--) {
				if(getDenominator()%rank==0&&getNumerator()%rank==0) {
					break;
				}
			}
		do{
			failSafe=true;
			while (failSafe) {
				if(getDenominator()%rank==0&&getNumerator()%rank==0) {
					setDenominator(getDenominator()/rank);
					setNumerator(getNumerator()/rank);
					continue;
				}
				failSafe=false;
			}
			for (rank = 9; rank > 2; rank--) {
				if(getNumerator()%rank==0&&getDenominator()%rank==0) {
					break;
				}
			}
		}while(getNumerator()%rank==0&&getDenominator()%rank==0);
		if(getNumerator()%getDenominator()==0&&getDenominator()!=1) {
			setNumerator(getNumerator()/getDenominator());
			setDenominator(getDenominator()/getDenominator());
			
		}
		if(getDenominator()%getNumerator()==0&&getNumerator()!=1) {
			setDenominator(getDenominator()/getNumerator());
			setNumerator(getNumerator()/getNumerator());
		}
		}
	}

	public Mixed multiply(Mixed mixed) {
		setNumerator(getNumerator()*mixed.getNumerator());
		setDenominator(getDenominator()*mixed.getDenominator());
		return new Mixed(0, getNumerator(), getDenominator());
	}

	public Mixed divide(Mixed mixed) {
		setNumerator(getNumerator()*mixed.getDenominator());
		setDenominator(getDenominator()*mixed.getNumerator());
		return new Mixed(0, getNumerator(), getDenominator());
	}

	public Mixed add(Mixed mixed) {
		Integer numerator,denominator;
		numerator=getNumerator()*mixed.getDenominator();
		denominator=getDenominator()*mixed.getDenominator();
		mixed.setDenominator(mixed.getDenominator()*getDenominator());
		mixed.setNumerator(mixed.getNumerator()*getDenominator());
		setNumerator(numerator+mixed.getNumerator());
		setDenominator(denominator);
		return new Mixed(0, getNumerator(), getDenominator());
	}

	public Mixed subtract(Mixed mixed) {
		Integer numerator,denominator;
		numerator=getNumerator()*mixed.getDenominator();
		denominator=getDenominator()*mixed.getDenominator();
		mixed.setDenominator(mixed.getDenominator()*getDenominator());
		mixed.setNumerator(mixed.getNumerator()*getDenominator());
		setNumerator(numerator-mixed.getNumerator());
		setDenominator(denominator);
		return new Mixed(0, getNumerator(), getDenominator());
	}

	public Mixed multiply(Proper proper) {
		setNumerator(getNumerator()*proper.getNumerator());
		setDenominator(getDenominator()*proper.getDenominator());
		return new Mixed(0, getNumerator(), getDenominator());
	}

	public Mixed divide(Proper proper) {
		setNumerator(getNumerator()*proper.getDenominator());
		setDenominator(getDenominator()*proper.getNumerator());
		return new Mixed(0, getNumerator(), getDenominator());
	}

	public Mixed add(Proper proper) {
		Integer numerator,denominator;
		numerator=getNumerator()*proper.getDenominator();
		denominator=getDenominator()*proper.getDenominator();
		proper.setDenominator(proper.getDenominator()*getDenominator());
		proper.setNumerator(proper.getNumerator()*getDenominator());
		setNumerator(numerator+proper.getNumerator());
		setDenominator(denominator);
		return new Mixed(0, getNumerator(), getDenominator());
	}

	public Mixed subtract(Proper proper) {
		Integer numerator,denominator;
		numerator=getNumerator()*proper.getDenominator();
		denominator=getDenominator()*proper.getDenominator();
		proper.setDenominator(proper.getDenominator()*getDenominator());
		proper.setNumerator(proper.getNumerator()*getDenominator());
		setNumerator(numerator-proper.getNumerator());
		setDenominator(denominator);
		return new Mixed(0, getNumerator(), getDenominator());
	}

}
