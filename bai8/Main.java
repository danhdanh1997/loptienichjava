package bai8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main 
{
	public static void main(String[] args)
	{
		int n;
		System.out.println("nhap vao n so luong cau thu:");
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		CauThu[] cauThus = new CauThu[n];
		
		HashSet<CauThu>cauThus2 = new HashSet<CauThu>();
		
		for (int i = 0; i < cauThus.length; i++) 
		{
			cauThus[i] = new CauThu();
			cauThus[i].nhapthontin();
			cauThus2.add(cauThus[i]);
		}
		
		for (CauThu cauThu : cauThus2) 
		{
			System.out.println(cauThu.toString());
		}
		
		TreeSet<CauThu>cauThus3 = new TreeSet<CauThu>();
		cauThus3.addAll(cauThus2);
		
		for (CauThu cauThu : cauThus3) 
		{
			System.out.println(cauThu.getSoao());
		}
		
		
		 CauThu result2 = cauThus3
				 .stream()
	             .filter(p -> {
	                    if ("jack".equals(p.getTen())) 
	                    {
	                        return true;
	                    }
	                    return false;
	                })
	             .findAny()
	                
	             .orElse(null);
		 System.out.println(result2);
		 
	}
}



























