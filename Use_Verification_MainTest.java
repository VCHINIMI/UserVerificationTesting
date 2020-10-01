package myPackageVinay;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Use_Verification_MainTest {	
	
	private String email;
	private boolean expectedResult;
	private Use_Verification_Main uv_main;
	public Use_Verification_MainTest (String email,Boolean expectedResult){
		super();
		this.email = email;
		this.expectedResult = expectedResult;
	}
	@Before 
	public void Initialize() {
		uv_main = new Use_Verification_Main();
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com",true},
			{"abc-100@yahoo.com",true},
			{"abc.100@yahoo.com",true},
			{"abc111@abc.com",true},
			{"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true},
			{"abc@1.com",true},
			{"abc@gmail.com.com",true},
			{"abc+100@gmail.com",true},
			{"abc",false},
			{"abc@.com",false},
			{"abc123@gmail.a",false},
			{"abc123@.com",false},
			{"abc123@.com.com",false},
			{".abc@abc.com",false},
			{"abc()*@gmail.com",false},
			{"abc@%*.com",false},
			{"abc..2002@gmail.com",false},
			{"abc.@gmail.com",false},
			{ "abc@abc@gmail.com",false},
			{"abc@gmail.com.1a",false},
			{"abc@gmail.com.aa.au",false},
		});
		
	}
	
	

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatefName("Vinay");
			assertTrue(result);
		} catch (Use_Verification_Exception e) {
			System.out.println(e.getMessage());
		}
			
	}
	
	@Test
	public void givenFirstName_WhenNotEnoughCharacters_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatefName("Vi");
			assertFalse(result);
		} catch (Use_Verification_Exception e) {
			//System.out.println(e.getMessage());
			assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
				
	}

	@Test
	public void givenFirstName_WhenFirstCharNotCapital_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatefName("vinay");
			assertFalse(result);
		} catch (Use_Verification_Exception e) {
			assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
				
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatelName("Chinimilli");
			assertTrue(result);
		} catch (Use_Verification_Exception e) {
			System.out.println(e.getMessage());
		}
				
	}
	
	@Test
	public void givenLastName_WhenNotEnoughCharacters_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatelName("Ch");
			assertFalse(result);	
		} catch (Use_Verification_Exception e) {
			assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
				
	}
	@Test
	public void givenLastName_WhenFirstCharNotCapital_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatelName("vinay");
			assertFalse(result);
		} catch (Use_Verification_Exception e) {
			assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
		
	}
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validateEMail("Chinimilli@gmail.com");
			assertTrue(result);
		} catch (Use_Verification_Exception e) {
			System.out.println(e.getMessage());
		}
				
	}
	@Test
	public void givenEmail_WhenNotHavingATandCOM_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validateEMail("Chinimilligmailcom");
			assertFalse(result);
		} catch (Use_Verification_Exception e) {
			assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
				
	}
	
	@Test
	public void testEmailChecker() {
		try {
			assertEquals( expectedResult, uv_main.validateEMail(email));
		} catch (Use_Verification_Exception e) {
			//System.out.println(e.getMessage());
			//assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_EMPTY, e.exceptionType);
		}
	}

	@Test
	public void givenPhnNumber_WhenProper_ShouldReturnTrue() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatePNum("91 9912222442");
			assertTrue(result);
		} catch (Use_Verification_Exception e) {
			System.out.println(e.getMessage());
		}
				
	}
	@Test
	public void givenPhnNumber_WhenNoCountryCode_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatePNum("9912222442");
			assertFalse(result);
		} catch (Use_Verification_Exception e) {
			assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}				
	}
	@Test
	public void givenPhnNumber_WhenNoSpaceBtwCCodeAndNum_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatePNum("919912222442");
			assertFalse(result);
		} catch (Use_Verification_Exception e) {
			assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
				
	}
	@Test
	public void givenPhnNumber_WhenNotEnoughCharacters_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatePNum("91 912222442");
			assertFalse(result);
		} catch (Use_Verification_Exception e) {
			assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
				
	}
	@Test
	public void givenPassWord_WhenNoCapital_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatePWord("vinaychi");
			assertFalse(result);
		} catch (Use_Verification_Exception e) {
			assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
		
	}
	@Test
	public void givenPassWord_WhenNotEnoughChar_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatePWord("vinayc");
			assertFalse(result);
		} catch (Use_Verification_Exception e) {
			assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}

	}
	@Test
	public void givenPassWord_WhenAtlestOneCapital_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatePWord("Vinaychi");
			assertFalse(result);
		} catch (Use_Verification_Exception e) {
			assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
		
	}
	@Test
	public void givenPassWord_WhenAtlestOneCapitalAndOneDigit_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatePWord("Vinaychi9");
			assertFalse(result);
		} catch (Use_Verification_Exception e) {
			assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
		
	}
	@Test
	public void givenPassWord_WhenAtlestOneCapitalAndOneDigitAndOnlyOneChar_ShouldReturnTrue() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatePWord("Vinaychi9@");
			assertTrue(result);
		} catch (Use_Verification_Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	@Test
	public void givenPassWord_WhenAtlestOneCapitalAndOneDigitAndMoreThanOneChar_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result;
		try {
			result = ucMain.validatePWord("@Vinaychi9@");
			assertFalse(result);
		} catch (Use_Verification_Exception e) {
			assertEquals(Use_Verification_Exception.ExceptionType.ENTERED_INVALID, e.exceptionType);
		}
		
	}
	
}
