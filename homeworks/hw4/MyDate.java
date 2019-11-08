
public class MyDate {
	int Gun;
	int Ay;
	int Yil;
	public MyDate(int g, int a, int y) {
		
		Gun=g;
		Ay=a;
		Yil=y;
	}
	public int incrementDay() {
		Gun++;
		if(Ay==1 || Ay == 3 || Ay == 5 || Ay == 7 || Ay == 8 || Ay == 10 ||
				Ay ==12) {
			if(Gun>31) {
				Gun=1;
				Ay++;
				if(Ay>12) {
					Yil++;
					Ay=1;
					
				}
			}
		}
		else if(Gun>28 && (Yil != 2016 || Yil != 2020 || Yil != 2024)) {
			Ay++;
			Gun=1;
			
		}
		return Gun;
	}
	public int incrementYear(int y) {
		return Yil +=y ;		
	}
	public int decrementDay(int g) {
		Gun -= g;
		if(Gun < 1 &&(Ay==1 || Ay == 5 || Ay == 7 || Ay == 8 || Ay == 10 ||
				Ay ==12)) {
			Gun=30-(g%30);
			Ay-=g/30;
			if(Ay<1) {
				Yil--;
				Ay=12;
			}
		}
		else if(Gun < 1 &&(Ay == 2 || Ay == 4 || Ay == 6 || Ay == 9 || Ay == 11)) {
			Gun=31-(g%31);
			Ay-=g/31;
			if(Ay<1) {
				Yil--;
				Ay=12;
			}
		}
		else if(Gun < 1 && Ay == 3) {
			
			if(Yil==2016 || Yil == 2020 || Yil == 2024){
				Gun-=g/29;
				Ay=2;
			}
		}
		return Gun;
	}
	public int decrementDay() {
		Gun--;
		if(Gun < 1) {
			Gun=1;
			Ay--;
			if(Ay<1) {
				Yil--;
				Ay=12;
			}
		}
		return Gun;
	}
	public int decrementYear() {
		return Yil--;
	}
	public int decrementMonth() {
		Ay--;
		if(Ay<1) {
			Ay=12;
			Yil--;
			Gun=31;
		}
		return Ay;
	}
	public int incrementDay(int g) {
		Gun+=g;
		if(Gun>31 && (Ay==1 || Ay == 3 || Ay == 5 || Ay == 7 || Ay == 8 || Ay == 10 ||
				Ay ==12)) {
			Gun=g%31;
			Ay+=g/31;
		}
		else if(Gun > 30 &&(Ay == 4 || Ay == 6 || Ay == 9 || Ay == 11)) {
			Gun=g%30;
			Ay+=g/30;
		}
		else if(Gun>28 && Ay == 2 &&(Yil !=2016 || Yil != 2020 || Yil != 2024)) {
			Gun=g%28;
			Ay+=g/28;
		}
		else if(Gun>29 && Ay == 2 &&(Yil ==2016 || Yil == 2020 || Yil == 2024)) {
			Gun=g%29;
			Ay+=g/29;
		}
		return Gun;
	}
	public int decrementMonth(int a) {
		Ay-=a;
		if(Ay < 1 ) {
			Ay=12+Ay;
			Yil--;
		}
		return Ay;
	}
	public int incrementMonth(int a) {
		Ay+=a;
		if(Ay > 12 ) {
			Ay=Ay%12;
			Yil++;
		}
		return Ay;
	}
	public int decrementYear(int y) {
		return Yil-=y;		
	}
	public int incrementMonth() {
		Ay++;
		if(Ay>12) {
			Ay=Ay%12;
			Yil++;
		}
		return Ay;
	}
	public int incrementYear() {
		return Yil++;
	}
	public boolean isBefore(MyDate anotherDate) {
		boolean situation=false;
		if(Yil>anotherDate.Yil)
			situation=false;
		else if(Yil==anotherDate.Yil) {
			if(Ay>anotherDate.Ay)
				situation=false;
			else if(Ay == anotherDate.Ay) {
				if(Gun>anotherDate.Gun)
					situation=false;
				else
					situation=true;
			}				
			else
				situation=true;
		}
		else
			situation=true;
		return situation;
	}
	public boolean isAfter(MyDate anotherDate) {
		boolean situation=false;
		if(Yil>anotherDate.Yil)
			situation=true;
		else if(Yil==anotherDate.Yil) {
			if(Ay>anotherDate.Ay)
				situation=true;
			else if(Ay == anotherDate.Ay) {
				if(Gun>anotherDate.Gun)
					situation=true;
				else
					situation=false;
			}				
			else
				situation=false;
		}
		else
			situation=false;
		return situation;
	}
	public int dayDifference(MyDate anotherDate) {
		int Day=Gun-anotherDate.Gun;
		int Month=Ay-anotherDate.Ay;
		int Year=Yil-anotherDate.Yil;
		int result=Day+(Month*30)+(Year*365);
		return result;
	}
}
