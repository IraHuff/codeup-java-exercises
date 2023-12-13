public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.println(", World!");

        int myFavoriteNumber = 42;
        System.out.println(myFavoriteNumber);

        String myString = "the meaning of life, the universe, everything";
        //3.14159 compiles fine changing it to ' says to many characters in a character literal
        //incompatible type
        System.out.println(myString);

        float myNumber;
        //variable myNumber might not have been initialized
        myNumber = 3.14F;
        //incompatible types: possible lossy conversion from double to long
        //ignores the L = means long
        //add an F to make the literal a float ro change the declaration to double
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String class;//not a statement

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
        //Exception in thread "main" java.lang.ClassCastException: java.lang.String incompatible with java.lang.Integer
        //	at HelloWorld.main(HelloWorld.java:33)
//        incompatible types: java.lang.String cannot be converted to int
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        System.out.println(x);
//        y -= x;
//        System.out.println(y);

        int x = 2147483647;
        x++;
        System.out.println(x);
        // if beyond value get error
        //int went negative
        //int is 4 bytes

        char unicode ='\u0000';
        System.out.println(unicode);
    }
}
