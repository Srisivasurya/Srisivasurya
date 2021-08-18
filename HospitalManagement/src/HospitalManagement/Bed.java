package HospitalManagement;

public class Bed {
    Long bedId;
    String bedType;
    String roomName;

    public Long getBedId() {
        return bedId;
    }

    public void setBedId(Long bedId) {
        this.bedId = bedId;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }



    public String toString() {
        return "Bed{" + "bedId=" + bedId + ", bedType='" + bedType + '\'' + ", roomName='" + roomName + '\'' + '}';
    }
}
