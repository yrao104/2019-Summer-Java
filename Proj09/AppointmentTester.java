import java.util.Scanner; 
import java.util.ArrayList;
/**
 * Write a description of class AppointmentTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppointmentTester
{
    static Scanner kboard = new Scanner(System.in);
    
   //static Appointment[] appointmentList = new Appointment[10]; 
   static ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
   public static void main(String []args)
   {
       int counter = 0;
       while (true) {
    System.out.println("'F' for find, 'Q' to quit, 'A' to add: "); // Ask user
    String input = kboard.nextLine();
    
    if (input.equalsIgnoreCase("A")) {
        System.out.println("'D' for daily, 'M' for monthly, 'O' for one time: ");
        String aptInput = kboard.nextLine();
        if (aptInput.equalsIgnoreCase("D")) {
            System.out.println("Enter your appointment description: ");
            
 
            String aptInputDal = kboard.nextLine(); 
            Appointment dailyAppt = new Daily(aptInputDal); 
            //d.setDescription (aptInputDal);
            appointmentList.add(dailyAppt);
            
        }
        
        if (aptInput.equalsIgnoreCase("M")) {
        System.out.println("When do you want it: ");
        String monthlyDate = kboard.nextLine(); 
        int findApt1 = Integer.parseInt(monthlyDate.substring(0,1));
        int findApt2 = Integer.parseInt(monthlyDate.substring(3,4));
        int findApt3 = Integer.parseInt(monthlyDate.substring(6,9));   
        System.out.println("Enter your appointment description: ");
        String aptInputMon = kboard.nextLine(); 
        Appointment monInput = new Monthly(findApt2,aptInputMon); //same as below
        //d.setDescription (aptInputDal);
        appointmentList.add(monInput);//used to be one  TimeInput
        }
        
        if (aptInput.equalsIgnoreCase("O")) {
        System.out.println("When do you want it: ");
        String oneTimeDate = kboard.nextLine(); 
        int findApt1 = Integer.parseInt(oneTimeDate.substring(0,1));
        int findApt2 = Integer.parseInt(oneTimeDate.substring(3,4));
        int findApt3 = Integer.parseInt(oneTimeDate.substring(6,9));
        System.out.println("Enter your appointment description: ");
        String aptInputOnce = kboard.nextLine(); 
        Appointment oneTimeInput = new Onetime(findApt1,findApt2,findApt3, aptInputOnce); 
        //d.setDescription (aptInputDal);
        appointmentList.add(oneTimeInput);
        }
        counter++;
    } 
    if (input.equalsIgnoreCase("F")) {
        System.out.println("Enter your appointment date like '07 20 2016': ");
        String findApt = kboard.nextLine(); 
    System.out.println("String size="+findApt+"-- "+ findApt.length()); 
        int findApt1 = Integer.parseInt(findApt.substring(0,1));
        int findApt2 = Integer.parseInt(findApt.substring(3,4));
        int findApt3 = Integer.parseInt(findApt.substring(6,9));
       System.out.println("appointmentList.size() ="+appointmentList.size());
       
        for (int i = 0; i < appointmentList.size(); i++) {
            //appointmentList[1] = findApt;
          
            if (appointmentList.get(i).occursOn(findApt1,findApt2,findApt3)) {
            System.out.println("Your appointment on " + findApt + ": " + appointmentList.get(i).toString()); //not doen yet
        }
    }
        //kboard.close();
    }
    if (input.equalsIgnoreCase("Q") ) {
     System.out.println("Have a nice day!!");
     System.out.println("Thank You!!");
     //kboard.close();
     System.exit(0);
     
    
    }
     
}
}
    
    
    
}


