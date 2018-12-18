package spring.demo.entities;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "shirt")
public class Shirt {


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @Column(name = "playerName", length = 200)
    private String playerName;
    @Column(name = "price", length = 200)
    private int price;
    @Column(name = "size", length = 200)
    private String size;


    public Shirt() {

    }

    public Shirt(int id, String playerName, int price, String size) {

        this.id = id;
        this.playerName = playerName;
        this.price = price;
        this.size = size;

    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayerNamelayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public String getSize() { return size; }

    public void setSize(String size) { this.size = size; }

    @Override
    public String toString() {
        return "Shirt {" +
                "id=" + id +
                ", playerName='" + playerName +
                ", price=" + price +
                ", size='" + size +
                '}';
    }
}
