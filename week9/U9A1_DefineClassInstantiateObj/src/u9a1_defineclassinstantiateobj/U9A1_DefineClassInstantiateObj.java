package u9a1_defineclassinstantiateobj;

import u9a1_defineclassinstantiateobj.Course;

/**
 * @author christian
 * 
 * pseudo code:
 * Define a class named Course with the following attributes:
 * (Variables)
 *   - code (String)
 *   - creditHours (int)
 * (Methods)
 *  - Course(String code, Integer creditHours) // Constructor
 *  - getCode(): String
 *  - setCode(String code): void
 *  - getCreditHours(): String
 *  - getCreditHours(String creditHours): void
 *
 * Use this information to use:
 * Order of Instantiation | Course Object code | Course Object creditHours
 * -----------------------|--------------------|--------------------------
 *  1                     | IT1006             | 6
 *  2                     | IT4782             | 3
 *  3                     | IT4789             | 3
 *  4                     | IT4079             | 6
 *  5                     | IT2230             | 3
 *  6                     | IT3345             | 3
 *  7                     | IT2249             | 6
 * 
 */

public class U9A1_DefineClassInstantiateObj {

	public static void main(String[] args) {
        // instantiate Course objects
        Course course1 = new Course("IT1006", 6);
        Course course2 = new Course("IT4782", 3);
        Course course3 = new Course("IT4789", 3);
        Course course4 = new Course("IT4079", 6);
        Course course5 = new Course("IT2230", 3);
        Course course6 = new Course("IT3345", 3);
        Course course7 = new Course("IT2249", 6);

        // store Course objects in an array
        Course[] courses = {course1, course2, course3, course4, course5, course6, course7};

        // print Course objects
        // using enhanced for loop
        int i = 0;
        for (Course course : courses) {
            System.out.printf("[%d]%s(%d)%n", i + 1, courses[i].getCode(), courses[i].getCreditHours());
            i++;
        }

	}
	
}
