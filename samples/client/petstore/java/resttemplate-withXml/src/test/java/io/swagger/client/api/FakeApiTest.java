/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.Client;
import io.swagger.client.model.FakeBody;
import io.swagger.client.model.FakeJsonFormDataBody;
import io.swagger.client.model.OuterComposite;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


/**
 * API tests for FakeApi
 */
@Ignore
public class FakeApiTest {

    private final FakeApi api = new FakeApi();

    
    /**
     * 
     *
     * Test serialization of outer boolean types
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterBooleanSerializeTest() {
        
        Boolean body = null;
        
        Boolean response = api.fakeOuterBooleanSerialize(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Test serialization of object with outer number type
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterCompositeSerializeTest() {
        
        OuterComposite outercomposite = null;
        
        OuterComposite response = api.fakeOuterCompositeSerialize(outercomposite);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Test serialization of outer number types
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterNumberSerializeTest() {
        
        BigDecimal body = null;
        
        BigDecimal response = api.fakeOuterNumberSerialize(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Test serialization of outer string types
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterStringSerializeTest() {
        
        String body = null;
        
        String response = api.fakeOuterStringSerialize(body);

        // TODO: test validations
    }
    
    /**
     * To test \&quot;client\&quot; model
     *
     * To test \&quot;client\&quot; model
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testClientModelTest() {
        
        Client client = null;
        
        Client response = api.testClientModel(client);

        // TODO: test validations
    }
    
    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testEndpointParametersTest() {
        
        FakeBody body = null;
        
        api.testEndpointParameters(body);

        // TODO: test validations
    }
    
    /**
     * To test enum parameters
     *
     * To test enum parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testEnumParametersTest() {
        List<String> enumHeaderStringArray = null;
        
        String enumHeaderString = null;
        
        List<String> enumQueryStringArray = null;
        
        String enumQueryString = null;
        
        Integer enumQueryInteger = null;
        
        api.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger);

        // TODO: test validations
    }
    
    /**
     * test inline additionalProperties
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testInlineAdditionalPropertiesTest() {
        
        Map<String, String> body = null;
        
        api.testInlineAdditionalProperties(body);

        // TODO: test validations
    }
    
    /**
     * test json serialization of form data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testJsonFormDataTest() {
        
        FakeJsonFormDataBody body = null;
        
        api.testJsonFormData(body);

        // TODO: test validations
    }
    
}
