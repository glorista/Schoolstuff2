package AllesMoegliche;

public class Fizzbuzz {
    public static void main(String[] args) {
        for (int i=1; i<=100;i++){
            System.out.println(FizzBuzz(i));
        }
    }
    public static String FizzBuzz(int a){
        if (a%3==0 && a%5==0){
            return "FizzBuzz";
        } else if (a%3==0){
            return "Fizz";
        }else if (a%5==0 ){
            return "Buzz";
        } else{
            return String.valueOf(a);
        }
    }
}
