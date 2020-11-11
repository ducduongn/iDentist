package uet.springframework.identist.model;


import javax.persistence.*;

@Table
@Entity(name = "visit")
public class Visit extends ClinicEntity {
    private static final String CURRENT_STATUS = "current";
    private static final String COMPLETED_STATUS = "completed";

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roomId")
    private Room room;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dentistId")
    private Dentist dentist;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCurrentStatus() {
        this.status = CURRENT_STATUS;
    }

    public void setCompletedStatus() {
        this.status = COMPLETED_STATUS;
    }
}
