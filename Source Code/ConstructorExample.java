//This is the example of Constructor

public class ConstructorExample {
   int age=51;
   String name="Apey";
   //Default constructor
   //ConstructorExample(){
//this.name="Apey";
//this.age=51;
  // }

//Parameterized constructor
ConstructorExample(String n,int a){
this.name=n;
this.age=a;
   }

public static void main(String args[]){
ConstructorExample obj1 = new ConstructorExample();
ConstructorExample obj2 =  new ConstructorExample("Jebon", 99);
System.out.println(obj1.name+" "+obj1.age);
System.out.println(obj2.name+" "+obj2.age);
   }
}  //the end