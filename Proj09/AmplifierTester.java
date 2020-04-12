
/**
 * Write a description of class AmplifierTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AmplifierTester
{
    public static void main(String[] args){
        InvertingAmplifier iamp1 = new InvertingAmplifier(1.75, 1.5);
        System.out.println("Description: " + iamp1.getDescription());
        System.out.println("Gain value: " + iamp1.getGain());
        
        NoninvertingAmplifier niamp1 = new NoninvertingAmplifier(1.75, 1.5);
         System.out.println("\nDescription: " + niamp1.getDescription());
        System.out.println("Gain value: " + niamp1.getGain());
        
        VoltageDividerAmplifier vdamp1 = new VoltageDividerAmplifier(1.75, 1.5);
        System.out.println("\nDescription: " + vdamp1.getDescription());
        System.out.println("Gain value: " + vdamp1.getGain());
        
    }
}
