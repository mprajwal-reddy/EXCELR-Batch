public class Demo064{
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int a = arr[0];
        int b= arr[arr.length-1];
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println("The first element now is: "+a);
        System.out.println("The last element now is: "+b);
    }
}
    