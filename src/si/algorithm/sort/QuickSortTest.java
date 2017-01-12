package si.algorithm.sort;

public class QuickSortTest {
	private int[] array;
	
	QuickSortTest(int[] data, int size) {
		array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = data[i];
		}
	}
	
	public void quickSort(int l, int u) {
		if(l > u) return;
		int r = l;
		for(int i = l + 1; i <= u; i++) {
			if(array[i] < array[l]) {
				int tmp = array[i];
				array[i] = array[++r];
				array[r] = tmp;
			}
		}
		int tmp = array[l];
		array[l] = array[r];
		array[r] = tmp;
		quickSort(l, r - 1);
		quickSort(r + 1, u);
	}
	
	void print() {
		if(array == null || array.length < 1) return;
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}
	}

	public static void main(String[] args) {
		QuickSortTest test = new QuickSortTest(new int[]{7, 3, 6, 2, 1}, 5);
		test.quickSort(0, 4);
		test.print();
	}

}
