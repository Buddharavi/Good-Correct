class Card{
	int rank;
	char suit;
	Card(int rank,char suit){
		this.rank=rank;
		this.suit=suit;
	}
	char getSuit(){
		return this.suit;
	}
	int getRank(){
		return this.rank;	
	}
}
class CardTester{
	public static void main(String[] args){
		int i,j;
		char a;
		Card card1=new Card(2,'J');
		Card card2=new Card(2,'K');
		Card card3=new Card(2,'Q');
		Card card4=new Card(3,'J');
		Card card5=new Card(4,'A');
		i=card1.getRank();
		a=card1.getSuit();
		System.out.print(i);
		System.out.println(a);
		i=card2.getRank();
		a=card2.getSuit();
		System.out.print(i);
		System.out.println(a);
		i=card3.getRank();
		a=card3.getSuit();
		System.out.print(i);
		System.out.println(a);
		i=card4.getRank();
		a=card4.getSuit();
		System.out.print(i);
		System.out.println(a);
		i=card5.getRank();
		a=card5.getSuit();
		System.out.print(i);
		System.out.println(a);
	}
}	