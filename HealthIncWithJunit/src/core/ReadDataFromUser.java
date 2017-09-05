package core;


import java.util.Scanner;



public class ReadDataFromUser {
	
public static void main(String[] args) {
	UserDeatils ud=new UserDeatils();
	
	Scanner sc=new Scanner(System.in);
	
	//Read the User Info
	System.out.println("Please enter Name");
	         ud.setName(sc.nextLine());
	         System.out.println("Please enter Gender format should be Male or Female");
	         ud.setGender((sc.nextLine()));
	         System.out.println("Please enter Age");
	         ud.setAge(Integer.parseInt(sc.nextLine()));
	         
	         //Read the User Current health:
             
	         System.out.println("Please enter Blood pressure i/p NO or YES");
	         ud.setBP(sc.nextLine());
	         
	         System.out.println("Please enter Hypertension i/p NO or YES");
	         ud.setHypertension(sc.nextLine());
	         
	         System.out.println("Please enter Blood sugar i/p NO or YES");
	         ud.setBS(sc.nextLine());
	         System.out.println("Please enter Overweight i/p NO or YES");
	         ud.setOW(sc.nextLine());
	         
	         //Read user Habits
	         
	         System.out.println("Please enter Smoking: i/p NO or YES");
	         ud.setSmoking(sc.nextLine());
	         System.out.println("Please enter Alcohol: i/p NO or YES");
	         ud.setAlcohol(sc.nextLine());
	         System.out.println("Please enter Daily exercise: i/p NO or YES");
	         ud.setDE(sc.nextLine());
	         System.out.println("Please enter Drug: i/p NO or YES");
	         ud.setDrugs(sc.nextLine());

	         
	         BUSINESSRULES br=new BUSINESSRULES();
	         System.out.println("final "+br.CalPremium(ud));;
	         sc.close();
}
}
