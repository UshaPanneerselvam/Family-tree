package Entity;

public class Person {

    private String id;
    private String name;
    private Person fatherName;
    private Person motherName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getFatherName() {
        return fatherName;
    }

    public void setFatherName(Person fatherName) {
        this.fatherName = fatherName;
    }

    public Person getMotherName() {
        return motherName;
    }

    public void setMotherName(Person motherName) {
        this.motherName = motherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
