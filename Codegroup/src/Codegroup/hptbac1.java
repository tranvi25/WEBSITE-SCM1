package Codegroup;
import java.util.*;
public class hptbac1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào biến a = ");
		int a=sc.nextInt();
		System.out.println("Nhập vào biến b = ");
		int b=sc.nextInt();
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

}
