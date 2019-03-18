import java.lang.Math; 


public class PhraseOmatic{

public static void main(String[] args){

String[] wordListOne = 
{"24/7", "multi-Tier","absence","abuse",
"academic",
"accept",
"access",
"accident",
"accompany",
"accomplish",
"according",
"account"};



String[] wordListTwo = 
{"24/7", "multi-Tier","absence","abuse",
"academic",
"accept",
"access",
"accident",
"accompany",
"accomplish",
"according",
"account"};



String[] wordListThree = 
{"24/7", "multi-Tier","absence","abuse",
"academic",
"accept",
"access",
"accident",
"accompany",
"accomplish",
"according",
"account"};


int onelength = wordListOne.length;

int twolength = wordListTwo.length;

int threelength = wordListThree.length;





  int rand1 = (int) (Math.random() * onelength );

  int rand2 = (int) (Math.random() * twolength );

  int rand3 = (int) (Math.random() * threelength);



  String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] ; 
  System.out.println("what we need is a" +phrase);



























  }
}