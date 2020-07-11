/*
 * RSA SecurID Authentication API
 * This defines the RSA SecurID Authentication API. This supports a REST interface to perform multi-factor, multi-step authentications. The caller must invoke the Initialize interface to start an authentication attempt and call the Verify method until the ResponseCode is either SUCCESS, ERROR, or FAIL. Each server response contains CredentialMethods, one of which must be provided in the subjectCredentials of the next Verify call. The server verifies the entered credentials and responds with CHALLENGE or IN_PROCESS if additional information (or confirmations) are required to complete the authentication. The IN_PROCESS status is returned for authentication steps that may take a lot of time. The caller should invoke the Verify call again using the same referenceID to 'poll' on the result of a previous IN_PROCESS authentication. Alternatively, Verify responds with SUCCESS if all required authentication credentials have been provided, FAIL if the verification of a credential failed, or ERROR for malformed requests.
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rsa.securid.client.api;

import com.rsa.securid.client.ApiCallback;
import com.rsa.securid.client.ApiClient;
import com.rsa.securid.client.ApiException;
import com.rsa.securid.client.ApiResponse;
import com.rsa.securid.client.Configuration;
import com.rsa.securid.client.Pair;
import com.rsa.securid.client.ProgressRequestBody;
import com.rsa.securid.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.rsa.securid.client.model.NameValuePair;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class I18nApi {
    private ApiClient apiClient;

    public I18nApi() {
        this(Configuration.getDefaultApiClient());
    }

    public I18nApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getResourceId
     * @param lang Locale of language to be used for prompt text. ISO 639-1 language code followed by an ISO 3166 country code separated by an underscore. For example, \&quot;en_US\&quot;. See https://www.ietf.org/rfc/rfc3066.txt (required)
     * @param resourceId A specific promptResourceId to be obtained by the client. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getResourceIdCall(String lang, String resourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/authn/resources";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (lang != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("lang", lang));
        if (resourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("resourceId", resourceId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "client-key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getResourceIdValidateBeforeCall(String lang, String resourceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new ApiException("Missing the required parameter 'lang' when calling getResourceId(Async)");
        }
        

        com.squareup.okhttp.Call call = getResourceIdCall(lang, resourceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Provides I18N language resources.
     * The client can use this interface to GET prompt text values for all prompts or for a specific prompt.
     * @param lang Locale of language to be used for prompt text. ISO 639-1 language code followed by an ISO 3166 country code separated by an underscore. For example, \&quot;en_US\&quot;. See https://www.ietf.org/rfc/rfc3066.txt (required)
     * @param resourceId A specific promptResourceId to be obtained by the client. (optional)
     * @return List&lt;NameValuePair&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<NameValuePair> getResourceId(String lang, String resourceId) throws ApiException {
        ApiResponse<List<NameValuePair>> resp = getResourceIdWithHttpInfo(lang, resourceId);
        return resp.getData();
    }

    /**
     * Provides I18N language resources.
     * The client can use this interface to GET prompt text values for all prompts or for a specific prompt.
     * @param lang Locale of language to be used for prompt text. ISO 639-1 language code followed by an ISO 3166 country code separated by an underscore. For example, \&quot;en_US\&quot;. See https://www.ietf.org/rfc/rfc3066.txt (required)
     * @param resourceId A specific promptResourceId to be obtained by the client. (optional)
     * @return ApiResponse&lt;List&lt;NameValuePair&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<NameValuePair>> getResourceIdWithHttpInfo(String lang, String resourceId) throws ApiException {
        com.squareup.okhttp.Call call = getResourceIdValidateBeforeCall(lang, resourceId, null, null);
        Type localVarReturnType = new TypeToken<List<NameValuePair>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Provides I18N language resources. (asynchronously)
     * The client can use this interface to GET prompt text values for all prompts or for a specific prompt.
     * @param lang Locale of language to be used for prompt text. ISO 639-1 language code followed by an ISO 3166 country code separated by an underscore. For example, \&quot;en_US\&quot;. See https://www.ietf.org/rfc/rfc3066.txt (required)
     * @param resourceId A specific promptResourceId to be obtained by the client. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getResourceIdAsync(String lang, String resourceId, final ApiCallback<List<NameValuePair>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getResourceIdValidateBeforeCall(lang, resourceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<NameValuePair>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
