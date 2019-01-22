package githubdemo;

import java.util.Scanner;
public class Union_Intersection_Arrays
{
    public static void main(String[] args) 
    {
        int m, n, k, i = 0, flag = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in first array:");
        m = s.nextInt();
        System.out.print("Enter no. of elements you want in second array:");
        n = s.nextInt();
        k = m;
        //array 1
        int a[] = new int[m];
        //array 2
        int b[] = new int[n];
        //union array
        int c[] = new int[m+n];
        //intersection array
        int d[] = new int[m];
        System.out.println("Enter all the elements in first array:");
        for(i = 0; i < m; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Enter all the elements in second array:");
        for(i = 0; i < n; i++)
        {
            b[i] = s.nextInt();
        }
        //Copy all elements of first array to c
        for(i = 0; i < m; i++)
        {
            c[i] = a[i];
        }
        // every element x of second array: If x is not present in first array, then copy x to C.
        for(i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
            	//if b array elem is not present and set the flag
                if(b[i] != a[j])
                {
                    flag = 1;
                }
                else
                {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
            {
                c[k] = b[i];
                k++;
            }
        }
        System.out.print("Union:");
        for(i = 0; i < k - 1; i++)
        {
            System.out.print(c[i]+",");
        }
        System.out.print(c[k-1]);
        System.out.println("");
        
        //array intersection 
        int p = 0;
        //n is second array size
        //m is first array size
        for(i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
            	//for every array elem b in array a copy that elem into new array d
                if(b[i] == a[j])
                {
                    flag = 1;
                    break;
                }
                else
                {
                    flag = 0;
                }
            }
            if(flag == 1)
            {
                d[p] = b[i];
                p++;
            }
        }
        System.out.print("Intersection:");
        if(p > 1)
        {
            for(i = 0; i < p - 1; i++)
            {
                System.out.print(d[i]+",");
            }
            System.out.print(d[p-1]);
        }
        else
        {
            System.out.println("Null set");
        }
    }            
}