public class Main{
    public static void main(String[] args){
        // store 5 roll no
        // int[] num = new int[5];
        // String[] names = new String[5];

        // data of 5 student roll no, marks, name 
        // Student[] student = new Student[5];

        Student Sakshi = new Student();   //by default constructor....  
        Sakshi.roll=45;
        Sakshi.name = "Sakshi";
        Sakshi.marks = 9.5f;
        System.out.println(Sakshi.roll);
        System.out.println(Sakshi.name);
        System.out.println(Sakshi.marks);

        Student A = new Student();
        System.out.println(A.roll);
        A.gree();
        Sakshi.gree();
        A.changeName("Sakshi");
        A.gree();


        Student B = new Student(22,"BBBB");
        System.out.println(B.roll);
        System.out.println(B.marks);
        System.out.println(B.name);
    
        Student random = new Student(Sakshi);
        System.out.println(random.name);

        // Student random2 = new Student();

    }

    
}
// create a class
class Student{
    int roll;
        String name;
        float marks;


    Student(){
        // this.roll = 50;
        // this.name = "S";
        // this.marks=9.56f;

        // calling another constructor in a constructor
        this (13,"Sakshi");
    }

    Student(int roll,String name){
        this.roll = roll;
        this.name=name;
        // this.marks=marks;
    }

    Student(Student other){
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }
    
    

    void changeName(String newname){
        name = newname;
    }

    void gree(){
        System.out.println("Hello, My name is : " + this.name);
    }   

}