package githubdemo;

import java.lang.Object;
import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
public class DeleteArrayElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int index;
		System.out.println("enter the index element to remove from array:");
		Scanner sc=new Scanner(System.in);
		index=sc.nextInt();
		System.out.println(index);
		arr=ArrayUtils.removeElement(arr,index);
		System.out.println("resultant array"+Arrays.toString(arr));
		System.out.println("arr len after removing"+arr.length);
		
	}

}
