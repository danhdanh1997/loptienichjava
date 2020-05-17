package bai6;

import java.util.Scanner;

public class SinhVien 
{
	private String masv;
	private String hoten;
	private int dtb;
	private int diemrl;
	
	
	public SinhVien() {
		super();
	}


	public SinhVien(String masv, String hoten, int dtb, int diemrl) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.dtb = dtb;
		this.diemrl = diemrl;
	}


	public String getMasv() {
		return masv;
	}


	public void setMasv(String masv) {
		this.masv = masv;
	}


	public String getHoten() {
		return hoten;
	}


	public void setHoten(String hoten) {
		this.hoten = hoten;
	}


	public int getDtb() {
		return dtb;
	}


	public void setDtb(int dtb) {
		this.dtb = dtb;
	}


	public int getDiemrl() {
		return diemrl;
	}


	public void setDiemrl(int diemrl) {
		this.diemrl = diemrl;
	}


	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", hoten=" + hoten + ", dtb=" + dtb + ", diemrl=" + diemrl + "]";
	}
	
	public void nhapthongtin()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhap ma sinh vien:");
		masv = scanner.nextLine();
		
		System.out.println("nhap diem sinh vien:");
		dtb = scanner.nextInt();
		
		System.out.println("nhap ten sinh vien:");
		hoten = scanner.nextLine();
		
		System.out.println("nhap diem ren luyen:");
		diemrl = scanner.nextInt();
	}
	
	 public static int sortDESC(int [] arr)
	 {
	        int temp = arr[0];
	        for (int i = 0 ; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] < arr[j]) {
	                    temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }
	        }
	        return 1;
	    }
}
































