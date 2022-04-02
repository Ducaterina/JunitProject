package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;


public class StringFunctionsTest {
	
	@Tag("Sanity")
	@DisplayName("Positive Test")
	@Test
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		assertTrue(StringFunctions.isPalindrome("racecar"));
		System.out.println("The string is a palindrome");
		
	}
	
	//@CustomAnnotation
	@Test
	@Tag("Sanity")
	public void test2() {
		
		assertFalse(StringFunctions.isPalindrome("Kate"));
		System.out.println("The string is not a palindrome");
		
	}
}
