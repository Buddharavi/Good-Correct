class USMoney {
	int dollars;
	int cents;
	USMoney(int dlrs, int cnts) {
		if(cnts > 99) {
			dlrs+= cnts/100;
			cnts%= 100;
		}
		dollars=dlrs;
		cents=cnts;
	}
	USMoney plus(USMoney usm) {
		int dlrs;
		int cnts;
		dlrs = dollars + usm.dollars;
		cnts = cents + usm.cents;
		if(cnts > 99) {
			dlrs+= cnts/100;
			cnts%= 100;
		}
		USMoney usmnew = new USMoney(dlrs, cnts);
		return usmnew;
	}
}

class USMoneyDemo {
	public static void main(String[] args) {
		USMoney x = new USMoney(587, 5740);
		USMoney y = new USMoney(1562, 9280);
		USMoney z = x.plus(y);
		System.out.println(z.dollars + " dollars "+ z.cents + " cents " );
	}
}
