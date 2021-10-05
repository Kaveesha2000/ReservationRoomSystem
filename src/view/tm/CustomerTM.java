package view.tm;


import javafx.scene.control.Button;

public class CustomerTM {
    private String roomNo;
    private String name;
    private String nic;
    private String contact;
    private String email;
    private String address;
    private Button btn;

    public CustomerTM(String roomNo, String roomType, Button btn) {
    }

    public CustomerTM(String roomNo,String name, String nic, String contact, String email, String address, Button btn) {
        this.setRoomNo(roomNo);
        this.setName(name);
        this.setNic(nic);
        this.setContact(contact);
        this.setEmail(email);
        this.setAddress(address);
        this.setBtn(btn);
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

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

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
