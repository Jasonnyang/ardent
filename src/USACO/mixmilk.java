package USACO;

import java.util.*;
import java.io.*;

public class mixmilk {
	
	public static void main (String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("mixmilk.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int Capacity1 = Integer.parseInt(st.nextToken());
		int Milk1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int Capacity2 = Integer.parseInt(st.nextToken());
		int Milk2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int Capacity3 = Integer.parseInt(st.nextToken());
		int Milk3 = Integer.parseInt(st.nextToken());

		
		for (int i = 0; i < 33; i++ ) {
			//Container 1 -> 2
			if (Milk1 > Capacity2) {
				Milk1 = Milk1 - (Capacity2 - Milk2);
				Milk2 = Capacity2;
			}
			else {
				Milk2 = Milk1 + Milk2;
				Milk1 = 0;
			}
			//Container 2 -> 3
			if (Milk2 > Capacity3) {
				Milk2 = Milk2 - (Capacity3 - Milk3);
				Milk3 = Capacity3;
			}
			else {
				Milk3 = Milk2 + Milk3;
				Milk2 = 0;
			}
			//Container 3 -> 1
			if (Milk3 > Capacity1) {
				Milk3 = Milk3 - (Capacity1 - Milk1);
				Milk1 = Capacity1;
			}
			else {
				Milk1 = Milk3 + Milk1;
				Milk3 = 0;
			}
		}
		//For mix #100
		if (Milk1 > Capacity2) {
			Milk1 = Milk1 - (Capacity2 - Milk2);
			Milk2 = Capacity2;
		}
		else {
			Milk2 = Milk2 + Milk1;
			Milk1 = 0;
		}
		pw.println(Milk1);
		pw.println(Milk2);
		pw.println(Milk3);
		pw.close();
	}
}
