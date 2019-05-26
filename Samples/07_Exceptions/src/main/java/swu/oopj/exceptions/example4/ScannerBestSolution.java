package swu.oopj.exceptions.example4;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ScannerBestSolution {
	//static String input = "2017-10-23"; //OK
	//static String input = "2017-13-23"; //bad date
	static String input = ""; //bad input (causes java.util.NoSuchElementException: No line found)
	public static void main(String[] args) {
		
		try(Scanner s = new Scanner(input)){			
			String line = s.nextLine();
			LocalDate date = LocalDate.parse(line);
			System.out.println(date);
			System.out.format("Day in year: %d%n", date.getDayOfYear());
		}
		catch(DateTimeParseException exc){
			System.out.format("Error parsing %s as date:%n %s%n",
					input,
					exc.getMessage());
		}		
	}

}
