package com.claimservices.services;

import com.claimservices.ClaimEvent;
import com.claimservices.Insured;

import java.util.Map;

interface ClaimServiceHelper {

    void addInsured(Insured insured);

    Insured getInsured(Integer insuredId);

    ClaimEvent getClaimEvent(Integer claimId);

    ClaimEvent createANewClaim(Insured insured);

    Map<Integer, ClaimEvent> getAllClaims();

    boolean updateInsured(Insured insured);
}
