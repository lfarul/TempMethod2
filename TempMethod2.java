
package tempmethod2;

public class TempMethod2 {
    
    //definicja metody isPositive wraz z argumentem Temp typu int
    static void isPositive(int Temp) {
        
        if (Temp > 0)
        
        {
            System.out.println("Twoja temperatura to: " +  Temp + "." + " " + "Temperatura jest dodatnia."); 
        }
        
        else if (Temp < 0)

        {
            System.out.println("Twoja temperatura to: " + Temp + "." + " " + "Temperatura jest ujemna.");
        }
        
        else 
        {
            System.out.println("Twoja temperatura to: " + Temp + "." + " " + "Temperatura wynosi 0.");
        }
        
    }

    public static void main(String[] args) {
        // wywoluje metode isPositive nadajac argumentowi Temp wartosc 20 
        isPositive(0);
        
    }
    
}
