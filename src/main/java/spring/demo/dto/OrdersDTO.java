package spring.demo.dto;

public class OrdersDTO {

    private int orderId;
    private String article;
    private int price;
    private String status;

    public OrdersDTO() {}

    public OrdersDTO (int orderId, String article, int price, String status) {

        this.orderId = orderId;
        this.article = article;
        this.price = price;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

    public static class Builder {


        private int nest_orderId;
        private String nestArticle;
        private int nestPrice;
        private String nestStatus;


        public Builder orderId(int orderId) {
            this.nest_orderId = orderId;
            return this;
        }

        public Builder article(String article) {
            this.nestArticle = article;
            return this;
        }

        public Builder price (int price) {
            this.nestPrice = price;
            return this;
        }

        public Builder status(String status) {
            this.nestStatus = status;
            return this;
        }

        public OrdersDTO create() { return new OrdersDTO(nest_orderId, nestArticle, nestPrice, nestStatus); }
    }
}
