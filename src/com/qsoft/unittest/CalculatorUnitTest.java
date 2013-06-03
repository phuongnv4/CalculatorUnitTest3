package com.qsoft.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qsoft.Calculator;

public class CalculatorUnitTest {
	@Test
	public void addNumberNull() {
		assertEquals(0, Calculator.add(null));
	}

	@Test
	public void addNumberEmpty() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void addNumberTwoNumber() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void addNumberThreeNumber() {
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void addNumberAndCharacter() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void addNumberAndDelimiters() {
		assertEquals(6, Calculator.add("//[***]\n1***2***3"));
	}

}
