public class CallByValueExample {
    public static void modify(int number){
        number=10;
    }
    public static void main(String[] args) {
        int num= 5;
        modify(num);
        System.out.println(num);
    }
}
