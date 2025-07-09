class Method6 {
   public static void main(String[]args){
   int addResult=add(10,20); //calling statement
   System.out.println(addResult);
   System.out.println(multiply(30,40));  // directly declaring and printing
   System.out.println(multiply(20.3,40.45));
   }
    public static int add(int value1, int value2){
    int c=value1+value2;
    return c ;
    }
    public static double multiply(double value1 ,double value2){
    double c=value1*value2;
    return c;
    }

}
