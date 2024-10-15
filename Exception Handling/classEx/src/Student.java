public class Student {
	int age;
	String name;
	int id;

	public void setAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Under age, so can't do UG/PG");
		} else {
			this.age = age;
		}
	}

	public void setName(String name) throws InvalidNameException {
		if (name.length() <= 4 || !name.matches("[a-zA-Z ]*")) {
			throw new InvalidNameException("Name is not valid");
		} else {
			this.name = name;
		}
	}

	public void setId(int id) throws InvalidId {
		if (!(id >= 100000000 && id <= 999999999)) {
			throw new InvalidId("ID must be a 9-digit number");
		} else {
			this.id = id;
		}
	}

	public String toString() {
		String s;
		s = String.format("age: %d  name: %s  id: %d", this.age, this.name, this.id);
		return s;
	}
}