package myPackageVinay;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Use_Verification_Main {

	public boolean validatefName(String string) throws Use_Verification_Exception {
        if(string.equals(""))
        	throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_EMPTY, "String Empty, Please re-enter");
        String regex ="^[A-Z]{1}[a-z]{2,}$";		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);		
		if(!(matcher.matches())) 
			throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, "String Empty, Please re-enter");
		else 
			return true;
		
	}

	public boolean validatelName(String string) throws Use_Verification_Exception {
		if(string.equals(""))
        	throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_EMPTY, "String Empty, Please re-enter");
		String regex ="^[A-Z]{1}[a-z]{2,}$";		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);		
		if(!(matcher.matches())) 
			throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, "String Empty, Please re-enter");
		else 
			return true;		
	}

	public boolean validateEMail(String string) throws Use_Verification_Exception {
		if(string.equals(""))
        	throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_EMPTY, "String Empty, Please re-enter");
		String regex ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]{2,})?(\\.[a-z]{2,})?$";		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		if(!(matcher.matches())) 
			throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, "String Empty, Please re-enter");
		else 
			return true;
	}

	public boolean validatePNum(String string) throws Use_Verification_Exception {
		if(string.equals(""))
        	throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_EMPTY, "String Empty, Please re-enter");
		String regex ="^[1-9]{2}[ ][1-9][0-9]{9}$";		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		if(!(matcher.matches())) 
			throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, "String Empty, Please re-enter");
		else 
			return true;
	}

	public boolean validatePWord(String string) throws Use_Verification_Exception {
		if(string.equals(""))
        	throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_EMPTY, "String Empty, Please re-enter");
		String regex ="^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+])[A-Za-z\\d][A-Za-z\\d!@#$%^&*()_+]{7,19}$";		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		if(!(matcher.matches())) 
			throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, "String Empty, Please re-enter");
		else 
			return true;
	}	

}
