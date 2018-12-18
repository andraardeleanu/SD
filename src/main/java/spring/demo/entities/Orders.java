package spring.demo.entities;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "orders")
public class Orders {


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "article", length = 200)
    private String article;

    @Column(name = "price", length = 200)
    private int price;

    @Column(name = "status", length = 200)
    private String status;

    public Orders() {

    }

    public Orders(int id, String article, int price, String status) {

        this.id = id;
        this.article = article;
        this.price = price;
        this.status  = status;
    }
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
