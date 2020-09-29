package myPackageVinay;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Use_Verification_Main {

	public boolean validatefName(String string) {
		String regex ="^[A-Z]{1}[a-z]{2,}$";		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);		
		if(matcher.matches()) 
			return true;
		else 
			return false;		
	}

	public boolean validatelName(String string) {
		String regex ="^[A-Z]{1}[a-z]{2,}$";		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);		
		if(matcher.matches()) 
			return true;
		else 
			return false;		
	}

	public boolean validateEMail(String string) {
		String regex ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]{2,})?(\\.[a-z]{2,})?$";		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		
		if(matcher.matches()) 
			return true;
		else 
			return false;
	}

	public boolean validatePNum(String string) {
		String regex ="^[1-9]{2}[ ][1-9][0-9]{9}$";		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		
		if(matcher.matches()) 
			return true;
		else 
			return false;
	}	

}
