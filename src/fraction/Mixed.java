package fraction;

public class Mixed extends Fraction {
//	private Integer numerator,denominator;
	public Mixed() {
		// TODO Auto-generated constructor stub
		super();
	}
	
//	public Mixed(Integer number,Integer numerator,Integer denominator) {
//		super(numerator+number*denominator,denominator);
////		this.numerator = numerator+number*denominator;
////		this.denominator = denominator;
//	}
//	public Integer getDenominator() {
//		return super.getDenominator();
//	}
//
//	public Integer getNumerator() {
//		return super.getNumerator();
//	}
//
//	public void setNumerator(Integer numerator) {
//		super.setNumerator(numerator);
//	}
//
//	public void setDenominator(Integer denominator) {
//		super.setDenominator(denominator);
//	}

	public Mixed(Integer number,Integer numerator,Integer denominator) {
		// TODO Auto-generated method stub
		super(numerator+number*denominator,denominator);
		setNumber(number);
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
//					denominator=denominator/rank;
//					numerator=numerator/rank;
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
//			numerator=numerator/denominator;
//			denominator=denominator/denominator;
			setNumerator(getNumerator()/getDenominator());
			setDenominator(getDenominator()/getDenominator());
			
		}
		if(getDenominator()%getNumerator()==0&&getNumerator()!=1) {
//			denominator=denominator/numerator;
//			numerator=numerator/numerator;
			setDenominator(getDenominator()/getNumerator());
			setNumerator(getNumerator()/getNumerator());
		}
//			output=numerator.intValue()+"/"+denominator.intValue();
		}
//		else {
//			output=number+" "+numerator.intValue()+"/"+denominator.intValue();
//		}
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

//	public void multiply(Decimal decimal) {
//		this.numerator=this.numerator*decimal.getDenomin();
//		this.denominator=this.denominator*decimal.getNumer();
//	}
//
//	public void divide(Decimal decimal) {
//		this.numerator=this.numerator*decimal.getNumer();
//		this.denominator=this.denominator*decimal.getDenomin();
//	}
//
//	public void add(Decimal decimal) {
//		Integer numerator,denominator;
//		numerator=this.numerator*decimal.getNumer();
//		denominator=this.denominator*decimal.getNumer();
//		decimal.setDenomin(decimal.getDenomin()*this.denominator);
//		decimal.setNumer(decimal.getNumer()*this.denominator);
//		this.numerator=numerator+decimal.getDenomin();
//		this.denominator=denominator;
//	}
//
//	public void subtract(Decimal decimal) {
//		Integer numerator,denominator;
//		numerator=this.numerator*decimal.getNumer();
//		denominator=this.denominator*decimal.getNumer();
//		decimal.setDenomin(decimal.getDenomin()*this.denominator);
//		decimal.setNumer(decimal.getNumer()*this.denominator);
//		this.numerator=numerator-decimal.getDenomin();
//		this.denominator=denominator;
//	}
}
