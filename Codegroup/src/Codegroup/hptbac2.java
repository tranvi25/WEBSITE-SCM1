package Codegroup;
import java.util.*;
public class hptbac2 {
	public static void giaiphuongtrinhbacnhat(int a,int b) {
		
		System.out.printf("Giải phương trình bậc nhất %dx + %d=0 \n",a,b);
		if(a ==0 && b==0) {
			System.out.println("phương trình có vô số nghiệm: ");
			
		}else if(a == 0&& b!=0) {
			System.out.println("phương trình không có nghiệm: ");
		}else {
			float x= (float)-b/a;
			System.out.printf(" phương trình có nghiệm = %.3f ",x);
		}
		
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số a = ");
		int a=sc.nextInt();
		System.out.println("Nhập vào số b = ");
		int b = sc.nextInt();
		System.out.println("nHẬP vào số c = ");
		int c= sc.nextInt();
		System.out.printf(" Giải hệ phương trình bậc hai %x^2+%dx+%d = 0 \n",a,b,c);
		if(a==0) {
			giaiphuongtrinhbacnhat(b, c);
		}
		else {
			int delta = b*b-4*a*c;
			if(delta<0) {
				System.out.println("Phương trình vô nghiệm: ");
				
			}else if(delta == 0) {
				float x = (float) -b/(2*a);
				System.out.printf("Phương trình vô nghiệm kép x = %3.f",x);
			}else {
				double x1=(-b+Math.sqrt(delta))/(2*a);
				double x2=(-b-Math.sqrt(delta))/(2*a);
				System.out.printf(" Phương trình có 2 nghiệm riêng biệt,x1=%3.f,x2=%.3f",x1,x2);
				
			}
			
		}
		}

}
