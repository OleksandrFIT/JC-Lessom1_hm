package homework;

public class Task3 {
	public static void main(String[] args) {

		int[] array={3,5,37,45,-4,256,24, 7, 18,1};
		int min = array[0];
		int max= array[0];

		for (int i = 0; i < array.length; i++) {
			if (max<array[i]) 
			{
				max = array[i];
			}
			if (min>array[i]) 
			{
				min = array[i];
			}

		}	
		System.out.println("\n"+"Max: "+ max+"\n"+"Min: "+ min);
	}
}
