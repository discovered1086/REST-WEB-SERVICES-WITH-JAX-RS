package com.claimservices.services;

import com.claimservices.ClaimEvent;
import com.claimservices.Insured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kingshuk on 11/29/17.
 */
public class ClaimServiceHelperImpl implements ClaimServiceHelper{
    private static Map<Integer, ClaimEvent> claimEventMap = new HashMap<>();
    private static Map<Integer, Insured> insuredMap = new HashMap<>();

    private static ClaimServiceHelperImpl claimServiceHelperImpl = null;

    private static Integer insuredSequence = 1;

    private static Integer claimSequence = 1;

    static {
        Insured insured = new Insured(insuredSequence++, "Kingshuk",
                "Mukherjee", "sly.mania42@gmail.com", "683-85-3655");

        insuredMap.put(insured.getInsuredId(), insured);

        ClaimEvent claimEvent = new ClaimEvent();
        claimEvent.setClaimId(claimSequence++);
        claimEvent.setClaimFileDate("11/29/2017");
        claimEvent.setClaimInsured(insured);
        claimEvent.setClaimPayment(null);
        claimEvent.setClaimStatus("NEW");

        claimEventMap.put(claimEvent.getClaimId(), claimEvent);

        //insured.getClaimEvents().add(claimEvent);


    }

    private ClaimServiceHelperImpl() {

    }

    public static ClaimServiceHelperImpl getClaimServicesHelperInstance() {
        if (claimServiceHelperImpl == null) {
            claimServiceHelperImpl = new ClaimServiceHelperImpl();
        }

        return claimServiceHelperImpl;
    }

    public void addInsured(Insured insured) {
        insuredMap.put(insuredSequence++, insured);
    }

    public Insured getInsured(Integer insuredId) {
        return insuredMap.get(insuredId);
    }

    public ClaimEvent getClaimEvent(Integer claimId) {
        return claimEventMap.get(claimId);
    }

    public ClaimEvent createANewClaim(Insured insured) {
        ClaimEvent claimEvent = new ClaimEvent();
        claimEvent.setClaimId(claimSequence++);
        claimEvent.setClaimFileDate("11/29/2017");
        claimEvent.setClaimInsured(insured);
        claimEvent.setClaimPayment(null);
        claimEvent.setClaimStatus("NEW");

        claimEventMap.put(claimEvent.getClaimId(), claimEvent);

        return claimEvent;
    }

    public Map<Integer, ClaimEvent> getAllClaims() {
        return claimEventMap;
    }

    public boolean updateInsured(Insured insured) {
        Integer theId = -1;
        for (Insured insured1 : insuredMap.values()) {
            if (insured1.getSSN().equals(insured.getSSN())) {
                theId = insured1.getInsuredId();
            }
        }

        insuredMap.put(theId, insured);

        /*for(ClaimEvent event:insured.getClaimEvents()){
            event.setClaimInsured(insured);
        }*/

        return theId != -1;
    }


}
