class Person {
	constructor(name, age) {
		this.name = name;
		this.age = age;
	}

	compareAge(other) {
		// Write code here!
		let comparator = "";
		if (other.age > this.age) {
			comparator = "older than";
		} else if (other.age < this.age) {
			comparator = "younger than";
		} else {
			comparator = "the same age as"
		}
		return other.name + " is " + comparator + " me."
	}
}
