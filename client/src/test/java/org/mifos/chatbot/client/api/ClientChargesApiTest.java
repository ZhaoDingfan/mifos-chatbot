/**
 * Copyright 2018 Dingfan Zhao
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.chatbot.client.api;

import org.mifos.chatbot.client.ApiException;
import org.mifos.chatbot.client.model.ClientCharge;
import org.mifos.chatbot.client.model.ClientChargeData;
import org.mifos.chatbot.client.model.CommandProcessingResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientChargesApi
 */
@Ignore
public class ClientChargesApiTest {

    private final ClientChargesApi api = new ClientChargesApi();

    
    /**
     * Add Client Charge
     *
     *  This API associates a Client charge with an implicit Client account Mandatory Fields :  chargeId and dueDate   Optional Fields :  amount
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void applyClientChargeTest() throws ApiException {
        Long clientId = null;
        CommandProcessingResult response = api.applyClientCharge(clientId);

        // TODO: test validations
    }
    
    /**
     * Delete a Client Charge
     *
     * Deletes a Client Charge on which no transactions have taken place (either payments or waivers). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClientChargeTest() throws ApiException {
        Long clientId = null;
        Long chargeId = null;
        CommandProcessingResult response = api.deleteClientCharge(clientId, chargeId);

        // TODO: test validations
    }
    
    /**
     * Pay a Client Charge
     *
     * Mandatory Fields transactionDate and amount \&quot;Pay either a part of or the entire due amount for a charge.(command&#x3D;paycharge)  Waive a Client Charge   This API provides the facility of waiving off the remaining amount on a client charge (command&#x3D;waive) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void payOrWaiveClientChargeTest() throws ApiException {
        Long clientId = null;
        Long chargeId = null;
        String command = null;
        String body = null;
        String response = api.payOrWaiveClientCharge(clientId, chargeId, command, body);

        // TODO: test validations
    }
    
    /**
     * List Client Charges
     *
     * The list capability of client charges supports pagination.Example Requests: clients/1/charges  clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllClientChargesTest() throws ApiException {
        Long clientId = null;
        String chargeStatus = null;
        Boolean pendingPayment = null;
        Integer limit = null;
        Integer offset = null;
        ClientCharge response = api.retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Client Charge
     *
     * Example Requests: clients/1/charges/1   clients/1/charges/1?fields&#x3D;name,id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveClientChargeTest() throws ApiException {
        Long clientId = null;
        Long chargeId = null;
        ClientChargeData response = api.retrieveClientCharge(clientId, chargeId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveTemplateTest() throws ApiException {
        String response = api.retrieveTemplate();

        // TODO: test validations
    }
    
}
