package spring.demo.dto;


public class GamesDTO {

    private int disputeId;
    private String dispute;
    private String championship;
    private int result;

    public GamesDTO() {}

    public GamesDTO(int disputeId, String dispute, String championship, int result) {

        this.disputeId = disputeId;
        this.dispute = dispute;
        this.championship = championship;
        this.result = result;
    }


}
