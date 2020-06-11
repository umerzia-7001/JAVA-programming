package LAB12_2;

public class DateBirth {
	
	private int day;
	private int month;
	private int year;
	
	DateBirth(){
		
	}
	DateBirth(int date,int month,int year)throws InvalidDOB{
		setDay(date);
		setMonth(month);
		setYear(year);
		
	}
	
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) throws InvalidDOB{
		if(day>1&&day<32) {
			this.day = day;
		}
		else {
			throw new InvalidDOB("day");
		}
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) throws InvalidDOB{
		if(month>1&&month<13) {
		this.month = month;
		}
		else {
			throw new InvalidDOB("month");
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) throws InvalidDOB{
		if(year>0)
		this.year = year;
		else {
			throw new InvalidDOB("year");
		}
	}

}
