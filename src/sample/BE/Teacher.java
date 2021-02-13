package sample.BE;

public class Teacher {

    private String name;
    private String lastName;

    public Teacher(String name, String lastName){
        setName(name);
        setLastName(lastName);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
