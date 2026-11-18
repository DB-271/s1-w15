import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {

   // declare and initialize the ArrayList
   // declare and initialize the Random class
    ArrayList<String> name = new ArrayList<String>();
    Random random = new Random();
   
   
   // the constructor
   public Friends () {
    name.add("John Silksong");
    name.add("Queen of Hearts");
    name.add("John Hollow Knight");
   }
   
   public void printRandomFriend(){
       //return a random Name object from the List
       String randomFriend = name.get(random.nextInt(name.size()));
       System.out.println(randomFriend);
    }
   
  
}