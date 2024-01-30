package finalproject;


public class BookManagement {
	
	public int entrySize;
	
	public int delete;
	
	public int BinarySearch;
	
	public int linearsearch;
	
	
public BookManagement(int entrySize, int delete, int BinarySearch, int linearsearch) {
	
	this.entrySize= entrySize;
	this.delete= delete;
	this.BinarySearch= BinarySearch;
	this.linearsearch= linearsearch;
	
}

	 
	 // BinarySearch method
	 
	    public static int BinarySearch(int ISBN[], int l, int r, int x)
	    
	    {
	        if (r >= l) {
	            int mid = l + (r - l) / 2;
	 

	            if (ISBN[mid] == x)
	            	
	                return mid;

	            if (ISBN[mid] > x)
	            	
	                return BinarySearch(ISBN, l, mid - 1, x);

	            return BinarySearch(ISBN, mid + 1, r, x);
	        }

	        return -1;
	    }
	    
	    // Linear Search Method
	    
	    public static int linearsearch(int ISBN[], int x)
	    
	    {
	        int y = ISBN.length;
	        
	        for (int i = 0; i < y; i++)
	        {
	            if (ISBN[i] == x)
	                return i;
	        }
	        return -1;
	        
	    }
}
