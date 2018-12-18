package spring.demo.dto;

public class ShirtDTO {

    private int id;
    private String playerName;
    private int price;
    private String size;

    public ShirtDTO() {}

    public ShirtDTO(int id, String playerName, int price, String size) {

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

    public static class Builder {

        private int nestid;
        private String nestPlayerName;
        private int nestPrice;
        private String nestSize;

        public Builder id(int id) {
            this.nestid = id;
            return this;
        }

        public Builder playerName(String playerName) {
            this.nestPlayerName = playerName;
            return this;
        }

        public Builder price(int price) {
            this.nestPrice = price;
            return this;
        }

        public Builder size(String size) {
            this.nestSize = size;
            return this;
        }

        public ShirtDTO create() { return new ShirtDTO(nestid, nestPlayerName, nestPrice, nestSize); }
    }
}
