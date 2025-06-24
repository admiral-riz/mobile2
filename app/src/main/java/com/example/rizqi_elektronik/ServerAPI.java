
package com.example.rizqi_elektronik;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServerAPI {
//    public static String BASE_URL_Image="http://10.0.2.2/uts-uasmobile2/img/";
//    public static String BASE_URL="http://10.0.2.2/uts-uasmobile2/";

    public static String BASE_URL="https://rizky.umrmaulana.my.id/api/";
    public static String BASE_URL_Image="https://rizky.umrmaulana.my.id/api/img/";

    private static Retrofit retrofit;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
