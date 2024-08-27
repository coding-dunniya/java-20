import java.io.*;

public class TransientKeyword {

    // run this method to see object serialization/ deserialization in action
    public static void main(String[] args) {
        // object serialization example
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("ritesh");
        s1.setDesignation("engineer");
        s1.setAbc("hello world");

        String fileName = "myfile.txt";
        try (FileOutputStream fos = new FileOutputStream(fileName); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(s1);
            oos.flush();
            fos.flush();
        } catch (IOException ex) {
            System.out.println("IOException ==> " + ex.getMessage());
        }

        // read object
        try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis)) {
            Student s2 = (Student) ois.readObject();
            System.out.println("Name ==> " + s2.getName());
            System.out.println("Id ==> " + s2.getId());
            System.out.println("Designation ==> " + s2.getDesignation());
            System.out.println("ABC ==> " + s2.getAbc());
        } catch (IOException | ClassNotFoundException io) {
            System.out.println("IOException ==> " + io.getMessage());
        }
    }
}

class Student implements Serializable {

    private int id;

    private String name;

    private String designation;

    private transient String abc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }
}
