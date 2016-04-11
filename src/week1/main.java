package week1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nam;
		int n;
		System.out.print("Nhap nam: ");
		nam = scanner.nextInt();
		
		System.out.print("Nhap n kiem tra so nguyen to: ");
		n = scanner.nextInt();
		if(n == 1) {
			System.out.println("Day la so nguyen to");
		} else {
			System.out.println("Day khong phai la so nguyen to");
		}
		
		System.out.print("Nhap n kiem tra so chinh phuong: ");
		n = scanner.nextInt();
		soChinhPhuong(n);
		
		System.out.print("Nhap n kiem tra so lap phuong: ");
		n = scanner.nextInt();
		soLapPhuong(n);
		
		System.out.print("Nhap n kiem tra so doi xung: ");
		n = scanner.nextInt();
		soDoiXung(n);
		
		System.out.print("Nhap n kiem tra so hoan thien: ");
		n = scanner.nextInt();
		soHoanThien(n);
		
		System.out.print("Nhap n in day Fibonacci: ");
		n = scanner.nextInt();
		printFib(n);
		
		System.out.print("Nhap n de tinh tong 1 + 2 + 3 + ... + n : ");
		n = scanner.nextInt();
		int sum = 0;
		sum = tinhTong(n);
		System.out.println("Tong cua: 1 + 2 + 3 + ... + n la: " + sum);
		
		System.out.print("Nhap n de tinh tong 1/2 + 3/4 + ... + (n - 1)/n: ");
		n = scanner.nextInt();
		double sum1 = 0;
		sum1 = tinhTong1(n);
		System.out.println("Tong 1/2 + 3/4 + ... + (n - 1)/n la: " + sum1);
		
		System.out.print("Nhap n de tinh giai thua: ");
		n = scanner.nextInt();
		long giaithua = 0;
		giaithua = giaiThua(n);
		System.out.println("Giai thua la: " + giaithua);
	}

	public static void kiemTraNamNhuan(int nam) {
		if((0 == nam % 400) || (0 == nam % 4 && 0 != nam % 100)) {
			System.out.println("Nam " + nam + " la nam nhuan");
		}
		else {
			System.out.println("Nam " + nam + " khong phai la nam nhuan");
		}
	}

	public static int kiemTraSoNguyenTo(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}

	public static void soChinhPhuong(int n) {
		int dem = 0;
		for(int i = 2; i < n; i++) {
			if((i * i) == n) {
				dem = 1;
				break;
			}
		}
		if(dem==1) {
			System.out.println("La so chinh phuong");
		} else {
			System.out.println("Khong phai la so chinh phuong");
		}
	}

	public static void soLapPhuong(int n) {
		double m = Math.cbrt(n);
		if (Math.round(m) == m) {
			System.out.println("La so lap phuong ");
		} else {
			System.out.println("Khong phai so lap phuong");
		}
	}

	public static void soDoiXung(int n) {
		int soDu = 0;
		int soDao = 0;
		while (n > 0) {
			soDu = n % 10;
			soDao = soDao * 10 + soDu;
			n = n / 10;
		}

		if (soDao == n) {
			System.out.println("La so doi xung");
		} else {
			System.out.println("Khong phai so doi xung");
		}
	}

	public static void soHoanThien(int n) {
		int s = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				s = s + i;
			}
		}

		if(s == n) {
			System.out.println("La so hoan thien");
		} else {
			System.out.println("Khong phai la so hoan thien");
		}
	}

	public static int fib(int n) {
		if(1 == n || 2 == n) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static void printFib(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(fib(i));
		}
	}

	public static int tinhTong(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++) {
			sum = sum + i;
		}

		return sum;
	}

	public static double tinhTong1(double n) {
		double sum = 0;
		for (int i = 2; i <= n; i = i + 2) {
			sum = sum + ((i - 1) / (i));
		}

		return sum;
	}

	public static long giaiThua(int n) {
		long giaithua = 1;
		for(int i = 1; i <= n; i++)
		{
			giaithua = giaithua * i;
		}
		
		return giaithua;
	}
}
