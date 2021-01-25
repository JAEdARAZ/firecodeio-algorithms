import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] src = new int[] {5,4,3}; 
		System.out.println(Arrays.toString(bubbleSortArray(src)));
	}
	
	public static int[] bubbleSortArray(int[] arr){
	    if(arr==null || arr.length==1) return arr; 
		    
	    int changes;
	    do {
	    	changes = 0;
	    	
	        for(int i=0; i<arr.length-1; i++){
	            if(arr[i] > arr[i+1]){
	                changes++; 
	                
	                int aux = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = aux;
	            }
	        }
	    }
	    while(changes>0);

	    return arr;
	}
	
}

