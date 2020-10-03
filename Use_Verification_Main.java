package myPackageVinay;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Use_Verification_Main {

	

	public boolean validatefName(String string) throws Use_Verification_Exception {
        if(string.equals(""))
        	throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_EMPTY, "String Empty, Please re-enter");
		Predicate<String> predicate = s-> Pattern.matches("^[A-Z]{1}[a-z]{2,}$",s);
		if(predicate.test(string))
			return true;
		else 
			throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, "String Invalid, Please re-enter");
	}

	public boolean validatelName(String string) throws Use_Verification_Exception {
		if(string.equals(""))
        	throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_EMPTY, "String Empty, Please re-enter");
		Predicate<String> predicate = s-> Pattern.matches("^[A-Z]{1}[a-z]{2,}$",s);
		if(predicate.test(string))
			return true;
		else 
			throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, "String Invalid, Please re-enter");	
	}

	public boolean validateEMail(String string) throws Use_Verification_Exception {
		if(string.equals(""))
        	throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_EMPTY, "String Empty, Please re-enter");		
		Predicate<String> predicate = s->Pattern.matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]{2,})?(\\.[a-z]{2,})?$",s);
		if(predicate.test(string)) 
			return true;
		else 
			throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, "String Invalid, Please re-enter");
	}

	public boolean validatePNum(String string) throws Use_Verification_Exception {
		if(string.equals(""))
        	throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_EMPTY, "String Empty, Please re-enter");		
		Predicate<String> predicate = s->Pattern.matches("^[1-9]{2}[ ][1-9][0-9]{9}$",s);
		if(predicate.test(string)) 
			return true;
		else 
			throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, "String Invalid, Please re-enter");
	}
	public boolean validatePWord(String string) throws Use_Verification_Exception {
		if(string.equals(""))
        	throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_EMPTY, "String Empty, Please re-enter");		
		Predicate<String> predicate = s->Pattern.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+])[A-Za-z\\d][A-Za-z\\d!@#$%^&*()_+]{7,19}$",s);
		if(predicate.test(string)) 
			return true;
		else 
			throw new Use_Verification_Exception(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, "String Invalid, Please re-enter");
	}	

}
