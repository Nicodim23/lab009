import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("C:\\Users\\cti22c106\\IdeaProjects\\lab009\\Main.txt");
        Car car = null;
        try {
            car = objectMapper.readValue(file, Car.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(car);
    }
}
