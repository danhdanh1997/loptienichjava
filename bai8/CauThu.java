package bai8;

import java.util.Scanner;

public class CauThu
{
	private String ten;
	private int soao;
	private int vitrida;
	
	
	public CauThu() {
		super();
	}


	public CauThu(String ten, int soao, int vitrida) {
		super();
		this.ten = ten;
		this.soao = soao;
		this.vitrida = vitrida;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public int getSoao() {
		return soao;
	}


	public void setSoao(int soao) {
		this.soao = soao;
	}


	public int getVitrida() {
		return vitrida;
	}


	public void setVitrida(int vitrida) {
		this.vitrida = vitrida;
	}


	@Override
	public String toString() {
		return "CauThu [ten=" + ten + ", soao=" + soao + ", vitrida=" + vitrida + "]";
	}
	
	public void nhapthontin()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhap ten cau thu:");
		ten = scanner.nextLine();
		
		System.out.println("nhap so ao cua cau thu:");
		soao = scanner.nextInt();
		
		System.out.println("nhap vi tri da cua cau thu:");
		vitrida = scanner.nextInt();
	}
	
	
	
}




































