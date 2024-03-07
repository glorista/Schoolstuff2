public class Arrays2 {
    public static void main(String[] args) {
        int[] arr ={5,6,8,3,2,4};
        System.out.println(printArray2(arr,12));

    }
    public static boolean printArray2(int[] numbers,int n) {
        for (int number: numbers) { //für jede number in numbers
            if (n==number){
                return true;
            }

        }
        return false;

    }
}
