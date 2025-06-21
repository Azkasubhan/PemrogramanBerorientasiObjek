import java.io.*;


public class SerializePerson{
    public static void main(String[] args) {
        Person person = new Person ("Azka");
        try{
            FileOutputStream f = new FileOutputStream("Person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
