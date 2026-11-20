import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {

   // declare and initialize the ArrayList
   // declare and initialize the Random class
    ArrayList<Name> friends = new ArrayList<Name>();
    Random r = new Random();
   
   
   // the constructor
   public Friends () {
    friends.add(new Name("Sean", "Morris"));
    friends.add(new Name("Zade", "Morris"));
    friends.add(new Name("kaelin", "Morris"));
   }
   
   public Name printRandomFriend(){
       //return a random Name object from the List
       int x = r.nextInt(friends.size());
       return friends.get(x);
    }
    public Name getRadomFriend(){
        int x = (int)(Math.random() * friends.size());
        return friends.get(x);
    }
   
  
}