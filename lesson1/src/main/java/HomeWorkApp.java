public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange\n" + "Banana\n" + "Apple\n");
    }
    public static void checkSumSign(){
        int a = 3;
        int b = 3;
        int result = a + b;
        if (result >= 0){
            System.out.println("Сумма положительная");
        }else System.out.println("Сумма отрицательная");
    }
    public static void printColor(){
        int value = 100;
        if(value <= 0){
            System.out.println("Красный");
        }else if (value <= 100){
            System.out.println("Желтый");
        }else System.out.println("Зеленый");
    }
    public static void compareNumbers(){
        int a = -5; int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        }else System.out.println("a < b");
    }
}
