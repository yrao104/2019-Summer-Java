
/**
 * Write a description of class b here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrezSocialATDP
{
    public static void main(String[] args)
    {
        // ADD 1ST PERSON TO THE PRESIDENT SOCIAL
        PrezATDP prezW = new PrezATDP("Washington", 70);
        
        // SHOW RESULTS: NO FRIENDS
        System.out.print("\nRESULT: ");
        System.out.println(prezW.getOwnName() + " age (" + prezW.getOwnAge() + ")"
                   + " has " + prezW.getFriendCount() + " friends: "
                   + prezW.getAllFriendsNames());
        System.out.println("EXPECTED: Washington has no friends right now");
        
        // ADD FRIENDS TO THE 1ST PRESIDENT
        PrezATDP prezA1 = new PrezATDP("Adams", 44);     prezW.addFriend(prezA1);
        PrezATDP prezA2 = new PrezATDP("Jefferson", 8000);     prezW.addFriend(prezA2);
        PrezATDP prezA3 = new PrezATDP("Madison", 1);     prezW.addFriend(prezA3);
        PrezATDP prezA4 = new PrezATDP("Monroe", 400);     prezW.addFriend(prezA4);

        
        // SHOW RESULTS: W/ FRIENDS
        System.out.print("\nRESULT after addFriend: ");
        System.out.println(prezW.getOwnName() + " has " + prezW.getFriendCount() + " friends: "
                   + prezW.getAllFriendsNames());
        System.out.println("EXPECTED: Washington has 4 friends: Adams, Jefferson, Madison, Monroe");
          
        
      // UNFRIEND
         prezW.unfriend(prezA2.getOwnName());
      
       // SHOW RESULTS: AFTER UNFRIENDING
        System.out.print("\nRESULT after trying to unFriend (" + prezA2.getOwnName() + "): ");
        System.out.println(prezW.getOwnName() + " has " + prezW.getFriendCount() + " friends: "
                   + prezW.getAllFriendsNames());
        System.out.println("EXPECTED: Washington has 3 friends: Adams, Madison, Monroe");
    }

}
