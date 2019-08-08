import java.util.Scanner;

class Tree{
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
		int a[]=new int[5];
		
		for(int i=0;i<5;i++) {
			
			a[i]= sc.nextInt();
		}
				
		for(int i=0;i<5;i++) {
			
			if(a[i]==-1) {
				
				
				if(a[i]%2!=0) {
					
					a[i]=-1;
				}
				
				
			}
			if(a[i]>50) {
				
				a[i]=-2;
				
			}
			
			if(50>i) {
				
				a[i]=3;
				
				
			}
		}
		
		for(int i=0;i<5;i++)
			
			System.out.println(a[i]);
		
	}
}