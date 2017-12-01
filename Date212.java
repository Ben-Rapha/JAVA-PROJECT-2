
 package project2;

/**
 *
 * @author KINGSLEY OTTO
 */
public final class Date212 {
    private int year;
    private int month;
    private int day;
	
    public Date212(String date) {
	String temp;
        
        temp = date.substring(0,4);
	int Year = Integer.parseInt(temp);
        
	temp = date.substring(4,6);
	int Month = Integer.parseInt(temp);
        
	temp = date.substring(6,8);
	int Day = Integer.parseInt(temp);
	
	Date212(Year,Month,Day);
    }

    public void Date212(int year, int month, int day) {
	this.year = year;
	this.month = month;
	this.day = day;
	}
    
    //SET UP GET  METHODS 
    public int getYear(){
	return year;
	}
    public int getMonth(){
	return month;
	}
    public int getDay(){
	return day;
	}
   
    // METHOD TO HELP US SET UP THE INSERT METHOD FOR THE LINKEDLIST
    public int compareTo(Date212 other){
	if(this.toString().compareTo( ((Date212)other).toString()) < 0)
            return -1;
	else if(this.toString().compareTo( ((Date212)other).toString()) > 0){
            return 1; 
        }
        return 0;
	}
    
   //OVERRIDE INODER FOR US TO HAVE OUR OWNN TO STRING METHOD 
   @Override
    public String toString(){
	String returnString = Integer.toString(year) + " /" + Integer.toString(month) + " / " + Integer.toString(day)+ "  \n ";
        return returnString;
    }
    
    
   
    
}
