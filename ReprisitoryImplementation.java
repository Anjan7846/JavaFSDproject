package Revature;

import java.util.Scanner;

class InvalidCodeException extends Exception{
	InvalidCodeException(String msg){
		super(msg);
	}
}

class Reprisitory{
	public String getCountryName(String countryCode) throws InvalidCodeException {
		String country = null;
		int cc=Integer.parseInt(countryCode);                    //77-99:India
		if(cc>=70 && cc<=99)                                     
			country="India";
		else if(cc==908)                                     //908:USA
			country="US";
		else if(countryCode.equals("011"))                        //011: Dial somewhere outside of USA 
			country="Dail somewhere outside of USA";
		else
		{
			try{
				throw new InvalidCodeException("Enter a validcode");       //No country with given code found
			}catch(InvalidCodeException e){
				country="No country with given code";
			}
				
		}	
		return country;
	}
}


public class ReprisitoryImplementation {

	public static void main(String[] args) throws InvalidCodeException{
		Reprisitory r=new Reprisitory();
		Scanner sc = new Scanner(System.in);
		String countryCode = sc.nextLine();
		System.out.println("country code between 70 to 99"+"  "+r.getCountryName(countryCode));
		System.out.println("country code of 908" +"   "+r.getCountryName(countryCode));
		System.out.println(r.getCountryName(countryCode));
		System.out.println(r.getCountryName(countryCode));

	}

}
