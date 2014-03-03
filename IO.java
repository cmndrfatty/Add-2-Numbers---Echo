	import java.io.*;


    public class InputOutput {
    	
    	public static void main(String[] args) throws IOException{
    		
    		InputStreamReader isr = new InputStreamReader(System.in);
    		BufferedReader br = new BufferedReader(isr);
    		int number = 0;
    				
    		String input1 = "";
    		String input2 = "";
    		System.out.println("Please enter two numbers: " +"\n(Hint:Type first number. Press enter. Then type second number. Press enter)");
    		System.out.println(input1);
    		System.out.println(input2);
    		
    		input1 = br.readLine();
    		input2 = br.readLine();
    		System.out.println("Hello, you've entered: " + input1 + " and " + input2);
    		input1 = br.readLine();
    		input2 = br.readLine();
    		number = Integer.parseInt(input1);
    		System.out.println((number + 10));
    		
    		
    	}
    }
