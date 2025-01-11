package sept.Task;

import java.util.Arrays;

public class Task_28Nov_Allegis {
    public static void main(String[] args) {
        int [] arr={2,5,3,7,8};

        int largest = arr[0];
        int smallest = arr[0];
        int secondLargest= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest=largest;
              largest=arr[i];

            }  else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
            else if (arr[i]<smallest) {
                smallest=arr[i];
            }

        }
        System.out.println("Largest-- "+largest);
        System.out.println("secondLargest-- "+secondLargest);
        System.out.println("Smallest-- "+smallest);
    }

    }


