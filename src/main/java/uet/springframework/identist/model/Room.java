package uet.springframework.identist.model;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Room extends BaseEntity{
    @Column(name = "roomNumber")
    @NotEmpty
    private int roomNumber;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
