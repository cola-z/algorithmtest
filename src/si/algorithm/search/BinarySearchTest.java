package si.algorithm.search;

public class BinarySearchTest {
    private int[] array;
	
    BinarySearchTest(int[] data, int size) {
		array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = data[i];
		}
	}
    
    public int binarySearch(int v) {
    	return binarySearch(0, array.length - 1, v);
	}
	
	private int binarySearch(int l, int u, int v) {
		while(l <= u) {
			int m = (l + u) / 2;
			if(array[m] == v) {
				return m;
			} else if(array[m] > v) {
				u = m - 1;
			} else {
				l = m + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearchTest test = new BinarySearchTest(new int[]{1, 3, 7, 8, 11}, 5);
		System.out.println(test.binarySearch(3));
		System.out.println(test.binarySearch(10));
	}

}
