package model;

public class Room {
    private String RoomId;
    private String RoomType;
    private double RoomPrice;

    public Room() {
    }

    public Room(String roomId, String roomType, String roomDetail, String floorNumber, double roomPrice) {
        RoomId = roomId;
        RoomType = roomType;
        RoomPrice = roomPrice;
    }

    public String getRoomId() {
        return RoomId;
    }

    public void setRoomId(String roomId) {
        RoomId = roomId;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public double getRoomPrice() {
        return RoomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        RoomPrice = roomPrice;
    }

    @Override
    public String toString() {
        return "Room{" +
                "RoomId='" + RoomId + '\'' +
                ", RoomType='" + RoomType + '\'' +
                ", RoomPrice=" + RoomPrice +
                '}';
    }
}

