
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class AdditionFromConsole {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int a =0;
		int b =0;
		int c;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		
		
		c = a+b;
		
		System.out.println("Addition="+c);
	}

}
