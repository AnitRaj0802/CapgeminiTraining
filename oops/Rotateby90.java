package oops;

import java.util.Arrays;

public class Rotateby90 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length/2;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
//		for(int[] a : arr) {
//			System.out.println(Arrays.toString(a));
//		}
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=arr[i].length-1;j>=0;j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
