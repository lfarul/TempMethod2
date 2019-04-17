public class TempMethod2 {
    
    //definicja metody isPositive wraz z argumentem Temp typu int
    static void isPositive(int Temp) {
        
        if (Temp > 0)
        
        {
            System.out.println("Twoja temperatura to: " +  Temp + "." + " " + "Temperatura jest dodatnia.Więc mozesz ubrać szorty."); 
        }
        
        else if (Temp < 0)

        {
            System.out.println("Twoja temperatura to: " + Temp + "." + " " + "Temperatura jest ujemna, więc ubierz się ciepło.");
        }
        
        else 
        {
            System.out.println("Twoja temperatura to: " + Temp + "." + " " + "Temperatura wynosi 0, więc nie jest źle.");
        }
        
    }

    public static void main(String[] args) {
        // wywoluje metode isPositive nadajac argumentowi Temp wartosc 20 
        isPositive(20);
        
    }
    
}
