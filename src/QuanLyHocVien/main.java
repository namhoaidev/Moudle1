package QuanLyHocVien;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DanhSachHocVien danhSachHocVien = new DanhSachHocVien();
		int chucnang;
		do {
			System.out.println("1. Xem danh sách lớp: ");
			System.out.println("2. Thêm học viên: ");
			System.out.println("3. Xóa học viên: ");
			System.out.println("4. Tìm học viên(Theo mã HV hoặc họ tên): ");
			System.out.println("5. Cập nhật học viên: ");
			System.out.println("6. Xem menu: ");
			System.out.println("7. Thoát ứng dụng: ");
			System.out.print("Nhập chức năng: ");
			chucnang = scanner.nextInt();
			switch (chucnang) {
			case 1:
				danhSachHocVien.readHocVienFromFile("D:/danhsach.txt");
				danhSachHocVien.outputListHocVien();
				break;
			case 2:
				System.out.println("Thêm học viên: ");
				danhSachHocVien.addHocVien();
				danhSachHocVien.writeHocVienToFile("D:/danhsach.txt");
				danhSachHocVien.outputListHocVien();
				break;
			case 3:
				System.out.print("Nhập mã học viên cần xóa: ");
				int mahv = scanner.nextInt();
				danhSachHocVien.deleteHocVien(mahv - 1);
				danhSachHocVien.writeHocVienToFile("D:/danhsach.txt");
				danhSachHocVien.outputListHocVien();
				break;
			case 4:
				danhSachHocVien.searchHocVien();
				break;
			case 5:
				danhSachHocVien.updateHocVien();
				danhSachHocVien.writeHocVienToFile("D:/danhsach.txt");
				danhSachHocVien.outputListHocVien();
				break;
			case 6:		
				break;
			case 7:
				System.out.print("Đã thoát ứng dụng");
				danhSachHocVien.writeHocVienToFile("D:/danhsach.txt");
				break;
			}
		}while(chucnang != 7);
	}

}
