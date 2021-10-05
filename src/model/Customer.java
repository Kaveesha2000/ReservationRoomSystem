package model;

public class Customer {

    private String roomNo;
    private String name;
    private String nic;
    private String contact;
    private String address;
    private String email;

    public Customer(String roomNo, String name, String nic, String contact, String address, String email) {
        this.roomNo = roomNo;
        this.name = name;
        this.nic = nic;
        this.contact = contact;
        this.address = address;
        this.email = email;
    }

    public Customer() {
    }


    public String getRoomNo() { return roomNo; }

    public void setRoomNo(String roomNo) { this.roomNo = roomNo; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
