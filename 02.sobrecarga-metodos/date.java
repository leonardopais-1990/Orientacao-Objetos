package ex4;
import java.util.Calendar;

public class Date {
	private int day,month,year;
	private String season;
	private String strmonth;

	public Date(int day, int month, int year) {
        if (CheckDate(day,month,year)==true) {
            this.day=day;
            this.month=month;
            this.year=year;
        }else {
        	System.out.println("Valor(es) incorreto(s)");	
        }
	}
	
	public Date() {
        Calendar calendar = Calendar.getInstance();
        this.day=calendar.get(Calendar.DAY_OF_MONTH);
        this.month=calendar.get(Calendar.MONTH)+1;
        this.year=calendar.get(Calendar.YEAR);
	}
	
	public boolean CheckDate(int day, int month, int year) {
		if(this.year<0) {
			return false;
		}
		if(this.month<0 || this.month>12) {
			return false;
		}
		if(this.day<0 || this.day>30) {
			return false;
		}
		return true;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getStrmonth() {
		return strmonth;
	}
	public void setStrmonth(String strmonth) {
		this.strmonth = strmonth;
	}

	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	
	public void ShowDate() {
		System.out.println(this.day + "/" + this.month + "/" + this.year);
	}
	
	public void ShowDate(int month) {
		if(CheckSeason(month)==true) {
			System.out.println(this.day + " de " + this.strmonth + " de " + this.year + " - Estação " + this.season);
		}else {
			System.out.println(this.day + " de " + this.strmonth + " de " + this.year);
		}
	}
	
	public String StrMonth(int month) {
		if(this.month==1) {
			this.strmonth="Janeiro";
		}else if(this.month==2) {
			this.strmonth="Fevereiro";
		}else if(this.month==3) {
			this.strmonth="Março";
		}else if(this.month==4) {
			this.strmonth="Abril";
		}else if(this.month==5) {
			this.strmonth="Maio";
		}else if(this.month==6) {
			this.strmonth="Junho";
		}else if(this.month==7) {
			this.strmonth="Julho";
		}else if(this.month==8) {
			this.strmonth="Agosto";
		}else if(this.month==9) {
			this.strmonth="Setembro";
		}else if(this.month==10) {
			this.strmonth="Outubro";
		}else if(this.month==11) {
			this.strmonth="Novembro";
		}else {
			this.strmonth="Dezembro";
		}
		return strmonth;
	}
	
	public boolean CheckSeason(int month) {
		if(this.month==12 || this.month==1 || this.month==2) {
			this.season="Verão";
			return true;
		}else if(this.month==3 || this.month==4 || this.month==5) {
				this.season="Outono";
				return true;
		}else if(this.month==6 || this.month==7 || this.month==8) {
			this.season="Inverno";
			return true;
		}else if(this.month==9 || this.month==10 || this.month==11) {
			this.season="Primavera";
			return true;
		}else {
			return false;
		}
	}
	
	public void NextDate() {
		this.day=day+1;
		if(this.day>30) {
			this.day=1;	
			this.month=month+1;
			if(this.month+1>12) {
				this.month=1;
				this.year=year+1;
			}
		}
	}
		
}
