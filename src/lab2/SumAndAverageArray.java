package lab2;
//SAMUEL WILLIAMS
//21001277
//COMPUTER SCIENCE AND SOFTWARE ENGINEERING
public class SumAndAverageArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int x : arr) {
            sum+= x;
        }
        double avg = (double)  sum / arr.length;

        System.out.println("The sum of all integer in the array is : " + sum);
        System.out.println("The Average of all integers in the array is : " + avg);
      // variable min was set to the  largest element in the array
        int min = arr[9];
      // variable max was set to the smallest element in the array
        int max = arr[0];
        //sort for min with the for each loop
        for(int x : arr) {
            if(x < min) {
                min = x;
            }
        }
        //  sort for max with the for each loop
        for(int x : arr) {
            if(x > max) {
                max = x;
            }
        }

        System.out.println("The maximum integer is : " + max);
        System.out.println("The minimum integer is:  " + min);

    }

}
