import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[]arr1 = new int[10];
        int[]arr2 = new int[10];
//        int[]arr3 = new int[arr1.length+arr2.length];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element for arr1 : ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter element for arr2 : ");
            arr2[i] = sc.nextInt();
        }
        System.out.println("Merge arr1 + arr2 : ");
        int[]arr3= mergeArr(arr1,arr2);
        for (int element : arr3
             ) {
            System.out.print(element + "\t");
        }
    }
    public static int[] mergeArr(int[]array1,int[]array2){
        int[]arr3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            arr3[i]=array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            arr3[array1.length+i]=array2[i];
        }
        return arr3;
    }
}
