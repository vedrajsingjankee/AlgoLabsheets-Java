package AlgoLab3;

public class MyDateApplication {

	public static void main(String[] args) {
		boolean isdate1less=false;
		
		MyDate date1=new MyDate(12,3,24);
		MyDate date2=new MyDate(24,9,20);
		
		date1.assignDate(12,3,24);
		date2.assignDate(24,9,20);
		
		if(date1.getYear()<date2.getYear()) {
			isdate1less=true;
		}else if(date1.getYear()==date2.getYear() && date1.getMonth()<date2.getMonth()) {
			isdate1less=true;
		}else if(date1.getYear()==date2.getYear() && date1.getMonth()==date2.getMonth() && date1.getDay()<date2.getDay()) {
			isdate1less=true;
		}
		if(isdate1less){
			System.out.println("Formats for the earlier date: ");
			date1.displayshort();
		    date1.displayVerbose();
		}
		if(!isdate1less) {
			System.out.println("Formats for the earlier date: ");
			date2.displayshort();
		    date2.displayVerbose();
		}
		date2.nextDay();
		System.out.println("Formats for date2: ");
		date2.displayshort();
	    date2.displayVerbose();
	}

}
