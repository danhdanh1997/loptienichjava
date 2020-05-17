package bai6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		int n ;
		System.out.println("nhap n sinh vien:");
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		SinhVien []sinhViens = new SinhVien[n];
		List<SinhVien>sv = new ArrayList<SinhVien>();
		
		for (int i = 0; i < sinhViens.length; i++)
		{
			sinhViens[i] = new SinhVien();
			sinhViens[i].nhapthongtin();
			sv.add(sinhViens[i]);
		}
		
		
		for (int i = 1; i <=sv.size(); i++) 
		{
			
		}
	}
	
	
}
























