package bai9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
	 
   public static <T extends Comparable<T>> T maximum(T x, T y) 
   {
      T max = x;   // assume x is initially the largest
      
      if(y.compareTo(max) > 0) {
         max = y;   // y is the largest so far
      }
      return max;   // returns the largest object   
   }
	   
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int N;
		System.out.println("nhap N nhan vien:");
		N = scanner.nextInt();
		
		NhavVien[] nViens = new NhavVien[N];
		List<NhavVien> nhavViens = new ArrayList<NhavVien>();
		for(int i=0 ;i< N;i++)
		{
			nViens[i] = new NhavVien();
			nViens[i].nhapthongtinnhanvien();
			nhavViens.add(nViens[i]);
		}
		
		for(int i=1;i <= nhavViens.size();i++)
		{
			maximum(nhavViens.get(i).getLuong(), nhavViens.get(i-1).getLuong());
		}
		
		
		int M;
		System.out.println("nhap M nhan vien:");
		M = scanner.nextInt();
		
		SinhVien[] sViens = new SinhVien[M];
		List<SinhVien>sinhViens = new ArrayList<SinhVien>();
		for(int i=0 ;i< M;i++)
		{
			sViens[i] = new SinhVien();
			sViens[i].nhapthongtinsinhvien();
			sinhViens.add(sViens[i]);
		}
		
		for(int i=1;i <= sinhViens.size();i++)
		{
			maximum(sinhViens.get(i).getDtb(), sinhViens.get(i-1).getDtb());
		}
	}
}





























