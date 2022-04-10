package pojos.StaffPojos;

public class StaffSearchCountry {
private int id;
private String name;

    public StaffSearchCountry() {
    }

    public StaffSearchCountry(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StaffSearchCountry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

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
}
