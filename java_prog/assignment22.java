public class assignment22 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before calling modifyNumber method: " + number);      
        modifyNumber(number);  
        System.out.println("After calling modifyNumber method: " + number);
    }
    public static void modifyNumber(int num) {
        num = num+10;
        System.out.println("Inside modifyNumber method: " + num);
    }
}
