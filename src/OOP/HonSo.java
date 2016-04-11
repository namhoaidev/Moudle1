package OOP;

public class HonSo {
	private int soNguyen;
	private PhanSo phanSo;
	
	public int getSoNguyen() {
		return soNguyen;
	}

	public void setSoNguyen(int soNguyen) {
		this.soNguyen = soNguyen;
	}
	
	public HonSo() {
		setSoNguyen(0);
		phanSo = new PhanSo();
	}
	
	public HonSo(int soNguyen, int tu, int mau) {
		this.setSoNguyen(soNguyen);
		this.phanSo = new PhanSo(tu, mau);
	}
	
	public HonSo(int soNguyen, PhanSo phanSo) {
		this.setSoNguyen(soNguyen);
		this.phanSo = phanSo;
	}
	public void print() {
		System.out.println(this.soNguyen + " "+ phanSo.getTu() + "/" + phanSo.getMau());
	}
	
	public HonSo chuyenSangHonSo() {
		if(phanSo.getTu() > phanSo.getMau())
		{
			int t = phanSo.getTu()/ phanSo.getMau();
			this.phanSo.setTu(phanSo.getTu() % phanSo.getMau());
			this.setSoNguyen(this.getSoNguyen() + t);
		}
		return this;
	}
	
	public HonSo chuyenSangHonSo(PhanSo a) {
		if(a.getTu() > a.getMau())
		{
			int t = a.getTu()/ a.getMau();
			this.phanSo.setTu(a.getTu() % a.getMau());
			this.phanSo.setMau(a.getMau());
			this.setSoNguyen(t);
		}
		return this;
	}
	
	public PhanSo chuyenSangPhanSo()
	{
		PhanSo t = new PhanSo();
		t.setTu(this.soNguyen * this.phanSo.getMau() + this.phanSo.getTu());
		t.setMau(this.phanSo.getMau());
		return t;
	}
	
	public HonSo Cong(HonSo a) {
		this.setSoNguyen(this.getSoNguyen() + a.getSoNguyen());
		this.phanSo = this.phanSo.Cong(a.phanSo);
		this.chuyenSangHonSo();
		return this;
	}
	
	public HonSo Tru(HonSo a) {
		this.setSoNguyen(this.getSoNguyen() - a.getSoNguyen());
		this.phanSo = this.phanSo.Tru(a.phanSo);
		this.chuyenSangHonSo();
		return this;
	}
	
	public HonSo Nhan(HonSo a) {
		PhanSo r = this.chuyenSangPhanSo().Nhan(a.chuyenSangPhanSo());
		HonSo t = chuyenSangHonSo(r);
		return t;
	}
	
	public HonSo chia(HonSo a) {
		PhanSo r = this.chuyenSangPhanSo().Chia(a.chuyenSangPhanSo());
		HonSo t = chuyenSangHonSo(r);
		return t ;
	}
	
	
}
