package com.example.tryagain2;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("https://petstore.swagger.io/v2/pet")
    List<Service> getPet();
}
