/* Find 2 phrases that require the Unicode Table for diacritical marks including
 * the English translation
 */

public class E121{
    public static void main(String[] args)
    {
        System.out.println("Nosotros fuimos a la monta\u00F1a.       We went to the mountain.");
        System.out.println("\u00C9l se despierto en la mana\u00F1a.        He woke up in the morning.");
    }
}