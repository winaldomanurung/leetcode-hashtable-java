package problem0705DesignHashSet;

public class MyHashSet {
	public int array[];
	public int count;
	public int sizeOfArray;
	
    public MyHashSet() {
    	// initialize the array
    	array = new int[1];
    	count = 0;
    	sizeOfArray = 1;
    }
    
    public void add(int key) {
        if(count == sizeOfArray) {
        	int temp[] = new int[sizeOfArray * 2];
        	
        	for(int i = 0; i<sizeOfArray; i++) {
        		temp[i] = array[i];
        	}
        	
        	array = temp;
        	sizeOfArray = sizeOfArray *2;
        	
        }
        
        //appends an element at the end of the array   
        array[count] = key;   
        count++;  
    }
    
    public void remove(int key) {
        
    }
    
    public boolean contains(int key) {
        return true;
    }

}

