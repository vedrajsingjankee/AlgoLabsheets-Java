package AlgoLab3;

public class MyDate {
  private int Day;
  private int Month;
  private int Year;
  
  public MyDate() {
	Day=0;
	Month=0;
	Year=0;
  }
  
  public MyDate(int Day,int Month,int Year) {
	  this.Day=Day;
	  this.Month=Month;
	  this.Year=Year;
  }
  
  public void assignDate(int Day,int Month,int Year) {
	  this.Day=Day;
	  this.Month=Month;
	  this.Year=Year;
  }
  
  public void displayshort() {
	  System.out.println(Day+"/"+"0"+Month+"/"+Year);
  }
  
  public void displayVerbose() {
	    String monname = "";
	    switch(Month) {
	        case 1:  monname = "January"; break;
	        case 2:  monname = "February"; break;
	        case 3:  monname = "March"; break;
	        case 4:  monname = "April"; break;
	        case 5:  monname = "May"; break;
	        case 6:  monname = "June"; break;
	        case 7:  monname = "July"; break;
	        case 8:  monname = "August"; break;
	        case 9:  monname = "September"; break;
	        case 10: monname = "October"; break;
	        case 11: monname = "November"; break;
	        case 12: monname = "December"; break;
	    }
	    System.out.println(Day + " " + monname + " " + Year);
	}
  public void nextDay() {
	    String monname = "";
	    switch(Month) {
	        case 1:  monname = "January"; break;
	        case 2:  monname = "February"; break;
	        case 3:  monname = "March"; break;
	        case 4:  monname = "April"; break;
	        case 5:  monname = "May"; break;
	        case 6:  monname = "June"; break;
	        case 7:  monname = "July"; break;
	        case 8:  monname = "August"; break;
	        case 9:  monname = "September"; break;
	        case 10: monname = "October"; break;
	        case 11: monname = "November"; break;
	        case 12: monname = "December"; break;
	    }
	    Day++;
	    System.out.println(Day + " " + monname + " " + Year);
	}
  public int getDay() {
	  return Day;
  }
  public int getMonth() {
	  return Month;
  }
  public int getYear() {
	  return Year;
  }
  
}
