package week1ASimpel;

public class GroupOfPeople {
		private Person[] persons = new Person[5];
		
		public void addPerson(Person person) {
			int i = 0;
			
			while(i<persons.length) {
				if(persons[i] == null) {
					persons[i]=person;
					break;
				}
			i++;
			}
		}
		
		public void findOldest() {
			int i = 0;
			int oldestAge = 0;
			int number = 0;
			
			if(persons[i] != null) {
				while(i<persons.length) {
					if(persons[i] != null) {
						if(oldestAge<persons[i].getAge()) {
							oldestAge = persons[i].getAge();
							number = i;
						}
					}
					i++;
				}
				System.out.println("The oldest person in this group is "+ persons[number].getName());
			}else {
				System.out.println("There are no person in this group of people");
			}
		}
		
		public void findYoungest() {
			int i = 0;
			int youngestAge = 1000;
			int number = 0;
			
			if(persons[i] != null) {
				while(i<persons.length) {
					if(persons[i] != null) {
						if(youngestAge>persons[i].getAge()) {
						youngestAge = persons[i].getAge();
						number = i;
						}
					}
					i++;
				}
				System.out.println("The youngest person in this group is "+ persons[number].getName());
			}else {
				System.out.println("There are no person in this group of people");
			}
		}
		
		public void findMen() {
			int i = 0;
			int genderNumber = 0;
			
			if(persons[i] != null) {
				System.out.println("The men who are in this group are:");
				while(i<persons.length) {
					if(persons[i] != null) {
						if(genderNumber == persons[i].isGender()) {
							System.out.println(persons[i].getName());
						}	
					}
				i++;
				}
			}else {
				System.out.println("There are no person in this group of people");
			}	
		}
		
		public void findWomen() {
			int i = 0;
			int genderNumber = 1;
			
			if(persons[i] != null) {
				System.out.println("The women who are in this group are:");
				while(i<persons.length) {
					if(persons[i] != null) {
						if(genderNumber == persons[i].isGender()) {
							System.out.println(persons[i].getName());
						}	
					}
				i++;
				}
			}else {
				System.out.println("There are no person in this group of people");
			}	
		}
}
