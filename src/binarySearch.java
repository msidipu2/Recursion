public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 8, 9, 11};
        int target = 11;
        int start = 0;
        int end = arr.length;
        System.out.println(search(arr, target, start, end));

    }

    static int search(int[] arr, int target, int start, int end){

        int midSize = (start + end) /2;
        if(start > end){
            return -1;
        }

        if (arr[midSize] == target){
            return midSize;
        }

        if (arr[midSize] > target){
            return search(arr,target,start, midSize -1);
        }
        return search(arr, target, midSize+1, end);


    }

}
