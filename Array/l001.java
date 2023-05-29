import java.util.Arrays;

class l001 {
    public static void print(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static int lSearch(int[] arr, int val) {
        if (arr.length == 0) {
            return -1;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == val) {
                return i + 1; 
            }
        }

        return -1;
    }

    public static int bSearch(int[] arr, int val) {    
        if (arr.length == 0) {
            return -1;
        }

        int start = 0, end = arr.length; 
        while(start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == val) {
                return mid + 1;
            } else if ( arr[mid] < val) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void reverse(int [] arr) {
        if(arr.length == 0) {
            return;
        }

        for(int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 240, 450, 12, 56, 84, 13, 90, 45 };

        // System.out.println(lSearch(arr, 56));

        // Arrays.sort(arr);
        // System.out.println(bSearch(arr, 56));
        
        print(arr);
        reverse(arr);
        print(arr);
    }
}