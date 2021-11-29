package sample.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Contract {

    @JsonProperty("id")
    private int id;

    @JsonProperty("signingDate")
    private String signingDate;

    @JsonProperty("contractId")
    private int contractId;

    @JsonProperty("updateDate")
    private String updateDate;

    private boolean checkbox;

    public Contract() {
    }

    public Contract(int id, String signingDate, int contractId, String updateDate) {
        this.id = id;
        this.signingDate = signingDate;
        this.contractId = contractId;
        this.updateDate = updateDate;
        this.checkbox = returnCheckBox();
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

    private boolean returnCheckBox() {
        LocalDate updateLocalDate = LocalDate.parse(this.updateDate);
        long resultDays = ChronoUnit.DAYS.between(updateLocalDate, LocalDate.now());
        return resultDays <= 60;
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
