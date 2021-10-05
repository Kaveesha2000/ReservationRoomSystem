package model;

public class Room {
    String roomNo;
    String roomType;

    public Room() {
    }

    public Room(String roomNo, String roomType) {
        this.roomNo = roomNo;
        this.roomType = roomType;
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

}
