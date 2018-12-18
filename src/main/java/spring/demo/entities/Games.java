package spring.demo.entities;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "games")
public class Games {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "dispute", length = 200)
    private String dispute;

    @Column(name = "championship", length = 200)
    private String championship;

    @Column(name = "result", length = 200)
    private int result;


    public Games() {
    }

    public Games(int id, String dispute, String championship, int result) {

        this.id = id;
        this.dispute = dispute;
        this.championship = championship;
        this.result = result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDispute() {
        return dispute;
    }

    public void setDispute(String dispute) {
        this.dispute = dispute;
    }

    public String getChampionsip() {
        return championship;
    }

    public void setChampionship(String championship) {
        this.championship = championship;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
