package collectionapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CharityMain {
 public static void main(String args[]) throws NumberFormatException, IOException {
  int ticketCost[] = new int[4];
  int amountToBeRaised = 0;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  for (int i = 0; i < 4; i++) {
   ticketCost[i] = Integer.parseInt(br.readLine());
  }
  amountToBeRaised = Integer.parseInt(br.readLine());
  int totalAmount = 0;
  int numberOfticketsinCombination[] = new int[4];
  String ticketArray[] = { "PINK", "GREEN", "RED", "ORANGE" };
  for (int not = 0; not <= 4; not++) {
   for (int i = 0; i < 3; i++) {
    totalAmount += not * ticketCost[i];
    switch (ticketArray[i]) {
    case "PINK":
     
     if (totalAmount == amountToBeRaised) {
      for(int j=0;j<4;j++)
      numberOfticketsinCombination[j] = ticketCost[0] * not;
     } else
     {
     break;
     }
    case "GREEN":
     if (totalAmount == amountToBeRaised) {
      for(int j=0;j<4;j++)
      numberOfticketsinCombination[j] = ticketCost[1] * not;
     }
     break;
    case "RED":
     if (totalAmount == amountToBeRaised) {
      for(int j=0;j<4;j++)
       numberOfticketsinCombination[j] = ticketCost[2] * not;
     }
     break;
    case "ORANGE":
     if (totalAmount == amountToBeRaised) {
      for(int j=0;j<4;j++)
          numberOfticketsinCombination[j] = ticketCost[3] * not;
     }
     break;
    }
     break;
   }
    System.out.println("# of "+ticketArray[0]+" is"+not+" # of "+ticketArray[1]+" is"+not+ " # of "+ticketArray[2]+" is "+not+" # of "+ticketArray[3]+" is "+not);
   }
   System.out.println("Number of tickets:");
   for (int t : numberOfticketsinCombination) {
    System.out.println(t);
   }
  }
 }
