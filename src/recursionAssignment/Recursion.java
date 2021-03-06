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
  public static String endX(String str){
    if(str.equals("")){
      return "";
      //Checks if string is blank, if it is return blank
    }else if(str.substring(0,1).equals("x")){
      return endX(str.substring(1)) + "x";
      //Checks if first letter is x, if it is then it returns the next letter plus x
    }else{
      return str.substring(0,1) + endX(str.substring(1));
      //checks if none of the above conditions are being met, if not then takes the first letter and adds it the to the next letter behind it (Ex: ax would be xa)
    }
  }
  public static String stringClean(String Str){
    //Variables
    int intLength;
    intLength = Str.length() -1; 

    if(Str.length()<=1){
      return Str;
      //If the length of the Str is less or equal to one then return the Str
    } else if(Str.charAt(intLength) == Str.charAt(intLength-1)){
      return stringClean(Str.substring(0,intLength));
      //If the last letter and the second last letter are the same then return Str without the last letter 
    }else{
      return stringClean(Str.substring(0,intLength))+Str.charAt(intLength);
      //If none of the above conditions are met then return Str with all the letters before the second last letter and add the last letter to the new Str (Eg. hello = hel + 0).
    }
  }
}
