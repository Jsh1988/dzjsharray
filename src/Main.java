import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static Scanner in;
    public static int[] mass = {6, 1, 4, 1, 7};

    public static void main(String[] args) {

        // For enter value
        in = new Scanner(System.in);

        //Sort mass
        Arrays.sort(mass);

        System.out.print("\n");

        // get Element from mass
        getElement();

    }

    public static void getElement() {

        // Enter number
        System.out.print("\nEnter position: ");
        String k = in.nextLine();

        // Regular expression for check the entered value
        Pattern p = Pattern.compile("[0-9].*");

        Matcher m = p.matcher(k);

        if(m.find()) {

            // If value valid

            int el = Integer.parseInt(k);

            if(el < mass.length) {
                // if the value is not more than the length of of the array
                System.out.print("\nElement: " + mass[el-1]);
            } else {
                System.out.print("\nCame out beyond the limits of array! try again!");
                getElement();
            }
        } else {

            // if value not valid call a function again

            System.out.print("\nPlease. Enter correct data!");
            getElement();
        }
    }
}
