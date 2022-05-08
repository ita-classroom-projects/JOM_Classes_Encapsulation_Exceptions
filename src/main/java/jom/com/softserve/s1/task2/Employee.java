package jom.com.softserve.s1.task2;

class Employee {
	public String fullName;
	public float salary;
}

class RunEmployee {

	public static void main(String[] args) {
		RunEmployee runEmployee = new RunEmployee();
		runEmployee.runTests();
	}

	public void runTests() {
		// Add your code here
		Employee emp1 = new Employee();
		emp1.fullName = "Mike";
		emp1.salary = 2570.25f;

		Employee emp2 = new Employee();
		emp2.fullName = "Nick";
		emp2.salary = 3235.75f;

		Employee[] employees = { emp1, emp2 };

		String employeesInfo = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[");

		for (Employee e : employees) {
			stringBuilder.append("{fullName: \"").append(e.fullName).append("\", salary: ").append(e.salary)
					.append("}, ");
		}

		stringBuilder.setLength(stringBuilder.length() - 2);
		stringBuilder.append("]");

		employeesInfo = stringBuilder.toString();

		System.out.println(employeesInfo);
	}

	public static boolean isObjectInstanceOfEmployeeClass(Object object) {
		return object instanceof Employee;
	}

	public static boolean hasFullNamePropertyNotDefaultValue(Employee employee) {
		return employee.fullName != null;
	}

	public static boolean hasSalaryPropertyNotDefaultValue(Employee employee) {
		return employee.salary != 0.0f;
	}

	public static boolean hasStringEmployeesInfoCorrectFormat(String string, Employee emp1, Employee emp2) {
		return string.equals("[{fullName: \"" + emp1.fullName + "\", salary: " + emp1.salary + "}, {fullName: \""
				+ emp2.fullName + "\", salary: " + emp2.salary + "}]");
	}
}