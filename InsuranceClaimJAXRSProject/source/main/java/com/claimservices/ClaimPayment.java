package com.claimservices;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kingshuk on 11/29/17.
 */
@XmlRootElement(name = "ClaimPayment")
public class ClaimPayment {
    private Integer claimId;

    private Double claimPayment;

    public Integer getClaimId() {
        return claimId;
    }

    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

    public Double getClaimPayment() {
        return claimPayment;
    }

    public void setClaimPayment(Double claimPayment) {
        this.claimPayment = claimPayment;
    }
}
