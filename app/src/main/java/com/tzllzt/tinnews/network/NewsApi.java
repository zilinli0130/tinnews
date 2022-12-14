//**********************************************************************************************************************
// * Documentation
// * Author: zilin.li
// * Date: 12/22
// * Definition: Implementation of NewsApi interface.
// * Node: interface used by Retrofit service client builder for implementation to fetch news data
//**********************************************************************************************************************
package com.tzllzt.tinnews.network;

//**********************************************************************************************************************
// * Includes
//**********************************************************************************************************************

// Project includes
import com.tzllzt.tinnews.model.NewsResponse;

// Network includes
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

//**********************************************************************************************************************
// * Interface definition
//**********************************************************************************************************************
public interface NewsApi {

    // (Call<T> is from retrofit) -> async call task by other thread
    @GET("top-headlines")
    Call<NewsResponse> getTopHeadlines(@Query("country") String country);

    @GET("everything")
    Call<NewsResponse> getEverything(
            @Query("q") String query, @Query("pageSize") int pageSize);

}
