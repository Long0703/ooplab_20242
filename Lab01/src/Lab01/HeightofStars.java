package Lab01;
import java.util.Scanner;
public class HeightofStars {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=n*2+1;
		int q=m/2;
		int k=0;
		char[][] A= new char[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				A[i][j]=' ';
			}
		}
		for(int i=0;i<n;i++){
			for(int j=q-k;j<=q+k;j++){
				A[i][j]='*';
			}
			k++;
			if(k==n){
				break;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(A[i][j]);
			}
			System.out.println("");
		}
		sc.close();
	}

}
