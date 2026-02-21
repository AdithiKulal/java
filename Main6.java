//this activity is mainly to explain Hierarchical inheritance
//parent class
class Mammals {
    void mam(){
        System.out.println("Inside Mammals Class");
    }
}
// child class
class Lion1 extends Mammals {
    void roar(){
        System.out.println("Inside Lion class ");
    }
}
// child
class Human extends Mammals{
    void hum(){
        System.out.println("Inside Human Class");
    }
}

public class Main6{
    public static void main(String args[]){
        Lion1 obj=new Lion1();//object of child of child class
        Human obj1 = new Human();
        obj1.hum();//this will result in error to run this we have to cr
        obj.roar();
        obj.mam();
    }
}