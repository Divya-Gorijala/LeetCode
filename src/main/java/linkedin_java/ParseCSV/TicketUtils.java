package linkedin_java.ParseCSV;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TicketUtils {
    public static Optional<TicketHolder> findTicketHolder(String name, List<TicketHolder> ticketHolderList) {
        return ticketHolderList.stream()
                .filter(ticketHolder -> ticketHolder.getName().equalsIgnoreCase(name)) // Case-insensitive comparison
                .findFirst(); // Returns the first matching TicketHolder wrapped in Optional
    }


    public static List<TicketHolder> importTicketHoldersFromCSV(String fileName) throws IOException, CsvValidationException {
        List<TicketHolder> ticketHolderList = new ArrayList<>();
        if (!fileName.contains(".csv")) {
            System.out.println("This i snot a CSV file: " + fileName);
            return ticketHolderList;
        }
        FileInputStream fis = new FileInputStream(fileName);
        InputStreamReader reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
        CSVReader csvReader = new CSVReader(reader);

        String[] headers = csvReader.readNext();
        if (headers == null) {
            System.out.println("CSV file is empty!");
            return ticketHolderList;
        }

        //Read data rows
        String[] row;
        while ((row = csvReader.readNext()) != null) {
            if (row.length < 2) continue;
            String name = row[0];
            int ticketNumber = Integer.parseInt(row[1]);
            ticketHolderList.add(new TicketHolder(name, ticketNumber));
        }
        csvReader.close();
        return ticketHolderList;
    }
}
