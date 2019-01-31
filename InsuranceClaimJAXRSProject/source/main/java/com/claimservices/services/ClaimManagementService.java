package com.claimservices.services;


import com.claimservices.ClaimEvent;
import com.claimservices.Insured;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by kingshuk on 11/29/17.
 */
@Consumes({"application/xml","application/json"})
//@Produces({"application/xml","application/json"})
@Produces("application/json")
public interface ClaimManagementService {

    @GET
    @Path("/claimInfo/{claimEventId}/")
    ClaimEvent getClaimInformation(@PathVariable("claimEventId") Integer claimId);

    @PUT
    @Path("/addInsured/")
    Response updateInsuredInformation(Insured insured);

    //ClaimPayment getClaimPaymentInformation(Integer claimId);

    @POST
    @Path("/fileAClaim/")
    Response fileAClaimInformation(Insured insured);
}
