
package project2;

/**
 *
 * @author KINGSLEY OTTO
 */
public class DateList {
    // CREATE A NEW DATENODE
    private final DateNode first = new DateNode(null);
    
    private DateNode last = first;
    
    private int length = 0;
	
    public int getLength(){
	return length;
    }
    //APPEND MOETHOD PLACES DATES IN LINKEDLIST IN UNSORTED FORM
    public void append(Date212 date){
	DateNode node = new DateNode(date);
	last.next = node;
	last = node;
	++length;
    }
    
    // INSERT METHOD TO PUT DATES IN A SORTED ORDER
    public void insert(Date212 date) {
	DateNode node = new DateNode(date);
	DateNode previous = first;
		
	while((previous.next != null) && (previous.next.data.compareTo(date) <= 0)){
            previous = previous.next;
		}
           
            node.next = previous.next;
            previous.next = node;
		
            if(node.next == null){
		last = node;
            }
            ++length;
           
        
	}
    
    //OVERRIDE IN ORDER FOR US TO CREATE OUR OWN TO STRING METHOD 
    @Override
    public String toString(){
	DateNode previous = first.next;
        String returnString = "";
        while (previous != null) {
            returnString += previous.data + " \n";
            previous = previous.next;
        }
        return returnString;
    }
}
