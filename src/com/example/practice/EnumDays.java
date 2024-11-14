package com.example.practice;

enum Day{
	MONDDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	

public String getDayType() {
	switch(this) {
	case SATURDAY:
	case SUNDAY:
		return "Weekend";
		default:
			return "Weekday";
		
	}
	
}
public boolean isWeekend() {
	return this==SATURDAY || this==SUNDAY;
}
@Override
public String toString() {
	return this.name().charAt(0)+this.name().substring(1).toLowerCase();
}
public int compareDays(Day day) {
	return this.compareTo(day);
}

}
public class EnumDays {

	public static void main(String[] args) {
		for(Day day:Day.values()) {
			System.out.println(day+" is a "+day.getDayType());
		}
		Day today=Day.SATURDAY;
		System.out.println("\ns "+today+" a weekend? "+today.isWeekend());
		
		Day day1 = Day.WEDNESDAY;
        Day day2 = Day.FRIDAY;
        int comparison = day1.compareDays(day2);
        
        System.out.print("\nComparison between " + day1 + " and " + day2 + ": ");
        if (comparison < 0) {
            System.out.println(day1 + " is earlier than " + day2);
        } else if (comparison > 0) {
            System.out.println(day1 + " is later than " + day2);
        } else {
            System.out.println(day1 + " and " + day2 + " are the same day.");
        }
		 
		

	}

}
