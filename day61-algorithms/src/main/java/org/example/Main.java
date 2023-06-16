package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = {1,3,6,2,9,5,3,1,4,5};

        Main app = new Main();

        app.bubbleSort(arr);

        app.linearSearch(arr, 2);

    }

    void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1]) {
                    // swap array[j+1] and array[j]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }

    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    int linearSearch(int[] arr, int x) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            // If the element is present at the middle
            if (arr[mid] == x)
                return mid;
            // If element is smaller than mid, then it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            // Else the element can only be present in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
        // We reach here when the element is not present in the array
        return -1;
    }


}