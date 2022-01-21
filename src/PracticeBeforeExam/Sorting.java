package PracticeBeforeExam;

//import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 2, 4, 6, 0, 4, 1, 5, 7, 3, 1, 3, 5, 7879, 6, 8, 345, 2, 34, 765, 832};
        int[] numbers2 = {67585678, 4567534, 345324, 53467356, 46734526, 24674567, 4564563, 4523, 2344, 23};
        int[] numbers3 = {5, 8, 3, 2, 6, 4, 7, 0, 1};

//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(sort_small_to_large(numbers)));
//        System.out.println(Arrays.toString(sort_size(numbers)));
//        System.out.println(Arrays.toString(numbers2));
//        System.out.println(Arrays.toString(sort_small_to_large(numbers2)));
//        System.out.println(Arrays.toString(sort_size(numbers2)));
//        System.out.println(Arrays.toString(sort_size(numbers3)));
//        System.out.println(Arrays.toString(sort_small_to_large(numbers3)));

//        System.out.println(Arrays.toString(bubble_sort(numbers)));

//        int[] arr1 = {1,2,7,9,11};
//        int[] arr2 = {3,4,8,10,12,14,15};
//        System.out.println("The arrays go up so the merge one goes too: " + Arrays.toString(merge_upArrays(arr1, arr2)));
//        System.out.println("The arrays not go up so the merge one not goes up: " + Arrays.toString(merge_upArrays(numbers, numbers3)));

//        int[] monotoneArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 6, 9, 88, 876, 4543, 3, 2, 4, 5, 7, 8, 4, 3, 3, 6, 1, 2, 5, 6, 7};
//        System.out.println(Arrays.toString(longestMonotony(monotoneArr)));
//        System.out.println(Arrays.toString(longestPos(monotoneArr)));
    }

    public static int[] merge_upArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while ((i < arr1.length) && (j < arr2.length)) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            } else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            k++;
            j++;
        }
        return arr3;
    }

    public static int[] bubble_sort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++)
                if (arr[i] > arr[i + 1])
                    swap(arr, i, i + 1);
        }
        return arr;
    }

    // all in one function.
    public static int[] sort_size(int[] arr) {
        int smallest, temp, min_index;
        for (int i = 0; i < arr.length; i++) {
            min_index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            smallest = min_index;
            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }


    // return a sort array by the given one, sort by small data at the beginning and largest in top index.
    public static int[] sort_small_to_large(int[] arr) {
        int smallest;
        for (int i = 0; i < arr.length; i++) {
            smallest = min_index(arr, i);
            swap(arr, smallest, i);
        }
        return arr;
    }

    // swap the data in the array by the 2 index given.
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // return the index of the smallest data in the array.
    public static int min_index(int[] arr, int start_index) {
        int min_index = start_index;
        for (int i = start_index; i < arr.length; i++) {
            if (arr[i] < arr[min_index]) {
                min_index = i;
            }
        }
        return min_index;
    }


    // the teacher's (liad) code, not working well.
    public static int[] longestMonotony(int[] arr) {
        int count = 1, maxCount = 1, maxEnd = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) count++;
            else {
                maxEnd = i + 1;
                maxCount = count;
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxEnd = arr.length;
        }
        int maxStart = maxEnd - maxCount;
        int[] res = new int[maxCount];
        for (int i = 0; i < maxCount; i++) {
            res[i] = arr[i + maxStart];
        }
        return res;
    }

    // the teacher's (liad) code, not working well like the another one.
    public static int[] longestPos(int[] arr){
        int start = 0, count = 0;
        int maxStart = 0, maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                if (count > maxLen){
                    maxStart = start;
                    maxLen = count;
                }
                count = 0;
                start = i+1;
            }
            else{
                count++;
            }
        }
        if (count > maxLen){
            maxStart = start;
            maxLen = count;
        }
        int[] res = new int[maxLen];
        for (int i=0; i<maxLen; i++){
            res[i] = arr[maxStart+i];
        }
        return res;
    }



}
