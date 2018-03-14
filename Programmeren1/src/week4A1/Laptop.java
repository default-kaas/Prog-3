package week4A1;

public class Laptop {
	private String brand;
	CourseSlide[] slideArray = new CourseSlide[3];

	
	
	public void addCourseSlide(CourseSlide cs) {
		int a = 0;

		while (a < slideArray.length) {
			if (slideArray[a] == null) {
				slideArray[a] = cs;
				return;
			}
			a++;
		}
		System.out.println("No more rooom for another course slide.");
	}
	
}
