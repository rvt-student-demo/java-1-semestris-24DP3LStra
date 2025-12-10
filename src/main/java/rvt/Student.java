package rvt;
//Custom data type
//Reference type
public class Student {


    //by default public
    private String name;
    
    //static-field
    // final- konstanta jeb nemainiga vertiba
    private static String group = "DP2-3";

    public Student(String n){
        name = n;
    }

    //non-static
    public void changeName(){
        group = "Abc";
    }
}
