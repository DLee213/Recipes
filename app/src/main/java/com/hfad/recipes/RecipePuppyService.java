package com.hfad.recipes;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecipePuppyService {
    // we know the baseURL is http://recipepuppy.com
    // so the following generates:
    // http://recipepuppy.com/api?i=ingredients&q=recipeKeywords
    @GET("api")
    Call<RecipeResponse> searchByIngredient(@Query("i") String ingredients,
                                            @Query("q") String recipeKeywords);

}
