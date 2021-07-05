import java.io.*;
class selection_sort {

    public void ss(int arr[]) {
        int minimum, temp;
        System.out.println(arr);
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            minimum = arr[i];
            for (int j = 0; j < length; j++) {
                if (arr[j] >= minimum) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);
    }

    public static void main(String uwu[]) throws IOException {
        BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));

        selection_sort object = new selection_sort();

        int[] array = {45, 87, 11, 23, 45, 77, 96, 88, 53};

        object.ss(array);
        
    }
}