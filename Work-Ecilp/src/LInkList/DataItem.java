package LInkList;

public class DataItem {
	public String	Work; 	// data item: name as String
	public String	Discussion; 
	public int 	Key; 			// data item: Number or ID
	public DataItem next; 			// next DataItem in list
	public int M = 4;
	// Constructor
	public DataItem(String Work,String Discussion )
	{
		this.Work = Work; // initialize data
		this.Discussion = Discussion;
		
		
		// 'next' is automatically
		// set to null
	} 
	
	// Override: toString method
	public String toString() {
		return ("{" + this.Work + ", " + this.Key + "} ");
	}

	public String getWork() {
		return Work;
	}

	public String getDiscussion() {
		return Discussion;
	}
}
