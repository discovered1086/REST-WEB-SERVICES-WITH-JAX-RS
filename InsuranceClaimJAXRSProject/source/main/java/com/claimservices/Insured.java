package com.claimservices;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kingshuk on 11/29/17.
 */

@XmlRootElement(name = "ClaimInsured")
public class Insured {
    private Integer insuredId;

    private String firstName;

    private String lastName;

    private String emailAddress;

    private String SSN;

    public Insured() {
    }

    public Insured(Integer insuredId, String firstName, String lastName, String emailAddress, String SSN) {
        this.insuredId = insuredId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.SSN = SSN;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    /*private List<ClaimEvent> claimEvents=new ArrayList<>();

    public List<ClaimEvent> getClaimEvents() {
        return claimEvents;
    }*/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Integer getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(Integer insuredId) {
        this.insuredId = insuredId;
    }
}
