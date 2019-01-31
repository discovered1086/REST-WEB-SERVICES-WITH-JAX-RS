package com.claimservices;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kingshuk on 11/29/17.
 */
@XmlRootElement(name = "ClaimEvent")
public class ClaimEvent {

    private Integer claimId;

    private String claimFileDate;

    private Insured claimInsured;

    private ClaimPayment claimPayment;

    private String claimStatus;

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public Integer getClaimId() {
        return claimId;
    }

    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

    public String getClaimFileDate() {
        return claimFileDate;
    }

    public void setClaimFileDate(String claimFileDate) {
        this.claimFileDate = claimFileDate;
    }

    public Insured getClaimInsured() {
        return claimInsured;
    }

    public void setClaimInsured(Insured claimInsured) {
        this.claimInsured = claimInsured;
    }

    public ClaimPayment getClaimPayment() {
        return claimPayment;
    }

    public void setClaimPayment(ClaimPayment claimPayment) {
        this.claimPayment = claimPayment;
    }
}
