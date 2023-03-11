package adding;
import java.util.Scanner;
import java.util.Arrays;


	
	


public class OnceMore {
	
	

		public void method_1() {
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the size you want ");
			int size=scanner.nextInt();
			String[] b=new String[size];
			System.out.println("enter the no of tmes");
			for(int i=0;i<size;i++) {
				b[i]=scanner.next();
				
			}
			System.out.println(Arrays.toString(b));

		}

		public static void main(String[] args){
			OnceMore oncemore=new OnceMore();
			oncemore.method_1();
	
		
		}
}



