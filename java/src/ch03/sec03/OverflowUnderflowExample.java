package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		byte var1=125;
		for(int i=0; i<5;i++) {
			var1++;
			System.out.println("var1: "+var1);	
		}
		
		System.out.println("------------------");
		byte var2=-125;
		for(int i=0; i<5;i++) {
			var2--;
			System.out.println("var2: "+var2);	
		}
	}

}
/* 0111 1110(126), 0111 1111(127), 1000 0000(-128), 1000 0001(-127), ...
   1000 0010(-126), 1000 0001(-127), 1000 0000 
 */
