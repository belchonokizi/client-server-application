package sample.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contract{

    @JsonProperty("id")
    private int id;

    @JsonProperty("signingDate")
    private String signingDate;

    @JsonProperty("contractId")
    private int contractId;

    @JsonProperty("updateDate")
    private String updateDate;

//    @JsonIgnore
    private boolean checkbox;

    public Contract() {
    }

    public Contract(int id, String signingDate, int contractId, String updateDate) {
        this.id = id;
        this.signingDate = signingDate;
        this.contractId = contractId;
        this.updateDate = updateDate;
    }

    public Contract(int id, String signingDate, int contractId, String updateDate, Boolean checkbox) {
        this.id = id;
        this.signingDate = signingDate;
        this.contractId = contractId;
        this.updateDate = updateDate;
        this.checkbox = checkbox;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(String signingDate) {
        this.signingDate = signingDate;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", signingDate='" + signingDate + '\'' +
                ", contractId=" + contractId +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }
}
