import java.util.*;

class LinearSearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       
        //int n=sc.nextInt(); 
        int arr[]={1,2,3,4,5,6}
        
        int tar=6
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
             System.out.print(arr[i]+" ");
        }
        System.out.println();
        int t=linearsearch(arr,tar);
        if(t!=-1)
        System.out.println("Element found at index: "+t);
        else
        System.out.println("Element not found");
    } 

    static int linearsearch(int arr[],int tar)
    {
           for(int i=0;i<arr.length;i++)
           {
                 if(arr[i]==tar)
                 {
                    return i;
                 }
            }
          return -1;           

     }
}