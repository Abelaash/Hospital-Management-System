package Model;


public class Patient {
    private int id;
    private String name,email,address,city,doctorid,type;
    
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getDoctor() {
        return doctorid;
    }
    public void setDoctor(String doctorid) {
        this.doctorid = doctorid;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    } 
}