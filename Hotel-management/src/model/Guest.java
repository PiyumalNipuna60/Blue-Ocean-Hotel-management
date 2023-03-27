package model;

public class Guest {
    private String Name;
    private String NIC;
    private String TNumber;
    private String Address;
    private String MealPlane;
    private String RoomId;
    private String RoomType;
    private String CheckIn;
    private String CheckOut;

    public Guest() {
    }

    public Guest(String name, String NIC, String TNumber, String email, String address, String mealPlane, String roomId, String roomType, String checkIn, String checkOut) {
        Name = name;
        this.NIC = NIC;
        this.TNumber = TNumber;
        Address = address;
        MealPlane = mealPlane;
        RoomId = roomId;
        RoomType = roomType;
        CheckIn = checkIn;
        CheckOut = checkOut;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getTNumber() {
        return TNumber;
    }

    public void setTNumber(String TNumber) {
        this.TNumber = TNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMealPlane() {
        return MealPlane;
    }

    public void setMealPlane(String mealPlane) {
        MealPlane = mealPlane;
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

    public String getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(String checkIn) {
        CheckIn = checkIn;
    }

    public String getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(String checkOut) {
        CheckOut = checkOut;
    }


    @Override
    public String toString() {
        return "Gust{" +
                "Name='" + Name + '\'' +
                ", NIC='" + NIC + '\'' +
                ", TNumber='" + TNumber + '\'' +
                ", Address='" + Address + '\'' +
                ", MealPlane='" + MealPlane + '\'' +
                ", RoomId='" + RoomId + '\'' +
                ", RoomType='" + RoomType + '\'' +
                ", CheckIn='" + CheckIn + '\'' +
                ", CheckOut='" + CheckOut + '\'' +
                '}';
    }
}

