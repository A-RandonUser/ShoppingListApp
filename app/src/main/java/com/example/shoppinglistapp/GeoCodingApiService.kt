package com.example.shoppinglistapp

import retrofit2.http.GET
import retrofit2.http.Query

interface GeoCodingApiService {
    @GET("maps/api/geocode/json")
    suspend fun getAdressFromCoordinates(
        @Query("latlng") latlng :String,
        @Query("key")apiKey : String
    ):GeocodingResponse
}