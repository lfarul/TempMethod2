public class TempMethod2 {
    
    void dockerBuildImage(){
        
        System.out.println("Jenkinsfile buduje obrazy dla Docker Hub oraz Google Cloud");
    }
    
    void dockerHubPush (){  

        System.out.println("Wygląda na to, że Jenkinsowi udało się przepchnąć obraz na chmurę Dockera :)");
    }
    
    //definicja metody isPositive wraz z argumentem Temp typu int
    void isPositive(int Temp) {

        if (Temp > 0)

        {
            System.out.println("Twoja temperatura to: " +  Temp + "." + " " + "Temperatura jest dodatnia, więc mozesz ubrać szorty."); 
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
        
        // tworzę nowy obiekt "t" klasy TempMethod2 aby w statycznej metodzie Main wywołać metody niestatyczne.
        
        TempMethod2 t = new TempMethod2();
        
        t.dockerBuildImage();
        t.dockerHubPush();
        t.isPositive(25);
    }
}
