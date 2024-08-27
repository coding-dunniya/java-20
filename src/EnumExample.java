import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// simple class to show real world example of use of enums
public class EnumExample {

    // ask user a date and print the day on that date
    public static void printDay() {
        // write a program ask user a date and then print what's the day on that date

        // ask user the date --> user input
        try (InputStreamReader ir = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(ir)) {
            String line = null;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            do {
                line = br.readLine();
                if (!"quit".equalsIgnoreCase(line)) {
                    // user entered a date
                    // convert string to date object
                    LocalDate date = LocalDate.parse(line, formatter);
                    int value = date.getDayOfWeek().getValue();
                    WeekDays wd = WeekDays.valueOf(value);
                    System.out.println("On " + line + " the day is " + wd.name());
                }
            } while (line != null && !"quit".equalsIgnoreCase(line));
        } catch (IOException io) {
            System.out.println("IOException ==> " + io.getMessage());
        }
    }
}
