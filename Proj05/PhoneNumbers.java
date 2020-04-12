public class PhoneNumbers
{
   /**
      Cleans a phone number.
      @param phoneNumber a phone number that should contain ten digits and possibly other characters
      @return the phone number in the form (###) ###-#### or the string "Error" if phoneNumber
      does not have ten digits
   */
   public String cleanNumber(String phoneNumber)
   {   
      // your work here
      String number = "(";
      int digits = 0;
      for (int i = 0; i < phoneNumber.length(); i++)
      {
         char ch = phoneNumber.charAt(i);
         if (Character.isDigit(ch))
         {
            digits+= 1;
            number+= phoneNumber.charAt(i);
            if(number.length() == 4){
               number+= ") ";
            }
            else if(number.length() == 9){
               number+= "-";
            }
            else{
               number = number;
            }
         }
      }
      if(number.length() == 14 && digits == 10){
         return number;
      }
      else{
         return "Error";
         //return  number;
      }    
   }   
}