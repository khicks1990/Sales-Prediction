/*
Data Dictionary:
Doubles totalSales = 46 00000.0, eastCoastSales

Calculate eastCoastSales as totalSales * 0.62
Display sales

*/

public class Main
{
   public static void main(String[] args)
   {
      double totalSales = 4600000.0;   // Total sales
      double eastCoastSales;           // East coast sales
      
      // Calculate east coast sales.
      eastCoastSales = totalSales * 0.62;
      
      // Display the prediction.
      System.out.println("East coast sales prediction: $" +
                         eastCoastSales);
   }
}
