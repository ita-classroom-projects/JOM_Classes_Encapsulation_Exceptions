package jom.com.softserve.s1.task1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

class Task1Test {

	@Test
	public void isTypeClassPet() {
		try {
			assertNotNull(Class.forName("jom.com.softserve.s1.task1.Pet"));
			assertEquals("Pet", Class.forName("jom.com.softserve.s1.task1.Pet").getSimpleName());
		} catch (ClassNotFoundException e) {
			fail("There is no class Pet");
		}
	}

	@Test
	public void hasPetDeclaredFieldName() {
		Pet pet = new Pet();
		Field[] fields = pet.getClass().getDeclaredFields();
		boolean isNameField = false;
		for (Field field : fields) {
			if (field.getName().equals("name")) {
				isNameField = true;
				break;
			}
		}
		assertTrue(isNameField);
	}

	@Test
	public void isFieldNamePublic() {
		Pet pet = new Pet();
		Field[] fields = pet.getClass().getDeclaredFields();
		int mod = 0;
		for (Field field : fields) {
			if (field.getName().equals("name")) {
				mod = field.getModifiers();
				break;
			}
		}
		assertTrue(Modifier.isPublic(mod));
	}

	@Test
	public void isFieldNameString() {
		Pet pet = new Pet();
		Field[] fields = pet.getClass().getDeclaredFields();
		for (Field field : fields) {
			if (field.getName().equals("name")) {
				assertTrue(String.class.equals(field.getType()));
				break;
			}
		}
	}

	@Test
	public void hasFieldNameDefaultValue() {
		Pet pet = new Pet();
		assertTrue(pet.name == null);
	}
}
