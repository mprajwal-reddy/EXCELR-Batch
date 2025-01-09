public class Demo021 {
    public static void main(String[] args) {
        int input = 15; // Example input
        System.out.println(fizzBizz(input));
    }

    public static String fizzBizz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FIZZBIZZ";
        } else if (number % 3 == 0) {
            return "FIZZ";
        } else if (number % 5 == 0) {
            return "BIZZ";
        } else {
            return String.valueOf(number);
        }
    }
}