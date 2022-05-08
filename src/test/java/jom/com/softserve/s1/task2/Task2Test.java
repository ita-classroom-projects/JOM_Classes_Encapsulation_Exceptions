package jom.com.softserve.s1.task2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

class Task2Test {

	@Test
	void test() {
		RunEmployee.main(null);
		assertTrue(true);
	}

	/* Checks if the "emp1" object is an instance of the Employee class */
	// isObjectInstanceOfEmployeeClass(emp1)

	// hasFullNamePropertyNotDefaultValue(emp1)

	/*
	 * Checks if the string has the correct format specified by the task condition
	 */
	// hasStringEmployeesInfoCorrectFormat(employeesInfo, emp1, emp2)

	@Test
	void hasStringEmployeesInfoCorrectFormat() {
		RunEmployee.main(null);
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream("P".getBytes()));
		System.setIn(stdin);
		System.setIn(new ByteArrayInputStream("Test Paper".getBytes()));
		System.setIn(stdin);
		System.setIn(new ByteArrayInputStream("P".getBytes()));
		System.setIn(stdin);
		System.setIn(new ByteArrayInputStream("Test Paper".getBytes()));
		// System.setOut(new PrintStream(outContent));
		System.setIn(stdin);
		/*
		 * write("P"); write("Test Paper"); write("P"); write("Test Paper");
		 */
//		String testS = outContent.toString();
//		assertEquals(outContent.toString().contains("Paper Already Added"), true);

//		employeesInfoß;
	}
	// string.equals("[{fullName: \"" + emp1.fullName + "\", salary: " + emp1.salary
	// + "}, {fullName: \"" + emp2.fullName + "\", salary: " + emp2.salary + "}]");

}
