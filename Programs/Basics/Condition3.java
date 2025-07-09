class Condition3 {
     public static void main(String[]args){
     char gender='m';
     System.out.println(findGender(gender));
     }

     public static String findGender(char value){
     if(value=='F'|| value=='f')
       return "Female";
     else if(value=='M'|| value=='m')
       return "male";
     else if(value=='O'|| value== 'o')
       return "Others";
     else 
       return "provide correct value";
     }
}