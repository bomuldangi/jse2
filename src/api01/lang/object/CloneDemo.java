package api01.lang.object;

import java.util.Arrays;

public class CloneDemo {
	public static void main(String[] args) {
		int[] arr = {1,3,5,2,4};
		int[] arr2 = arr.clone();
		System.out.println("for loop 으로 배열값 출력.. 확인 ");
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("=================================");
		System.out.println("Arrays 로 출력");
		System.out.println("arr의 요소 출력 : " + Arrays.toString(arr));
		System.out.println("arr2의 요소 출력 : " + Arrays.toString(arr2));
		
	}
}
