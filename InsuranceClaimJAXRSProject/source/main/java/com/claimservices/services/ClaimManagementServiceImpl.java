package com.claimservices.services;


import com.claimservices.ClaimEvent;
import com.claimservices.ClaimPayment;
import com.claimservices.Insured;

import javax.jws.WebService;
import javax.ws.rs.core.Response;

/**
 * Created by kingshuk on 11/29/17.
 */
@WebService
public class ClaimManagementServiceImpl implements ClaimManagementService {

    public ClaimEvent getClaimInformation(Integer claimId) {
        ClaimServiceHelper claimServiceHelper = ClaimServiceHelperImpl.getClaimServicesHelperInstance();
        return claimServiceHelper.getClaimEvent(claimId);
    }

    public Response updateInsuredInformation(Insured insured) {
        ClaimServiceHelper claimServiceHelper = ClaimServiceHelperImpl.getClaimServicesHelperInstance();
        Boolean updateDone = claimServiceHelper.updateInsured(insured);

        if (updateDone) {
            return Response.ok().build();
        } else {
            return Response.notModified().build();
        }
    }

    /*public ClaimPayment getClaimPaymentInformation(Integer claimId) {
        return null;
    }*/

    public Response fileAClaimInformation(Insured insured) {
        ClaimServiceHelper claimServiceHelper = ClaimServiceHelperImpl.getClaimServicesHelperInstance();
        claimServiceHelper.createANewClaim(insured);
        return Response.ok().build();
    }
}
