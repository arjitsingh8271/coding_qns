import java.util.Scanner;
import java.util.Arrays;

// With class
/*
class solution {
	
	public int[] twoSum(int[] nums, int target) {

		for(int i=0 ; i<nums.length ; i++) {

			for(int j=i+1 ; j<nums.length ; j++) {

				if (nums[i] + nums[j] == target) {
					return new int[]{i,j};
				}
			}
		}

		return new int{i,j};
	}

}

class two-sum {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int target;
		
		System.out.println("Array input: ");
       	
       	for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

		// for (int x : arr) {
		// 	arr[x] = sc.nextInt();
		// }

		System.out.println("Target input: ");
		target = sc.nextInt();

		solution s1 = new solution();
		int[] result = s1.twoSum(arr, target);

		if (result != null) {
            System.out.println("Indices: " + Arrays.toString(result));
        } 
        else {
            System.out.println("No solution found.");
        }

	}
}
*/


// Without class

class two-sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Size of an Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Array input: ");

		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Target input: ");
		int target = sc.nextInt();


		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				if ( arr[i] + arr[j] == target) {
					System.out.println("["+i+","+j+"]");
					return;		// if i remove return then it print multiple output
				}
			}
		}

	}
}