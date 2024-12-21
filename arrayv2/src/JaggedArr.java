public class JaggedArr {

	public static void main(String[] args) {
		int [][] arr = {
				{1,2},
				{4,5,6},
				{7,8,9}
		};

		// print jagged array
		for(int i = 0 ; i<arr.length;i++){
			int l = arr[i].length;
			for (int j = 0 ; j<l;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
