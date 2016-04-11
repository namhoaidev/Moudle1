package QuanLyHocVien;

public class HocVien {
	private String mahv;
	private String ten;
	private String ngaysinh;
	private String email;
	private String diachi;
	private String sdt;
	
	public String getMahv() {
		return mahv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public HocVien(String mahv, String ten, String ngaysinh, String email, String diachi,
			String sdt) {
		this.mahv = mahv;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.email = email;
		this.diachi = diachi;
		this.sdt = sdt;
	}
	
	public String toString() {
		return "Mã học viên: " + this.mahv + "\n" + "Tên học viên: " + this.ten + "\n"
				+ "Ngày sinh học viên: " + this.ngaysinh + "\n" + "Email học viên: " + this.email + "\n"
				+ "Địa chỉ học viên: " + this.diachi + "\n" + "SĐT học viên: " + this.sdt;
		
	}
	
	public String writeHocVien() {
		return this.mahv + "-" + this.ten + "-" + this.ngaysinh + "-" + this.email + "-" + this.diachi
				+ "-" + this.sdt + "\n";
	}
}
