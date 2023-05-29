class l001 {
    public static void print(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
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

    public static void main(String[] args) {
        int[] arr = { 10, 240, 450, 12, 56, 84, 13, 90, 45 };

        System.out.println(lSearch(arr, 56));

        // print(arr);
    }
}