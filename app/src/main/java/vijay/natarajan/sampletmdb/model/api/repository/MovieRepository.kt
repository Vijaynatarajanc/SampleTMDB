package vijay.natarajan.sampletmdb.model.api.repository

import vijay.natarajan.sampletmdb.model.api.RetrofitInstance

class MovieRepository {

    private val movieService = RetrofitInstance.movieService

    suspend fun getMovieDetails(movieId: Int): Movie {
        return movieService.getMovieDetails(movieId)
    }
}

