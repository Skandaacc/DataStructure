//Time Complexity: 0(N)
//Space Complexity: 0(1)

package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeaderElement {

	static void findLeader(int arr[]) {
		int currLeader = arr[arr.length - 1];
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(currLeader);
		
		//Checking leader element
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > currLeader) {
				currLeader = arr[i];
				arrayList.add(currLeader);
			}
		}
		//Printing the leader elements
		Collections.reverse(arrayList);
		for (Integer integer : arrayList) {
			System.out.print(integer + " ");
		}
	}

	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array elements :");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		findLeader(arr);
	}
}
