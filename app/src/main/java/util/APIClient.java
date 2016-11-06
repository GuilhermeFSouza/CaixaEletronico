package util;

import java.util.List;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;
public class APIClient {
    private static RestAdapter REST_ADAPTER;
    private static void createAdapterIfNeeded() {
        if (REST_ADAPTER == null) {
            REST_ADAPTER = new RestAdapter.Builder()
                    .setEndpoint(
                            "http://192.168.1.107:8080/ArqDeSisExercicios/")
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .setClient(new OkClient())
                    .build();
        }
    }
    public APIClient() {
        createAdapterIfNeeded();
    }
    public RestServices getRestService() {
        return REST_ADAPTER.create(RestServices.class);
    }
    public interface RestServices {
        @POST("/extrato")
        void getAllPoetas(Callback<List<Cliente>> callbackCliente);
        @GET("/poeta/{nome}")
        void getAllPoetaLikeName(@Path("nome") String nome,
                                 Callback<List<Cliente>> callbackCliente);
    }
}
