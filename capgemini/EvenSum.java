package capgemini;

public class EvenSum {
	public static void main(String[] args) {
		int[][] arr = {{1,2},{3,4},{4,5}};
		int evenSum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%2==0) {
					evenSum += arr[i][j];
				}
				
			}
		}
		System.out.println("even nos sum : " + evenSum);
	}
}
