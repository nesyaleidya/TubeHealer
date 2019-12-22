package com.example.tubehealer.api;


import com.example.tubehealer.constans.Constans;
import com.example.tubehealer.service.ServiceInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit=null;
    private static RetrofitClient mInstance;

    public RetrofitClient() {
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constans.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }

    public static synchronized RetrofitClient getInstance(){
        if (mInstance==null){
            mInstance = new RetrofitClient();
        }
        return mInstance;
    }


    public ServiceInterface getService(){

        return retrofit.create(ServiceInterface.class);
    }
}
