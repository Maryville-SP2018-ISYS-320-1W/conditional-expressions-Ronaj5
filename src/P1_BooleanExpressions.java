/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expression predictions:
 
 1.true
 2.true
 3.false
 4.true
 
 5.true
 6.false
 7.false
 8.false
   
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 1.yes
 2.yes
 3.yes
 4.yes
 
 5.yes
 6.yes
 7.No - not sure on this one
 8.No - I don't understand - x IS less than why....Oh I just got it- it is saying x < y is false.

 */
public class P1_BooleanExpressions {

	public static void main(String[] args) {
		int x = 27; 
		int y = -1; 
		int z = 32; 
		boolean b = false; 
		
		System.out.println("REPLACE THIS STRING WITH YOUR BOOLEAN EXPRESSION");
		System.out.println(!b);
		System.out.println(b || true);
		System.out.println((x > y) && (y > z) );
		System.out.println((x == y) || (x <= z));
		System.out.println(!(x % 2 == 0));
		System.out.println(b && !b );
		System.out.println(b || !b);
		System.out.println((x < y) == b);
		
	}

}
