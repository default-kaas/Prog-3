package Calendar;

public class Calendar {
	
	public static void main(String [ ] args) {
		Calendar calendar = new Calendar();
		 calendar.print("September");
	}
	
	void print(String month) {
		 int startday = 0;
		 int lastday = 0;
		 
		 String weekdays = "Mo Tu We Th Fr Sa Su";
		 
		 final StringBuilder calendar = new StringBuilder();
		 
		 calendar.append(weekdays).append("\n");
		 
		 
		 System.out.println(2017 + "\n" + month);
		 
		 switch(month) {
		 case "Januari": startday = 7; lastday = 31; break;
		 case "Februari": startday = 3; lastday = 28; break;
		 case "Maart":startday = 3; lastday = 31; break;
		 case "April":startday = 6; lastday = 30; break;
		 case "Mei":startday = 1; lastday = 31; break;
		 case "Juni":startday = 4; lastday = 30; break;
		 case "Juli":startday = 6; lastday = 31; break;
		 case "Augustus":startday = 2; lastday = 31; break;
		 case "September":startday = 5; lastday = 30; break;
		 case "Oktober":startday = 7; lastday = 31; break;
		 case "November":startday = 3; lastday = 30; break;
		 case "December":startday = 5; lastday = 31; break;
		 }
		 
		 int day = 1;
		 
		 for(int a=1; a <= 5; a++) {
			 for(int b=1; b <= 7; b++) {
				 if(a == 5 && b == lastday +1) {
					 System.out.print(calendar.toString());
				 }
				 
				 if(a == 1 && b < startday) {
					 System.out.print(" ");
					 b++;
				 }
				 
				 if(day / 10 >= 1) {
					 
				 }else{
					 
				 }
				 
			 }
		 }

	}
	
}
