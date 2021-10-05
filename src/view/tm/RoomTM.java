package view.tm;

import javafx.scene.control.Button;

public class RoomTM {
    private String roomNo;
    private String roomType;

    private Button btn1;

    public RoomTM(String roomNo, String roomType, Button btn1) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.btn1 = btn1;
    }

    public RoomTM() {
    }
    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Button getBtn1() {
        return btn1;
    }

    public void setBtn1(Button btn1) {
        this.btn1 = btn1;
    }


}
