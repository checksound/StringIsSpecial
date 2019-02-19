package esempiostring;

public class EfficientCode {

	public static void main(String[] args) {
		// inefficient codes
		StringBuilder str = new StringBuilder("Hello");
		for (int i = 1; i < 100000; ++i) {
		   if(i % 10000 == 0) {
			   long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
			   System.out.println("USED MEMORY iteratior: " + i + 
					   ", bytes: " + afterUsedMem + 
						", MB: " + (afterUsedMem/(1024*1024)));	 
			   
		   }
			   
		   str.append(i);
		}
		
		long afterUsedMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		
		System.out.println(str.length());
		System.out.println("USED MEMORY:" + afterUsedMem + 
				", MB: " + (afterUsedMem/(1024*1024)));
	}

}
