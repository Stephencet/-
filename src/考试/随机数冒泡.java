package ¿¼ÊÔ;
import java.util.Random;


public class Ëæ»úÊıÃ°Åİ {
	public static void main(String[]args) {
		int a[]=new int [10];
		Random r=new Random();
		for(int i=0;i<a.length;i++) {
			a[i]=r.nextInt(40);
		}
		for(int x=1;x<a.length;x++) {
			for(int i=9;i>=x;i--) {
				if(a[i]<a[i-1]) {
					int temp=a[i];
					a[i]=a[i-1];
					a[i-1]=temp;
				} 
			}
		}
		System.out.println("ÅÅĞòÈçÏÂ:");
		for(int x:a) {
		System.out.print("  "+x);	
		}
	}
}
//		for(int b=9;b>=0;b--) {
//		System.out.print(a[b]+"  ");
//		}
//		System.out.println();

