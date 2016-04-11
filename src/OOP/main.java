package OOP;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tu;
		int mau;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap tu: ");
		tu = scanner.nextInt();
		System.out.print("Nhap mau: ");
		mau = scanner.nextInt();
		PhanSo ps = new PhanSo(tu, mau);
		
		int soNguyen;
		System.out.print("Nhap so nguyen: ");
		soNguyen = scanner.nextInt();
		System.out.print("Nhap tu: ");
		tu = scanner.nextInt();
		System.out.print("Nhap mau: ");
		mau = scanner.nextInt();
		PhanSo ps1 = new PhanSo(tu, mau);
		HonSo honSo = new HonSo(soNguyen, ps1);
	}

}
