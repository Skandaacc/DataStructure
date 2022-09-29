//Time Complexity: 0(NlogN)
//Space Complexity: 0(1)
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class maxToysBuy {

	static int getMaxToys(int arr[],int n,int k) {
		int count=0;int sum=0;
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(sum+arr[i]<=k) {
				count++;
				sum+=arr[i];
			}
		}return count;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=scan.nextInt();
		System.out.println("Enter the total amount: ");
		int k=scan.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int result=getMaxToys(arr, n, k);
		System.out.println(result);
	}
}
