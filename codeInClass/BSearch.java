// Binary Search
public class BSearch{
	private static final int Failure = -1;
	private static int bSearch(int[] array, int left, int right, int findMe){
		if (left > right) {
			return Failure;
		} else {
			int mid = (left + right) / 2;
			if (array[mid] == findMe) {
				return mid;
			} else if (array[mid] > findMe) {
				return bSearch(array,left,mid-1,findMe);
			} else {
				return bSearch(array,mid+1,right,findMe);
			}
		}

	}
	
	public static int bSearch(int[] array, int findMe) {
		return bSearch(array,0,array.length-1,findMe);
	}

	public static void main(String[] args) {
		int[] lst1 = {1,2,3,4,5,6,7,8,9};
		System.out.println("7's index is:" + bSearch(lst1,7));
		int[] lst2 = {9,8,7,6,5,4,3,2,1,0};
		System.out.println("7's index is:" + bSearch(lst2,7));
	}
}
