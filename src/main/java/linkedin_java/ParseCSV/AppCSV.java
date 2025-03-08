package linkedin_java.ParseCSV;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AppCSV {
    public static void main(String[] args) {
        List<TicketHolder> ticketHolderList = new ArrayList<>();
        try {
            ticketHolderList
                    .addAll(TicketUtils
                            .importTicketHoldersFromCSV("ticketholders.csv"));
        } catch (IOException | CsvValidationException e) {
            System.out.println(e);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the full name under the ticket?");
        String name = scanner.nextLine();
        Optional<TicketHolder> ticketHolderOpt = TicketUtils
                .findTicketHolder(name, ticketHolderList);
        System.out.println(ticketHolderOpt);
    }
}
