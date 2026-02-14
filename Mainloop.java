public class Mainloop {
    public static void main(String[] args) {
        //using for loop
        // // start value 10
        // // condition 1
        // // increment/decrement/interval -1
        for(int i = 10;i>=1;i--){
            //body of loop
            System.out.println(i);
        }
        // using whileloop
        int j = 1;
        while (j <= 10) {
            // body of loop
            System.out.println(j);
            j++;
        }
        // do-while loop
        int i = 6;
        do {
            System.out.println("Number: " + i);
            i++;
        } while (i <= 5);
}
}