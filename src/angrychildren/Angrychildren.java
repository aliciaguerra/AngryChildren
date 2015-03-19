package angrychildren;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Angrychildren {
       static BufferedReader in = new BufferedReader(new InputStreamReader(
                     System.in));
       static StringBuilder out = new StringBuilder();

       public static void main(String[] args) throws NumberFormatException,
                     IOException {
/*We read in the number of packets.*/
              int numPackets = Integer.parseInt(in.readLine());
/*We read in the number of kids.*/
              int numKids = Integer.parseInt(in.readLine());
/*We create a new array to read in the values of the packets.*/
              int[] packets = new int[numPackets];
/*We create a for loop to read in the values of each of the packets.*/
              for (int i = 0; i < numPackets; i++) {
                     packets[i] = Integer.parseInt(in.readLine());
              }
/*You can find information on this topic on JavaDocs at java.util.Arrays.*/
/*This will sort the packets array into ascending order.*/ 
              Arrays.sort(packets);
/*MAX_VALUE is a constant holding the maximum value an int can have.*/
              int unfairness = Integer.MAX_VALUE;
              int min = Integer.MAX_VALUE, max = 0;
              for (int i = 0; i < (numPackets - numKids); i++) {
/*Since the packets array is already is ascending order, the 
is the minimum value.*/
                     min = packets[i];
                     max = packets[numKids + i - 1];

                     if ((max - min) < unfairness) {
/*If (max-min) is less than the unfairness value, then the unfairness
value adopts (max-min) because it adopts the minimum value.*/
                           unfairness = max - min;
                     }
              }
/*We print out the minimum unfairness value.*/
              System.out.println(unfairness);
       }
}