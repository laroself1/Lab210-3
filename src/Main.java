/**
 * Created by LaroSelf on 20.03.2016.
 */
public class Main {
    public static void main(String[] args) {
Person a = new Person();
       try{ a.setAge(121);}
       catch (InvalidAgeException e){System.out.println(e.getMessage());}
      System.out.println(a.getAge());

        try{ a.setAge(119);}
        catch (InvalidAgeException e){System.out.println(e.getMessage());}
        System.out.println(  a.getAge());

    }
}
