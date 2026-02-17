package StringAndArray;

public class CountCharInString {

	public static void main(String[] args) {
		String string = "The best of both worlds";    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    

	System.out.println(count);
		// TODO Auto-generated method stub

	}

}
