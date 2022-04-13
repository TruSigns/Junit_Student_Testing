package com.example.demo;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


//@SpringBootTest
class DemoApplicationTests {

	Calculator calculatorTest = new Calculator();

	@Test
//	void itShouldAddNumbers() {
//		//given
//		int numberOne = 20;
//		int numberTwo = 30;
//
//		//when
//		int result = calculatorTest.add(numberOne, numberTwo);
//
//		//then
//		int expectedResults = 50;
//		assertThat(result).isEqualTo(expectedResults);
//
	void IsRamseyGoingToSaveTheWorld(){
		//given
		boolean ramsey = true;

		//when
		if(ramsey == true){
			System.out.println("He's going to save the world");

		}else {
			System.out.println("This negro is going to destroy that world");
		}

		//then
		assertThat(ramsey).isEqualTo(true);
	}



	class Calculator{
		int add(int a , int b){
			return a + b;
		}
	}

}
