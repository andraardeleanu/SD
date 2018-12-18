package spring.demo.entities;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="player")
public class Player {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false )
    private int id;

    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "age", length = 100)
    private int age;

    @Column(name = "club", length = 100)
    private String club;

    @Column( name = "shirtNo", length  =10)
    private int shirtNo;


    public Player() {}

    public Player(int id, String name, int age, String club, int shirtNo ) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.club = club;
        this.shirtNo = shirtNo;
    }


    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getClub() { return club; }

    public void setClub(String club) { this.club = club; }

    public int getShirtNo() { return shirtNo; }

    public void setShirtNo(int shirtNo) { this.shirtNo = shirtNo; }

    @Override
    public String toString() {
        return "Player {"+
                "playerId  = "+id +
                "playerName = "+name +
                "age = "+age +
                "club = "+club +
                "shirtNo = "+shirtNo +
                '}';

    }
}
