package sample.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Contract implements Serializable {

    @JsonProperty("Id")
    private int id;

    @JsonProperty("Signing date")
    private String signingDate;

    @JsonProperty("Contract id")
    private int contractId;

    @JsonProperty("Update date")
    private String updateDate;

    public Contract() {
    }

    public Contract(int id, String signingDate, int contractId, String updateDate) {
        this.id = id;
        this.signingDate = signingDate;
        this.contractId = contractId;
        this.updateDate = updateDate;
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
