package si.algorithm.tool;

public class Tool {
	
	private Tool() {
		
	}
	
    public static void swap(int i, int j, int[] array) {
    	int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
    }
    
    public static void print(int[] array) {
		if(array == null || array.length < 1) return;
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}
	}
}
