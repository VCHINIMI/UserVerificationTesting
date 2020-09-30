package myPackageVinay;
import java.lang.Exception;


public class Use_Verification_Exception extends Exception{
	private static final long serialVersionUID = 1L;
	enum ExceptionType{
		ENTERED_EMPTY,ENTERED_INVALID
	}
	ExceptionType exceptionType;
	
	public  Use_Verification_Exception(ExceptionType exceptionType, String message) {
		super(message);
		this.exceptionType = exceptionType;
	}
}
