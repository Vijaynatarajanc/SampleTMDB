package vijay.natarajan.sampletmdb.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import vijay.natarajan.sampletmdb.model.api.repository.Movie
import vijay.natarajan.sampletmdb.model.api.repository.MovieRepository

class MovieViewModel : ViewModel() {

    private val repository = MovieRepository()

    private val _movie = MutableLiveData<Movie>()
    val movie: LiveData<Movie> = _movie

    fun fetchMovieDetails(movieId: Int) {
        viewModelScope.launch {
            try {
                val movieDetails = repository.getMovieDetails(movieId)
                _movie.value = movieDetails
            } catch (e: Exception) {
                Log.d("MovieViewModel", "fetch movie details exception: ${e.message}")
            }
        }
    }
}

