package Lab01;
import java.util.Scanner;
public class SortANumricArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] A= new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(A[i]>A[j]) {
					int tmp=A[i];
					A[i]=A[j];
					A[j]=tmp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(A[i] + " ");
		}
	}

}
