package array.vector;

import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ArraytoVector {
	public static void main(String[] args) {
		// declare and initialize array of object of given class.
		Object[] arrObject = { "Amit", new Date(), "Kashyap" };
		// create list for this object array.
		List list = Arrays.asList(arrObject);
		// create vector for given list.
		Vector vector = new Vector(list);
		// access the elements of the vector.
		Enumeration enume = vector.elements();
		while (enume.hasMoreElements()) {
			System.out.println(enume.nextElement().toString());
		}
	}
}
