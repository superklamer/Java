
public class Chapter_1 {
	public static void main_RENAME (String[] args){
		int twoFiftySixInHex = 0x100;
		System.out.println(twoFiftySixInHex);
		
		String hello = "Hello";
		String world = "World!";
		Object obj = hello + " " + world;
		System.out.println(obj);
		
		String helloWorld = obj.toString();
		System.out.println(helloWorld);

		Employee employee = new Employee();
		employee.age = 20;
		employee.ID = 255;
		employee.firstname = "Radoslav";
		employee.lastname = "Radoev";
		employee.gender = true;
		employee.employeeID = 21824432;
		System.out.printf("Your employee name is %s %s. He is %s years old. Is he male?: %s. His ID is: %s, and his employee ID is: %s", employee.firstname,employee.lastname,
				employee.age, employee.gender,employee.ID, employee.employeeID);
		
		int one = 5;
		int two = 10;
		
		int temp = one;
		one = two;
		two = temp;
		
		System.out.println("Now one:");
		System.out.println(one);
		System.out.println("Now two:");
		System.out.println(two);
		
		
		boolean a = true;
		boolean b = true;
		
		
		/** DeMorgan Laws*/
		/** (a && b) = true
		 * 	!(a && b) = false
		 * 
		 * (!a || !b) = false
		 */
		
		/**
		 * (a || b) = true
		 * !(a || b ) = false
		 * (!a && !b) = false
		 */
		
		System.out.println(!a || !b);

		
		short c = 3;
		short d = 5;
		
		
		System.out.println( c | d); // 0000 0111 = 7
		System.out.println( c & d); // 0000 0001 = 1
		System.out.println( c ^ d); // 0000 0110 = 6
		System.out.println(~c & d); // 0000 0100 = 4
		System.out.println(c << 1); // 0000 0110 = 6
		System.out.println(c << 2); // 0000 1100 = 12
		System.out.println(c >> 1); // 0000 0001 = 1
		
	}
}
