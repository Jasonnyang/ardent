package USACO;
import java.util.Scanner;

public class backforth {
	public static void main (String[]args) {
	int[] bucketArray = new int[11];
	int[] bucketArray2 = new int[11];
	int bucketValue = 1000;
	int bucketValue2 = 1000;
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter bucket values for barn 1");
	bucketArray[0] = scan.nextInt();
	bucketArray[1] = scan.nextInt();
	bucketArray[2] = scan.nextInt();
	bucketArray[3] = scan.nextInt();
	bucketArray[4] = scan.nextInt();
	bucketArray[5] = scan.nextInt();
	bucketArray[6] = scan.nextInt();
	bucketArray[7] = scan.nextInt();
	bucketArray[8] = scan.nextInt();
	bucketArray[9] = scan.nextInt();
	System.out.println("Enter bucket values for barn 2");
	bucketArray2[0] = scan.nextInt();
	bucketArray2[1] = scan.nextInt();
	bucketArray2[2] = scan.nextInt();
	bucketArray2[3] = scan.nextInt();
	bucketArray2[4] = scan.nextInt();
	bucketArray2[5] = scan.nextInt();
	bucketArray2[6] = scan.nextInt();
	bucketArray2[7] = scan.nextInt();
	bucketArray2[8] = scan.nextInt();
	bucketArray2[9] = scan.nextInt();
	
	bucketValue = bucketValue - bucketArray[0]-bucketArray[1]-bucketArray[2]-bucketArray[3]-bucketArray[4]-bucketArray[5]-bucketArray[6]-bucketArray[7]-bucketArray[8]-bucketArray[9];
	bucketValue2 = bucketValue2 - bucketArray2[0]-bucketArray2[1]-bucketArray2[2]-bucketArray2[3]-bucketArray2[4]-bucketArray2[5]-bucketArray2[6]-bucketArray2[7]-bucketArray2[8]-bucketArray2[9];
	
	for (int i = 0; i < 10; i++) {
		bucketArray2[10] = bucketArray[i];
		for (int j = 0; j < 11; j++) {
			bucketArray[i] = bucketArray2[j];
			bucketArray2[j] = bucketArray[10];
			for (int k = 0; k < 10; k++) {
				bucketArray[k] = bucketArray2[10];
				for (int l = 0; l < 11; l++) {
					bucketArray[l] = bucketArray2[j];
				}
			}
			
		}
	}
	}
}
