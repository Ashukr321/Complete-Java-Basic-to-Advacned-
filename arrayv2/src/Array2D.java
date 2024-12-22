public class Array2D {
	public static void main(String[] args) {
		int [][]arr =  new int[2][2]; // store  in heap memory
		arr[0][0]= 2;
		arr[0][1]= 3;
		arr[1][0]= 4;
		arr[1][1]= 5;
		// print 2d
		for (int i = 0; i<2; i++){
			for (int j  = 0 ; j<2;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		// normal variable store in the stack memory



	}
}
