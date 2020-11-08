package uet.springframework.identist.model;

import javax.persistence.*;

@Table
@Entity(name = "schedule")
public class Schedule extends ClinicEntity {
    private static final String FREE_STATUS = "free";
    private static final String OCCUPIED_STATUS = "occupied";

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roomId")
    private Room room;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dentistId")
    private Dentist dentist;

    public void setFreeStatus(){
        this.status = FREE_STATUS;
    }

    public void setOccupiedStatus() {
        this.status = OCCUPIED_STATUS;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }
}
