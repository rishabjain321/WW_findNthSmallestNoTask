package question_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Random;

public class SmallestInteger {
	public static Properties prop  = new Properties();

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\resources\\data.properties");
		prop.load(fis);
		
		Integer arraySize = Integer.parseInt(prop.getProperty("arraySize"));
		Integer[] randomArray = new Integer[arraySize];
		
		Random rand = new Random();
		Integer initialRange = Integer.parseInt(prop.getProperty("initialRange"));
		Integer finalRange = Integer.parseInt(prop.getProperty("finalRange"));
		for(int i = 0; i< randomArray.length; i++) {
			randomArray[i] = rand.nextInt((finalRange - initialRange)+1) + initialRange;

		}
		
		int n = Integer.parseInt(prop.getProperty("n")) ;
		int result = nthSmallestInteger(randomArray, n);
		System.out.println("The " + n + "th smallest number is:" + result);
	}

	public static int nthSmallestInteger(Integer[] arr, int n){
		Arrays.sort(arr);
		return arr[n-1];
	}
}

