package myPackageVinay;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class Use_Verification_MainTest {	
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatefName("Vinay");
		assertTrue(result);		
	}
	
	@Test
	public void givenFirstName_WhenNotEnoughCharacters_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatefName("Vi");
		assertFalse(result);		
	}
	
	@Test
	public void givenFirstName_WhenFirstCharNotCapital_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatefName("vinay");
		assertFalse(result);		
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatelName("Chinimilli");
		assertTrue(result);		
	}
	@Test
	public void givenLastName_WhenNotEnoughCharacters_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatelName("Ch");
		assertFalse(result);		
	}
	@Test
	public void givenLastName_WhenFirstCharNotCapital_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatelName("vinay");
		assertFalse(result);
	}
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("Chinimilli@gmail.com");
		assertTrue(result);		
	}
	@Test
	public void givenEmail_WhenNotHavingATandCOM_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("Chinimilligmailcom");
		assertFalse(result);		
	}
	@Test
	public void givenPhnNumber_WhenProper_ShouldReturnTrue() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatePNum("91 9912222442");
		assertTrue(result);		
	}
	@Test
	public void givenPhnNumber_WhenNoCountryCode_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatePNum("9912222442");
		assertFalse(result);		
	}
	@Test
	public void givenPhnNumber_WhenNoSpaceBtwCCodeAndNum_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatePNum("919912222442");
		assertFalse(result);		
	}
	@Test
	public void givenPhnNumber_WhenNotEnoughCharacters_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatePNum("91 912222442");
		assertFalse(result);		
	}
	@Test
	public void givenPassWord_WhenNoCapital_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatePWord("vinaychi");
		assertFalse(result);
	}
	@Test
	public void givenPassWord_WhenNotEnoughChar_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatePWord("vinayc");
		assertFalse(result);
	}
	@Test
	public void givenPassWord_WhenAtlestOneCapital_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatePWord("Vinaychi");
		assertFalse(result);
	}
	@Test
	public void givenPassWord_WhenAtlestOneCapitalAndOneDigit_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatePWord("Vinaychi9");
		assertFalse(result);
	}
	@Test
	public void givenPassWord_WhenAtlestOneCapitalAndOneDigitAndOnlyOneChar_ShouldReturnTrue() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatePWord("Vinaychi9@");
		assertTrue(result);
	}
	@Test
	public void givenPassWord_WhenAtlestOneCapitalAndOneDigitAndMoreThanOneChar_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatePWord("@Vinaychi9@");
		assertFalse(result);
	}
}
