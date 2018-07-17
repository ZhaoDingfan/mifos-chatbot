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
import org.mifos.chatbot.client.model.DeleteTellersTellerIdCashiersCashierIdResponse;
import org.mifos.chatbot.client.model.GetTellersResponse;
import org.mifos.chatbot.client.model.GetTellersTellerIdCashiersCashierIdResponse;
import org.mifos.chatbot.client.model.GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse;
import org.mifos.chatbot.client.model.GetTellersTellerIdCashiersCashiersIdTransactionsResponse;
import org.mifos.chatbot.client.model.GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse;
import org.mifos.chatbot.client.model.GetTellersTellerIdCashiersResponse;
import org.mifos.chatbot.client.model.GetTellersTellerIdCashiersTemplateResponse;
import org.mifos.chatbot.client.model.PostTellersRequest;
import org.mifos.chatbot.client.model.PostTellersResponse;
import org.mifos.chatbot.client.model.PostTellersTellerIdCashiersCashierIdAllocateRequest;
import org.mifos.chatbot.client.model.PostTellersTellerIdCashiersCashierIdAllocateResponse;
import org.mifos.chatbot.client.model.PostTellersTellerIdCashiersCashierIdSettleRequest;
import org.mifos.chatbot.client.model.PostTellersTellerIdCashiersCashierIdSettleResponse;
import org.mifos.chatbot.client.model.PostTellersTellerIdCashiersRequest;
import org.mifos.chatbot.client.model.PostTellersTellerIdCashiersResponse;
import org.mifos.chatbot.client.model.PutTellersRequest;
import org.mifos.chatbot.client.model.PutTellersResponse;
import org.mifos.chatbot.client.model.PutTellersTellerIdCashiersCashierIdRequest;
import org.mifos.chatbot.client.model.PutTellersTellerIdCashiersCashierIdResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TellerCashManagementApi
 */
@Ignore
public class TellerCashManagementApiTest {

    private final TellerCashManagementApi api = new TellerCashManagementApi();

    
    /**
     * Allocate Cash To Cashier
     *
     * Mandatory Fields:  Date, Amount, Currency, Notes/Comments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allocateCashToCashierTest() throws ApiException {
        Long tellerId = null;
        Long cashierId = null;
        PostTellersTellerIdCashiersCashierIdAllocateRequest body = null;
        PostTellersTellerIdCashiersCashierIdAllocateResponse response = api.allocateCashToCashier(tellerId, cashierId, body);

        // TODO: test validations
    }
    
    /**
     * Create Cashiers
     *
     * Mandatory Fields:  Cashier/staff, Fromm Date, To Date, Full Day or From time and To time    Optional Fields:  Description/Notes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCashierTest() throws ApiException {
        Long tellerId = null;
        PostTellersTellerIdCashiersRequest body = null;
        PostTellersTellerIdCashiersResponse response = api.createCashier(tellerId, body);

        // TODO: test validations
    }
    
    /**
     * Create teller
     *
     * Mandatory Fields Teller name, OfficeId, Description, Start Date, Status Optional Fields End Date
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTellerTest() throws ApiException {
        PostTellersRequest body = null;
        PostTellersResponse response = api.createTeller(body);

        // TODO: test validations
    }
    
    /**
     * Delete Cashier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCashierTest() throws ApiException {
        Long tellerId = null;
        Long cashierId = null;
        DeleteTellersTellerIdCashiersCashierIdResponse response = api.deleteCashier(tellerId, cashierId);

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
    public void deleteTellerTest() throws ApiException {
        Long tellerId = null;
        String response = api.deleteTeller(tellerId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a cashier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findCashierDataTest() throws ApiException {
        Long tellerId = null;
        Long cashierId = null;
        GetTellersTellerIdCashiersCashierIdResponse response = api.findCashierData(tellerId, cashierId);

        // TODO: test validations
    }
    
    /**
     * Retrieve tellers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findTellerTest() throws ApiException {
        Long tellerId = null;
        GetTellersResponse response = api.findTeller(tellerId);

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
    public void findTransactionDataTest() throws ApiException {
        Long tellerId = null;
        Long transactionId = null;
        String response = api.findTransactionData(tellerId, transactionId);

        // TODO: test validations
    }
    
    /**
     * List Cashiers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCashierDataTest() throws ApiException {
        Long tellerId = null;
        String fromdate = null;
        String todate = null;
        GetTellersTellerIdCashiersResponse response = api.getCashierData(tellerId, fromdate, todate);

        // TODO: test validations
    }
    
    /**
     * Find Cashiers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCashierTemplateTest() throws ApiException {
        Long tellerId = null;
        GetTellersTellerIdCashiersTemplateResponse response = api.getCashierTemplate(tellerId);

        // TODO: test validations
    }
    
    /**
     * Retrieve Cashier Transaction Template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCashierTxnTemplateTest() throws ApiException {
        Long tellerId = null;
        Long cashierId = null;
        GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse response = api.getCashierTxnTemplate(tellerId, cashierId);

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
    public void getJournalDataTest() throws ApiException {
        Long tellerId = null;
        Long cashierId = null;
        String dateRange = null;
        String response = api.getJournalData(tellerId, cashierId, dateRange);

        // TODO: test validations
    }
    
    /**
     * List all tellers
     *
     * Retrieves list tellers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTellerDataTest() throws ApiException {
        Long officeId = null;
        List<GetTellersResponse> response = api.getTellerData(officeId);

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
    public void getTransactionDataTest() throws ApiException {
        Long tellerId = null;
        String dateRange = null;
        String response = api.getTransactionData(tellerId, dateRange);

        // TODO: test validations
    }
    
    /**
     * Retrieve Cashier Transaction
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionsForCashierTest() throws ApiException {
        Long tellerId = null;
        Long cashierId = null;
        String currencyCode = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        List<GetTellersTellerIdCashiersCashiersIdTransactionsResponse> response = api.getTransactionsForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Transactions Wtih Summary For Cashier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionsWtihSummaryForCashierTest() throws ApiException {
        Long tellerId = null;
        Long cashierId = null;
        String currencyCode = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse response = api.getTransactionsWtihSummaryForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Settle Cash From Cashier
     *
     * Mandatory Fields Date, Amount, Currency, Notes/Comments
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void settleCashFromCashierTest() throws ApiException {
        Long tellerId = null;
        Long cashierId = null;
        PostTellersTellerIdCashiersCashierIdSettleRequest body = null;
        PostTellersTellerIdCashiersCashierIdSettleResponse response = api.settleCashFromCashier(tellerId, cashierId, body);

        // TODO: test validations
    }
    
    /**
     * Update Cashier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCashierTest() throws ApiException {
        Long tellerId = null;
        Long cashierId = null;
        PutTellersTellerIdCashiersCashierIdRequest body = null;
        PutTellersTellerIdCashiersCashierIdResponse response = api.updateCashier(tellerId, cashierId, body);

        // TODO: test validations
    }
    
    /**
     * Update teller
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTellerTest() throws ApiException {
        Long tellerId = null;
        PutTellersRequest body = null;
        PutTellersResponse response = api.updateTeller(tellerId, body);

        // TODO: test validations
    }
    
}