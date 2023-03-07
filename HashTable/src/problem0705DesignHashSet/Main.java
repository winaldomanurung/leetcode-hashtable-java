package problem0705DesignHashSet;

public class Main {

	public static void main(String[] args) {
		

		MyHashSet obj = new MyHashSet();
		System.out.println(obj.array.length-1);
		obj.add(1);
		obj.add(2);
		obj.add(3);
//		obj.remove(key);
//		boolean param_3 = obj.contains(key);
		
		System.out.println(obj.array.length-1);
		
		for (int i = 0; i < obj.array.length-1; i++) {
			  System.out.println(obj.array[i]);
			}
	}

}
