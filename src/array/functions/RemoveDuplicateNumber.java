package array.functions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumber {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(1);
		arrayList.add(7);
		arrayList.add(8);
		arrayList.add(1);
		System.out.println(arrayList);

		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.addAll(arrayList);
		System.out.println(hashSet);
	}
}
