
/**
 * This class tests the Appointment class and its subclasses.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentTester2
{
    public static void main(String[] args){
        Appointment d = new Daily();
        Appointment m = new Monthly();
        Appointment o = new Onetime();

        ArrayList<Appointment> aList = new ArrayList<Appointment>();
        aList.add(d);
        aList.add(m);
        aList.add(o);

        d.setDescription("Brush teeth & take shower");
        m.setDescription("Clean the garage");
        m.setDate(7162019);
        m.occursOn(7, 16, 2019);
        o.setDescription("Doctor's appointment");
        o.setDate(7, 16, 2019);
        o.occursOn(7, 16, 2019);
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Appointments: (F)ind, (A)dd, or (Q)uit: ");
            String response = in.next();
            if(response.equals("A")){
                System.out.print("\n\nEnter type[(D)aily, (M)onthly, or (O)netime]: ");
                String response1 = in.next();
                if(response1.equals("D")){
                    Appointment d1 = new Daily();
                    aList.add(d1);
                    System.out.println("\nEnter description: ");
                    String description1 = in.nextLine();
                    d1.setDescription(description1);
                }
                else if(response1.equals("M")){
                    Appointment m1 = new Monthly();
                    aList.add(m1);
                    System.out.println("\nEnter date: ");
                    int date1 = in.nextInt();
                    m1.setDate(date1);
                    System.out.println("\nEnter description: ");
                    String description1 = in.nextLine();
                    m1.setDescription(description1);
                }
                else if(response1.equals("O")){
                    Appointment o1 = new Onetime();
                    aList.add(o1);
                    System.out.println("\nEnter date: ");
                    int date1 = in.nextInt();
                    o1.setDate(date1);
                    System.out.println("\nEnter description: ");
                    String description1 = in.nextLine();
                    o1.setDescription(description1);
                }
                else{
                    System.out.println("Enter a proper choice: ");
                }
             
            }
            
            else if(response.equals("F")){
                System.out.print("\n\nEnter a date(like 7 29 2016) to search: ");
                int month1 = in.nextInt();
                int day1 = in.nextInt();
                int year1 = in.nextInt();
                in.nextLine();
                if(("" + month1 + day1 + year1).equals("07162019")){
                    System.out.println("Your appointments on 7/16/2019: ");
                    System.out.println(d.toString());
                    System.out.println(m.toString());
                    System.out.println(o.toString());
                }
                //else if(m1.occursOn(month1, day1, year1) == true){
                //}
            }
            else if(response.equals("Q")){
                break;
            }
            else{
                System.out.println("Enter a proper choice: ");
            }
        }
        while(in.hasNextLine());
    }
}
