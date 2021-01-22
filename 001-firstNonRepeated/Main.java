import java.util.*;

public class Main {

	public static void main(String[] args) {
		String input = "";
		Character output = firstNonRepeatedCharacter(input);
		System.out.println("result: " + output);
	}

	public static Character firstNonRepeatedCharacter(String str) {
		LinkedHashMap<Character, Integer> mapCharCounter = new LinkedHashMap<>();
	    
	    for (int i = 0; i < str.length(); i++){
	        Character c = str.charAt(i);
	        Integer counter = mapCharCounter.getOrDefault(c, 0);

	        mapCharCounter.put(c, counter.intValue()+1);
	    }
	    
	    for (Map.Entry<Character, Integer> entry : mapCharCounter.entrySet()) {
	    	Character c = entry.getKey();
	    	Integer counter = entry.getValue();
	    	
	    	if(counter.intValue() == 1) return c;
	    }
	    
	    return null;
	}
}

