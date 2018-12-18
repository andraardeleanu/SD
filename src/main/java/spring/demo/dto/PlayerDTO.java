package spring.demo.dto;


public class PlayerDTO {

    private int id_player;
    private int id_shirt;
    private String name;
    private int age;
    private String club;
    private int shirtNo;

    public PlayerDTO() {

    }

    public PlayerDTO(int id_player, int id_shirt, String name, int age, String club, int shirtNo) {

        this.id_player = id_player;
        this.id_shirt = id_shirt;
        this.name = name;
        this.age =  age;
        this.club = club;
        this.shirtNo = shirtNo;
    }


    public int getIdPlayer() { return id_player; }

    public void setIdPlayer(int id_player) { this.id_player = id_player; }

    public int getIdShirt() { return id_shirt; }

    public void setIdShirt(int id_shirt) { this.id_shirt = id_shirt; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getClub() { return club; }

    public void setClub(String club) { this.club = club; }

    public int getShirtNo() { return shirtNo; }

    public void setShirtNo(int shirtNo) { this.shirtNo = shirtNo; }


    public static class Builder {

        private int nestid_player;
        private int nestid_shirt;
        private String nestname;
        private int nestage;
        private String nestclub;
        private int nest_shirtNo;

        public Builder id_player(int id) {
            this.nestid_player = id;
            return this;
        }

        public Builder id_shirt(int id) {
            this.nestid_shirt = id;
            return this;
        }

        public Builder name(String name) {
            this.nestname = name;
            return this;
        }

        public Builder age(int age) {
            this.nestage = age;
            return this;
        }

        public Builder club(String club) {
            this.nestclub = club;
            return this;
        }

        public Builder shirtNo(int shirtNo) {
            this.nestid_shirt = shirtNo;
            return this;
        }

        public PlayerDTO create() { return new PlayerDTO(nestid_player, nestid_shirt, nestname, nestage, nestclub, nest_shirtNo); }
    }
}
