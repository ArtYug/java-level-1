public class MainApp {
    public static void main(String[] args) {
       System.out.println(checkSumIfHePositive(20,5));
       checkNumberIfHePositive(-3);
       System.out.println(checkIfNumberNegativee(5));
       printStringNumberOfTimes("john",4);
       System.out.println();
       System.out.println(checkIfLeapYear(400));
    }
    public static boolean checkSumIfHePositive(int num1 , int num2){
       int result = num1 + num2;
       if (result >= 10 && result <= 20) return true;
       return false;
    }
    public static void checkNumberIfHePositive(int num ) {
       if (num >= 0) {
            System.out.println("positive number");
       }else System.out.println("number negative");
    }
    public static boolean checkIfNumberNegativee(int num){
        if (num >= 0) return  true;
        return false;
    }
    public static void printStringNumberOfTimes (String word , int number){
        if (number != 0 ){
            for (int i = 0; i <number; i++) {
                System.out.print(word + " " );
            }
        }else System.out.println("You can't put 0 ");
    }
    public static boolean checkIfLeapYear (int year){
        if (((year %4 == 0) && (year %100 != 0)) ||( year %400 ==0)){
        return true;
        }
        return false;
    }
}
