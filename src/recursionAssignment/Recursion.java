package recursionAssignment;

public class Recursion{

  public static int count7(int n){
    if(n == 0){
      return 0;
      //checks if the number is zero, if it is return 0
    }else if(n%10 == 7){
      return 1 + count7(n/10);
      //checks if the number divided by 10 will leave the rightmost number to have a remainder of 7, if it does return 1 and divide the number by 10
    }else{
      return 0 + count7(n/10);
      //return 0 if the number divided by 10 doesn't have a remainder of 7 and add the number divided by 10 this will continue until n=0 and then the all the returns will be added together
    }
  }
  //public static String endX(String str){
    //if(str.substring(0,1).equals("")){
      //return endX(str);
    //}else if(str.substring(0,1).equals("x")){
     // return endX(str.substring(1)) + "x";
    //}else{
      //return endX(str);
   // }
  //}
}
