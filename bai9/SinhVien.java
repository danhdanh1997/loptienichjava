package bai9;

import java.util.Scanner;

public class SinhVien 
{
	private String tensv;
	private String masv;
	private double dtb;
	
	public SinhVien() {
		super();
	}

	public SinhVien(String tensv, String masv, double dtb) {
		super();
		this.tensv = tensv;
		this.masv = masv;
		this.dtb = dtb;
	}

	public String getTensv() {
		return tensv;
	}

	public void setTensv(String tensv) {
		this.tensv = tensv;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public double getDtb() {
		return dtb;
	}

	public void setDtb(double dtb) {
		this.dtb = dtb;
	}

	@Override
	public String toString() {
		return "SinhVien [tensv=" + tensv + ", masv=" + masv + ", dtb=" + dtb + "]";
	}
	
	public void nhapthongtinsinhvien()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhap ten sinh vien:");
		tensv = scanner.nextLine();
		
		System.out.println("nhap ma sinh  vien:");
		masv = scanner.nextLine();
		
		System.out.println("nhap diem trung binh cua sinh vien:");
		dtb = scanner.nextDouble();
		
	}
}





















