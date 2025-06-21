import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("Person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            Person person = (Person) s.readObject();
            System.out.println("serialized person name : " + person.getName());
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
