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
	public void testEmailChecker() {
		//System.out.println("Parameterized email is :"+);
		assertEquals( expectedResult, uv_main.validateEMail(email));
	}
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
	@Test
	public void givenEmail_WhenTrueSet_ShouldReturnTrue1() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc@yahoo.com");
		assertTrue(result);		
	}
	@Test
	public void givenEmail_WhenTrueSet_ShouldReturnTrue2() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc-100@yahoo.com");
		assertTrue(result);		
	}
	@Test
	public void givenEmail_WhenTrueSet_ShouldReturnTrue3() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc.100@yahoo.com");
		assertTrue(result);		
	}
	@Test
	public void givenEmail_WhenTrueSet_ShouldReturnTrue4() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc111@abc.com");
		assertTrue(result);		
	}
	@Test
	public void givenEmail_WhenTrueSet_ShouldReturnTrue5() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc-100@abc.net");
		assertTrue(result);		
	}
	@Test
	public void givenEmail_WhenTrueSet_ShouldReturnTrue6() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc.100@abc.com.au");
		assertTrue(result);		
	}
	@Test
	public void givenEmail_WhenTrueSet_ShouldReturnTrue7() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc@1.com");
		assertTrue(result);		
	}
	@Test
	public void givenEmail_WhenTrueSet_ShouldReturnTrue8() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc@gmail.com.com");
		assertTrue(result);		
	}
	@Test
	public void givenEmail_WhenTrueSet_ShouldReturnTrue9() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc+100@gmail.com");
		assertTrue(result);		
	}
	@Test
	public void givenEmail_WhenFalseSet_ShouldReturnFalse1() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc");
		assertFalse(result);		
	}
	@Test
	public void givenEmail_WhenFalseSet_ShouldReturnFalse2() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc@.com");
		assertFalse(result);		
	}
	@Test
	public void givenEmail_WhenFalseSet_ShouldReturnFalse3() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc123@gmail.a");
		assertFalse(result);		
	}
	@Test
	public void givenEmail_WhenFalseSet_ShouldReturnFalse4() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc123@.com");
		assertFalse(result);		
	}
	@Test
	public void givenEmail_WhenFalseSet_ShouldReturnFalse5() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc123@.com.com");
		assertFalse(result);		
	}
	@Test
	public void givenEmail_WhenFalseSet_ShouldReturnFalse6() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail(".abc@abc.com");
		assertFalse(result);		
	}
	@Test
	public void givenEmail_WhenFalseSet_ShouldReturnFalse7() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc()*@gmail.com");
		assertFalse(result);		
	}
	@Test
	public void givenEmail_WhenFalseSet_ShouldReturnFalse8() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc@%*.com");
		assertFalse(result);		
	}
	@Test
	public void givenEmail_WhenFalseSet_ShouldReturnFalse9() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc..2002@gmail.com");
		assertFalse(result);		
	}
	@Test
	public void givenEmail_WhenFalseSet_ShouldReturnFalse10() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc.@gmail.com");
		assertFalse(result);		
	}
	@Test
	public void givenEmail_WhenFalseSet_ShouldReturnFalse11() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc@abc@gmail.com");
		assertFalse(result);		
	}
	@Test
	public void givenEmail_WhenFalseSet_ShouldReturnFalse12() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc@gmail.com.1a");
		assertFalse(result);		
	}
	@Test
	public void givenEmail_WhenFalseSet_ShouldReturnFalse13() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validateEMail("abc@gmail.com.aa.au");
		assertFalse(result);		
	}
}
