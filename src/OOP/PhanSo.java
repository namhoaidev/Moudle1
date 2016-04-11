package OOP;

public class PhanSo {
	private int tu;
	private int mau;

	public int getTu() {
		return tu;
	}
	public void setTu(int tu) {
		this.tu = tu;
	}
	public int getMau() {
		return mau;
	}
	public void setMau(int mau) {
		if(0 == mau){
			System.out.print("Mau khong duoc = 0, mau se = 1 ");
			this.mau=  1;
		} else {
			this.mau = mau;
		}
	}
	
	public PhanSo() {}

	public PhanSo(int tu, int mau) {
		this.tu = tu;
		if(0 == mau){
			System.out.print("Mau khong duoc = 0, mau se = 1 ");
			this.mau=  1;
		} else {
			this.mau = mau;
		}
	}

	public void print() {
		System.out.println(this.tu + "/" + this.mau);
	}

	private int UCLN() {
		int t = Math.abs(this.tu);
		int m = Math.abs(this.mau);
		if(t * m == 0) {
			return 1;
		}
		while(t != m) {  
			if(t > m) {
				t -= m;
			}
			else {
				m -= t;
			}
		}
		return t;
	}
	
	public PhanSo rutGon()
	{
		int u = UCLN();
		this.tu = this.tu/u;
		this.mau = this.mau/u;
		return this;
	}
	
	public PhanSo Cong(PhanSo a)
	{
		this.tu = this.tu * a.mau + a.tu * this.mau;
		this.mau = this.mau * a.mau;
		this.rutGon();
		return this;
	}
	
	public PhanSo Tru(PhanSo a)
	{
		this.tu = this.tu * a.mau-a.tu*this.mau;
		this.mau = this.mau * a.mau;
		this.rutGon();
		return this;
	}
	
	public PhanSo Nhan(PhanSo a)
	{
		this.tu = this.tu * a.tu;
		this.mau = this.mau * a.mau;
		this.rutGon();
		return this;
	}
	
	public PhanSo Chia(PhanSo a)
	{
		this.tu = this.tu * a.mau;
		this.mau = this.mau * a.tu;
		this.rutGon();
		return this;
	}
	
}
