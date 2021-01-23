public class Main {

	public static void main(String[] args) {
		int[] src = new int[] {5,4,3}; 
		System.out.println(binarySearch(src, 4));
	}
	
	public static Boolean binarySearch(int[] arr, int n){
	    if(arr.length==0) return false;
	    
	    int low = 0; 
	    int mid = 0;
	    int high = arr.length-1;
	    
	    while(low<=high){
	        mid = low + (high-low)/2;
	        
	        if(n == arr[mid]) return true;
	        
	        if(n > arr[mid]){
	            low = mid+1;
	        }
	        else{
	            high = mid-1;
	        }
	    }
	    
	    return false;
	}
	
}

