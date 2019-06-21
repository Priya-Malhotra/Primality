/* This is Question 2 from: 
https://www.dropbox.com/s/kbcvvvocbiz6aep/Primality_Tests.pdf?dl=0         */

import java.lang.Math;
import java.math.BigInteger;
public class Primality_PriyaMalhotra{
   public static void main (String [] args){
      BigInteger x = new BigInteger("2");
      BigInteger ei = new BigInteger("1008");
      BigInteger ni = new BigInteger("1009");
      while(x.modPow(ei, ni).equals(BigInteger.ONE) == false){
         BigInteger y = x.add(BigInteger.ONE);
         System.out.println(y);
         x = y;
      }
      System.out.println(x);
      System.out.println(x.modPow(ei, ni));
   }
}