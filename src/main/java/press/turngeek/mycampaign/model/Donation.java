package press.turngeek.mycampaign.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Donation {

    @GeneratedValue
    @Id
    private Long     id;
    @ManyToOne
    private Campaign campaign;
    private Double   amount;
    private String   donorName;
    private Boolean  receiptRequested;
    private Status   status;
    @Embedded
    private Account  account;

    public enum Status {
        TRANSFERRED,
        IN_PROCESS;
    }

    public Donation() {
        this.account = new Account();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public Boolean getReceiptRequested() {
        return receiptRequested;
    }

    public void setReceiptRequested(Boolean receiptRequested) {
        this.receiptRequested = receiptRequested;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

}
