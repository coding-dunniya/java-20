// employee record
public record Employee(int id, String name, String designation) {

    // constructors inside record

    public Employee(int id, String name, String designation) {
        this.name = name.trim();
        this.designation = designation.trim();
        if (id <= 0) {
            throw new IllegalArgumentException("employee id should be greater than 0");
        }
        this.id = id;
    }

    public Employee(int id, String name) {
        this(id, name, "intern");
    }
}
