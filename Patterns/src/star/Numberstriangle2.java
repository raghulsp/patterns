package star;

public class Numberstriangle2 {

	public static void main(String[] args) {
		int num=5, k=0;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i+j>num-1) {
				System.out.print(k++%10);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
	
}
	}

}
