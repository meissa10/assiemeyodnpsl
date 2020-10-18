package lsp_midterm;

public class Test_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Testing class Range and its different methods
		Range m =  new Range(5,10);
		Range e =  new Range(1,5);
		Range i =  new Range(1,4);
		Range s =  new Range(100,1000);
		
		System.out.println("Range m contains 6:"+ m.contains(6));
		System.out.println("Range m contains 10:"+ m.contains(10));
		System.out.println("Range m contains 15:"+ m.contains(15));
		System.out.println("Range s contains 10000:"+ m.contains(10000));
		
		
		System.out.println("Range m and Range e overlap:"+ m.overlaps(e));
		System.out.println("Range m and Range i overlap:"+ m.overlaps(i));
		System.out.println("Range e and Range m overlap:"+ e.overlaps(m));
		
		System.out.println("The size of Range m is:"+ m.size());
		System.out.println("The size of Range e is:"+ e.size());
		System.out.println("The size of Range i is:"+ i.size());
		System.out.println("The size of Range s is:"+ s.size());
		
		
		

	}

}
