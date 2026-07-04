package projectoop;

import java.util.Scanner;

public class MyTimeTest {
    static void main() {

        Scanner scan = new Scanner(System.in);
        MyTime myTime = new MyTime();

        int hour = getValidInput(scan, "Soatni kiritin (0-23): ");
        int minute = getValidInput(scan, "Daqiqani kiritin (0-59): ");
        int second = getValidInput(scan, "Saniyani kiritin (0-59): ");

        myTime.setTime(hour, minute, second);
        IO.println();

        IO.println("24 soatli format: " + myTime);
        IO.println("12 soatli format: " + myTime.toAmPmString());
        IO.println();

        IO.println("1 saniya oldinga siljiw: " + myTime.nextSecond().toAmPmString());
        IO.println("1 daqiqa oldinga siljiw: " + myTime.nextMinute().toAmPmString());
        IO.println("1 soat oldinga siljiw: " + myTime.nextHour().toAmPmString());
        IO.println();

        IO.println("1 saniya orqaga siljiw: " + myTime.previousSecond().toAmPmString());
        IO.println("1 daqiqa orqaga siljiw: " + myTime.previousMinute().toAmPmString());
        IO.println("1 soat orqaga siljiw: " + myTime.previousHour().toAmPmString());

        scan.close();
    }

    private static int getValidInput(Scanner scan, String prompt) {
        while (true) {
            IO.print(prompt);
            if (scan.hasNextInt()) {
                return scan.nextInt();
            } else {
                IO.println("Error: Iltimos, to'g'ri raqam kirtin!");
                scan.next();
            }
        }
    }
}
