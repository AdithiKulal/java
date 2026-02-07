public class Main {
    public static void main(String[] args) {
    int X = 10;
    int Y = 20;
    int lar;
    //ternary operator
    lar = (X>Y)?X:Y;
    System.out.println(lar);
    //Arithmetic operator
    System.out.println("Sum = "+(X+Y));
    System.out.println("Difference = "+ (X-Y));
    System.out.println("Product = "+(X*Y));
    System.out.println("Quotient = "+(X/Y));
    System.out.println("Remainder = "+(X%Y));
    //Unary operator
    System.out.println("New X ="+(X++));
    System.out.println("New X ="+(X));
    System.out.println("New Y = "+(++Y));
    // increment and decrement operators
    int a = 9;
    int b = 10;
    int c = 9;
    int d = 10;
    int inc = a++ * ++b;
    int dec = c-- * --d;
    System.out.println("result = " + (inc));
    System.out.println("result = " + (dec));
    // binary operators
    System.out.println("1+2= " + 1 + 2);
    }
}