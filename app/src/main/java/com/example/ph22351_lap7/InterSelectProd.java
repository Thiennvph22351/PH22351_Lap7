package com.example.ph22351_lap7;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InterSelectProd {
    @GET("get_all_product.php")
    Call<SvrResponseProd> getProd();
}
