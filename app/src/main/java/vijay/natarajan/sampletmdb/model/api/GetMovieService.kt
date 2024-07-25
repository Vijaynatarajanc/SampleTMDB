package vijay.natarajan.sampletmdb.model.api

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import vijay.natarajan.sampletmdb.model.api.repository.Movie

interface MovieService {
    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = "d0d719693ce193e4a7a3b6155f727061"
    ): Movie
}

