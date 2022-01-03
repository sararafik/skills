package org.upstream.SkillsEqualsString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class EqualsTest {
	
	@Test
	void test() {
		assertEquals(A.isFoo("foo"), true);
		assertEquals(A.isFoo("csf"), false);
		
	}

}
