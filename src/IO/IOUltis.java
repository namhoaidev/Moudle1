package IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOUltis {
	public static void readFileEven(String path) {
		try {
			BufferedReader bufferedReader = new BufferedReader(
					new FileReader(path));
			
			String s = "";
			int len = 0;
			char[] buffer = new char[512];
			
			while((len = bufferedReader.read(buffer)) != -1) {
				s += new String(buffer, 0, len);
			}
			
			for(int i = 0; i < s.length(); i++) {
				if(0 == i % 2) {
					System.out.print(s.charAt(i));
				}
			}
			
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static int kiemTraRelate3(int n) {
		int temp = 0;
		while (n > 0) {
			temp = n % 10;
			if(temp == 3) {
				return 1;
			}
			n = n / 10;	
		}
		return 0;
	}
	
	public static int kiemTraSoNguyenTo(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}
	
	public static void readFileRelate3(String path) {
		try {
			BufferedReader bufferedReader = new BufferedReader(
					new FileReader(path));
			
			String s = "";
			int len = 0;
			char[] buffer = new char[512];
			
			while((len = bufferedReader.read(buffer)) != -1) {
				s += new String(buffer, 0, len);
			}
			
			for(int i = 0; i < s.length(); i++) {
				if(i % 3 == 0 || kiemTraRelate3(i) == 1) {
					System.out.print(s.charAt(i));
				}
			}
			
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void readFileSoNguyenTo(String path) {
		try {
			BufferedReader bufferedReader = new BufferedReader(
					new FileReader(path));
			
			String s = "";
			int len = 0;
			char[] buffer = new char[512];
			
			while((len = bufferedReader.read(buffer)) != -1) {
				s += new String(buffer, 0, len);
			}
			
			for(int i = 0; i < s.length(); i++) {
				if(kiemTraSoNguyenTo(i) == 1) {
					System.out.print(s.charAt(i));
				}
			}
			
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
