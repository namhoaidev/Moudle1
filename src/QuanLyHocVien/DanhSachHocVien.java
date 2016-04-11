package QuanLyHocVien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachHocVien {
	private List<HocVien> hocviens = new ArrayList<>();

	public void readHocVienFromFile(String srcPath) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputStream = new FileInputStream(srcPath);
			File f = new File(srcPath);
			Scanner scanner = new Scanner(f);

			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split("-");
				String mahv = parts[0];
				
				String ten = parts[1];
				String ngaysinh = parts[2];
				String email = parts[3];
				String diachi = parts[4];
				String sdt = parts[5];
				HocVien hocVien = new HocVien(mahv, ten, ngaysinh, email, diachi, sdt);
				hocviens.add(hocVien);
			}
			
			fileInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeHocVienToFile(String desPath) {
		// TODO Auto-generated method stub
		try {			
			BufferedWriter bufferedWriter = new BufferedWriter(
					new FileWriter(desPath));

			for(HocVien hv: hocviens) {
				bufferedWriter.write(hv.writeHocVien());							
			}

			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<HocVien> getHocviens() {
		return hocviens;
	}

	public void setHocviens(List<HocVien> hocviens) {
		this.hocviens = hocviens;
	}

	public void outputListHocVien() {
		for(HocVien hv: hocviens) {
			System.out.println(hv.toString());
		}	
	}

	public void addHocVien() {
		Scanner scanner = new Scanner(System.in);
		String mahv = (String) (hocviens.get(hocviens.size() - 1).getMahv() + 1);
		System.out.println("Mã học viên thứ: " + mahv);
		System.out.print("Nhập tên học viên: ");
		String ten = scanner.nextLine();
		System.out.print("Nhập ngày sinh học viên: ");
		String ngaysinh = scanner.nextLine();
		System.out.print("Nhập email học viên: ");
		String email = scanner.nextLine();
		System.out.print("Nhập địa chỉ học viên: ");
		String diachi = scanner.nextLine();
		System.out.print("Nhập sdt học viên: ");
		String sdt = scanner.nextLine();

		HocVien hv = new HocVien(mahv, ten, ngaysinh, email, diachi, sdt);
		hocviens.add(hv);
	}

	public void deleteHocVien(int mahv) {
		hocviens.remove(mahv);
	}
	
	public void searchHocVien() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã học viên hoặc họ tên cần tìm: ");
		String query = scanner.nextLine();
		query.toLowerCase();
		for(HocVien hv : hocviens) {
			if(hv.getMahv().toLowerCase().contains(query) || hv.getTen().contains(query)) {
				System.out.println(hv.toString());
			}
		}
	}
	
	public void updateHocVien() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã học viên cần cập nhật: ");
		String mahv = scanner.nextLine();
		for(HocVien hv : hocviens) {
			if(hv.getMahv().toLowerCase().contains(mahv)) {
				System.out.print("Nhập tên học viên: ");
				String ten = scanner.nextLine();
				System.out.print("Nhập ngày sinh học viên: ");
				String ngaysinh = scanner.nextLine();
				System.out.print("Nhập email học viên: ");
				String email = scanner.nextLine();
				System.out.print("Nhập địa chỉ học viên: ");
				String diachi = scanner.nextLine();
				System.out.print("Nhập sdt học viên: ");
				String sdt = scanner.nextLine();
				hv.setTen(ten);
				hv.setDiachi(diachi);
				hv.setEmail(email);
				hv.setNgaysinh(ngaysinh);
				hv.setSdt(sdt);
				System.out.println("Cập nhật thành công");
			}
		}
	}
}
