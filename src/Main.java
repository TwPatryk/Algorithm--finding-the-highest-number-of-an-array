import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //filling an array with random numbers
        Random random = new Random();
        int [] arr = new int [5];

        for (int i = 0; i< arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        int maxNum = arr[0];

        //looking for the highest number of an array
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            } else {
                continue;
            }
        }

        System.out.println("The highest number of an array is: " + maxNum);
    }
}
