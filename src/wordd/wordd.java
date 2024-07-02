package wordd;

import java.util.*;
import java.io.*;

public class wordd {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String alpa = bf.readLine().toUpperCase();
		int[] st = new int[26];
		int max =st[0];
		int dd =0;
		
		for(int i = 0; i < alpa.length(); i++) {
			int index = alpa.charAt(i) - 65;
			st[index]++;
		}
		for(int i =0; i<st.length;i++) {
			if(st[i] > max) {
				max = st[i];
			}
		}
		for(int i =0; i<st.length;i++) {
			if(st[i] == max) {
				++dd;
			}
			
		}
		for(int i =0; i<st.length;i++) {
			if(dd == 1) {
				if(max == st[i]) {
					System.out.print((char)(i+65));
				}
			}
			else {
				System.out.print("?");
				break;
			}
			
		}
		
		
	}
}