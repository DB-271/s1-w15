public class FriendsMain{
    public static void main(String[] args){
        Friends f = new Friends();
        Name r = f.printRandomFriend();
        String n = r.fullName();
        System.out.println(n);
    }
}