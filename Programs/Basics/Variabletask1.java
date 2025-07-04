class Variabletask1{
   static String stringvalue; // Global variables [outside a method] - initlization is not mandatory [default value - null]
   static int intvalue;             // 0
   static char charvalue;          // default value is white space
   static long longvalue;         // 0
   static boolean booleanvalue;  // false
   static double doublevalue;   // 0.0



public static void main(String[]args){
     String value="hello World"; // Local variables [inside a method] - initlization is mandatory

     System.out.println(value);
     System.out.println(stringvalue);
     System.out.println(intvalue);
     System.out.println(charvalue);
     System.out.println(longvalue);
     System.out.println(booleanvalue);
     System.out.println(doublevalue);







}



}