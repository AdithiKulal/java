import java.util.Scanner;
class Mainutil {
    public static void main(String[] args) {
        int sum=0;
        String result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Subjects: ");
        int noofSubjects=sc.nextInt();
        int marks[]=new int[noofSubjects]; //intializing array
        System.out.println("Enter the marks of " + noofSubjects + " subjects");
        System.out.println("Enter the marks of each subject. Press Enter to give marks for another subject");
        //entering marks
        for(int i=0;i<noofSubjects;i++){
            marks[i]=sc.nextInt();
        }//calculating sum
        for(int j=0;j<noofSubjects;j++){
            sum=sum+marks[j];
        }//generating result
        int percentage=sum/noofSubjects;
        //can also be written as
        // //int percentage=(sum/noOfSubjects*100)*100;
        // System.out.println(percentage);
        if(percentage>= 95){
            result="Grade A";
        }
        else if(percentage>=80 && percentage<95){
            result="Grade B";
        }
        else if(percentage>=60 && percentage<80){
            result="Grade C";
        }
        else{
            result="Grade D";
        }
        System.out.println("The total marks is: " + sum);
        System.out.println("The percentage is: " + percentage);
        System.out.println("The grade is: " + result);
    }
}