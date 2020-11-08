package uet.springframework.identist.model;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

@MappedSuperclass
public class User extends Person{
    @Column(name = "email")
    @NotEmpty
    private String email;

    @Column(name = "password")
    @NotEmpty
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
