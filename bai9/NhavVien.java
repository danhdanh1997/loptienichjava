package bai9;

import java.util.Scanner;

public class NhavVien 
{
	private String tennv;
	private String manv;
	private double luong;
	
	public NhavVien() {
		super();
	}

	public NhavVien(String tennv, String manv, double luong) {
		super();
		this.tennv = tennv;
		this.manv = manv;
		this.luong = luong;
	}

	public String getTennv() {
		return tennv;
	}

	public void setTennv(String tennv) {
		this.tennv = tennv;
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	@Override
	public String toString() {
		return "NhavVien [tennv=" + tennv + ", manv=" + manv + ", luong=" + luong + "]";
	}
	
	public void nhapthongtinnhanvien()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap ten nhan vien");
		tennv = scanner.nextLine();
		
		System.out.println("nhap manv");
		manv = scanner.nextLine();
		
		System.out.println("nhap luong cua nhan vien:");
		luong = scanner.nextDouble();
	}
	
}















