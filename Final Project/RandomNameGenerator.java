/** Random Name Generator Class */

public class RandomNameGenerator {
	private String firstName;
	private String lastName;
	private String name;
	
	public RandomNameGenerator(boolean sex) {
		if (sex) {
			int random = (int)(Math.random() * 41);
			switch(random) {
				case 0: firstName = "Noah"; break;
				case 1: firstName = "Liam"; break;
				case 2: firstName = "Jacob"; break;
				case 3: firstName = "Mason"; break;
				case 4: firstName = "William"; break;
				case 5: firstName = "Ethan"; break;
				case 6: firstName = "Michael"; break;
				case 7: firstName = "Alexander"; break;
				case 8: firstName = "Jayden"; break;
				case 9: firstName = "Daniel"; break;
				case 10: firstName = "Elijah"; break;
				case 11: firstName = "Aiden"; break;
				case 12: firstName = "James"; break;
				case 13: firstName = "Benjamin"; break;
				case 14: firstName = "Matthew"; break;
				case 15: firstName = "Jackson"; break;
				case 16: firstName = "Logan"; break;
				case 17: firstName = "David"; break;
				case 18: firstName = "Anthony"; break;
				case 19: firstName = "Joseph"; break;
				case 20: firstName = "Joshua"; break;
				case 21: firstName = "Andrew"; break;
				case 22: firstName = "Lucas"; break;
				case 23: firstName = "Gabriel"; break;
				case 24: firstName = "Samuel"; break;
				case 25: firstName = "Christopher"; break;
				case 26: firstName = "John"; break;
				case 27: firstName = "Dylan"; break;
				case 28: firstName = "Isaac"; break;
				case 29: firstName = "Ryan"; break;
				case 30: firstName = "Nathan"; break;
				case 31: firstName = "Sean"; break;
				case 32: firstName = "Caleb"; break;
				case 33: firstName = "Luke"; break;
				case 34: firstName = "Christian"; break;
				case 35: firstName = "Hunter"; break;
				case 36: firstName = "Gregory"; break;
				case 37: firstName = "Kenny"; break;
				case 38: firstName = "Jerry"; break;
				case 39: firstName = "Shiva"; break;
				case 40: firstName = "Siddarth"; break;
			}	
		}
		
		else {
			int random = (int)(Math.random() * 41);
			switch (random) {
				case 0: firstName = "Sophia"; break;
				case 1: firstName = "Emma"; break;
				case 2: firstName = "Olivia"; break;
				case 3: firstName = "Isabella"; break;
				case 4: firstName = "Ava"; break;
				case 5: firstName = "Mia"; break;
				case 6: firstName = "Emily"; break;
				case 7: firstName = "Abigail"; break;
				case 8: firstName = "Madison"; break;
				case 9: firstName = "Elizabeth"; break;
				case 10: firstName = "Charlotte"; break;
				case 11: firstName = "Avery"; break;
				case 12: firstName = "Sofia"; break;
				case 13: firstName = "Chloe"; break;
				case 14: firstName = "Ella"; break;
				case 15: firstName = "Harper"; break;
				case 16: firstName = "Amelia"; break;
				case 17: firstName = "Aubrey"; break;
				case 18: firstName = "Addison"; break;
				case 19: firstName = "Evelyn"; break;
				case 20: firstName = "Natalie"; break;
				case 21: firstName = "Grace"; break;
				case 22: firstName = "Shiniqua"; break;
				case 23: firstName = "Hannah"; break;
				case 24: firstName = "Zoey"; break;
				case 25: firstName = "Victoria"; break;
				case 26: firstName = "Lillian"; break;
				case 27: firstName = "Lily"; break;
				case 28: firstName = "Brooklyn"; break;
				case 29: firstName = "Samantha"; break;
				case 30: firstName = "Layla"; break;
				case 31: firstName = "Zoe"; break;
				case 32: firstName = "Audrey"; break;
				case 33: firstName = "Leah"; break;
				case 34: firstName = "Allison"; break;
				case 35: firstName = "Anna"; break;
				case 36: firstName = "Savannah"; break;
				case 37: firstName = "Gabriella"; break;
				case 38: firstName = "Lucy"; break;
				case 39: firstName = "Maya"; break;
				case 40: firstName = "Skylar"; break;
			}
		}
		
		int random = (int)(Math.random() * 41);
		switch (random) {
			case 0: lastName = "Smith"; break;
			case 1: lastName = "Johnson"; break;
			case 2: lastName = "Williams"; break;
			case 3: lastName = "Brown"; break;
			case 4: lastName = "Jones"; break;
			case 5: lastName = "Miller"; break;
			case 6: lastName = "Davis"; break;
			case 7: lastName = "Garcia"; break;
			case 8: lastName = "Rodriguez"; break;
			case 9: lastName = "Wilson"; break;
			case 10: lastName = "Martinez"; break;
			case 11: lastName = "Anderson"; break;
			case 12: lastName = "Taylor"; break;
			case 13: lastName = "Thomas"; break;
			case 14: lastName = "Hernandez"; break;
			case 15: lastName = "Moore"; break;
			case 16: lastName = "Martin"; break;
			case 17: lastName = "Jackson"; break;
			case 18: lastName = "Thompson"; break;
			case 19: lastName = "White"; break;
			case 20: lastName = "Lopez"; break;
			case 21: lastName = "Lee"; break;
			case 22: lastName = "Gonzalez"; break;
			case 23: lastName = "Harris"; break;
			case 24: lastName = "Clark"; break;
			case 25: lastName = "Lewis"; break;
			case 26: lastName = "Robinson"; break;
			case 27: lastName = "Walker"; break;
			case 28: lastName = "Perez"; break;
			case 29: lastName = "Hall"; break;
			case 30: lastName = "Young"; break;
			case 31: lastName = "Allen"; break;
			case 32: lastName = "Sanchez"; break;
			case 33: lastName = "Wright"; break;
			case 34: lastName = "King"; break;
			case 35: lastName = "Scott"; break;
			case 36: lastName = "Green"; break;
			case 37: lastName = "Baker"; break;
			case 38: lastName = "Adams"; break;
			case 39: lastName = "Nelson"; break;
			case 40: lastName = "Hill"; break;
		}
		
		name = firstName + " " + lastName;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
