package Lab01;
import java.util.Scanner;
public class DayOfMonth {
	public static boolean check1(String month) {
		String[] A= {
				  "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December",
		            "Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.",
		            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
		            "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"
		};
		for(String a : A) {
			if(month.equalsIgnoreCase(a)) {
				return true;
			}
		}
		return false;
	}
	public static boolean check2(int year) {
		if(year>=1000 && year<=9999) {
			return true;
		}
		return false;
	}
	public static void check3(int year) {
		if(year%4==0) {
			System.out.println("29");
		}else {
			System.out.println("28");
		}
	}
	public static void check4(String month) {
		int check=0;
		String[] B= {
				"January","March","May","July","August","October","Decamber",
				"Jan.","Mar.","May.","Jul.","Aug.","Oct.","Dec.",
				"Jan","Mar","May","Jul","Aug","Oct","Dec",
				"1","3","5","7","8","10","12"
		};
		for(String b: B) {
			if(month.equalsIgnoreCase(b)) {
				check=1;
				break;
			}
		}
		if(check==1) {
			System.out.println("31");
		}else {
			System.out.println("30");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month;
		int year;
		while(true) {
			Scanner sc= new Scanner(System.in);
			month= sc.nextLine();
			year=sc.nextInt();
			if(check1(month)&&check2(year)) {
				if(month.equalsIgnoreCase("2")) {
					check3(year);
				}else {
					check4(month);
				}
				break;
			}else {
				System.out.println("Vui long nhap lai.");
			}
		}
	}

}
