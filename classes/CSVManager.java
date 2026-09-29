package classes;
import java.io.*;

class CSVManager {

    public void saveCars() {

        try {
            FileWriter writer = new FileWriter("cars.csv");

            writer.write("brand,model,engineType,engineCC,weight,price\n");

            writer.write("TOYOTA,New YARIS Cross,Gasoline,1500,1285,911000\n");
            writer.write("BYD,Dolphin 490,EV,0,1658,859999\n");
            writer.write("HONDA,CR-V E 2023,Gasoline,1500,1743,1419000\n");
            writer.write("AION,ES ev 2023,EV,0,1290,850000\n");

            writer.close();

            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving CSV: " + e.getMessage());
        }
    }

    public void loadCars() {

        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader("cars.csv"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }
    }
}