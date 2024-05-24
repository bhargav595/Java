public class Demo2 {
    int rollno;  
    String name;  
    float fee;  
    //this() : to invoke current class constructor
    //The this() constructor call should be used to reuse the constructor from the constructor
    //## Call to this() must be the first statement in constructor.##
    Demo2(){System.out.println("hello a");}  
    Demo2(int x){  
        //this();  
        this(12, "Sai", 647.65f);
        System.out.println(x);  
    }  
    Demo2(int rollno,String name,float fee){  
    //this: to refer current class instance variable
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;
    System.out.println(this.rollno+" "+this.name+" "+this.fee); 
    }
    //this: to invoke current class method  
    //If you don't use the this keyword, compiler automatically adds this keyword while invoking the method
    void m(){System.out.println("hello m");}  
    void n(){  
        System.out.println("hello n");  
        //m();//same as this.m()  
        this.m();
        //this: to pass as an argument in the method
        o(this);  
    }
    void o(Demo2 obj){
        System.out.println(obj);  
    }
    //this keyword that you return as a statement from the method
    Demo2 getDemo2(){
        return this;
    }
}

class Test1{
    public static void main(String[] args){
        Demo2 res= new Demo2(1);
        res.n();
    }
}
