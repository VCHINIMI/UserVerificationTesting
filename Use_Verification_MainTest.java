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
		boolean result = ucMain.validatefName("Vin");
		assertFalse(result);		
	}
	
	@Test
	public void givenFirstName_WhenFirstCharNotCapital_ShouldReturnFalse() {
		Use_Verification_Main ucMain = new Use_Verification_Main();
		boolean result = ucMain.validatefName("vinay");
		assertFalse(result);		
	}	
	
}
