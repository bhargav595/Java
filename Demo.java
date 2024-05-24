class world{
    public static void main(String[] args){
        
        byte b= 120;
        short s = 211;
        int num=541; //Binary- 0b101  Hexadecimal- 0x7E
        long l =54367l;
        float f = 52.8f;
        double d = 12e11; 
        boolean o =true;

        System.out.println("Hello World!!!");
        //------------------------------
        //Type Conversion and Casting
        //------------------------------
        byte a = (byte)num; //modulus converstion, as num value exceed the range of byte it will be num % 256 (2^8)
        int result = a+b; // addition of 2 byte values which exceed the byte range would be converted to respective data type by java automatically. 
        System.out.println(result);
        
    }
}
//Java provides a Constructor class which can be used to get the internal information of a constructor in the class. 
//It is found in the java.lang.reflect package.

// Copying the value of one object to another during the object creation
class Student6{  
    int id;  
    String name;  
    //constructor to initialize integer and string  
    Student6(int i,String n){  
    id = i;  
    name = n;  
    }  
    //constructor to initialize another object  
    Student6(Student6 s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student6 s1 = new Student6(111,"Karan");  
    Student6 s2 = new Student6(s1);  
    s1.display();  
    s2.display();  
   }  
}  