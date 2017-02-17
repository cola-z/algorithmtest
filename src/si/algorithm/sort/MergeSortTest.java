package si.algorithm.sort;

import si.algorithm.tool.Tool;

public class MergeSortTest {
	private int[] array;
	private int[] otherArray;
	MergeSortTest(int[] data, int size) {
		array = new int[size];
		otherArray = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = data[i];
			otherArray[i] = array[i];
		}
	}
	
	public void mergeSort(int l, int u) {
		if(l >= u) return;
		int m = (l + u) / 2;
		mergeSort(l, m);
		mergeSort(m + 1, u);
		merge(l, u, m);
	}
	
	private void merge(int l, int u, int m) {
		int index = l, a = m + 1;

		while(l <= m && a <= u) {
			if(otherArray[l] < otherArray[a]) {
				array[index] = otherArray[l];
				l++;
			} else {
				array[index] = otherArray[a];
				a++;
			}
			index++;
		}
		
		while(l <= m) {
			array[index] = otherArray[l];
			l++;
			index++;
		}
		while(a <= u) {
			array[index] = otherArray[a];
			a++;
			index++;
		}
		
		for(int i = 0; i < array.length; i++) {
			otherArray[i] = array[i];
		}

	}
	
	public int[] getArray() {
		return array;
	}

	public static void main(String[] args) {
		MergeSortTest test = new MergeSortTest(new int[]{7, 3, 6, 2, 1}, 5);
		Tool.print(test.getArray());
		test.mergeSort(0, 4);
		System.out.println();
		Tool.print(test.getArray());
	}

}
