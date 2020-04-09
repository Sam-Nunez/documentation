import com.datadog.api.v1.client.api.AWSLogsIntegrationApi;

public class AWSLogsIntegrationApiExample {

    public static void main(String[] args) {
        AWSLogsIntegrationApi apiInstance = new AWSLogsIntegrationApi();
        try {
            array[AWSLogsListResponse] result = apiInstance.getAllAWSLogsIntegrations();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AWSLogsIntegrationApi#getAllAWSLogsIntegrations");
            e.printStackTrace();
        }
    }
}