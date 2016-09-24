class Date{
	int day,month,year;
	Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	void daysSinceJan1(){
	if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
		int a;
		a=day+31;
		System.out.println("No of days: "+a);
	}
	else if(month==4||month==6||month==9||month==11){
		int b;
		b=day+30;
		System.out.println("No of days: "+b);
	}
	else if(month==2){
		int c;
		if (year%4==0){
			c=day+28; 
			System.out.println("No of days: "+c);
			}
		else {
			c=day+29;
			System.out.println("No of days: "+c);
			}
	}
	}
}
class DateTest{
	public static void main(String[] args){
		Date date=new Date(12,8,2003);
		date.daysSinceJan1();
		}
}