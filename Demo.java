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