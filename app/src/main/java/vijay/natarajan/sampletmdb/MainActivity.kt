package vijay.natarajan.sampletmdb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import vijay.natarajan.sampletmdb.ui.theme.SampleTmdbTheme
import vijay.natarajan.sampletmdb.view.MovieDetailScreen
import vijay.natarajan.sampletmdb.viewmodel.MovieViewModel

//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            SampleTmdbTheme {
////                MovieListScreen()
//                MovieDetailScreen(viewModel = , movieId = )
//            }
//        }
//    }
//}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleTmdbTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    // Create an instance of the ViewModel
                    val movieViewModel: MovieViewModel = viewModel()

                    // Pass the ViewModel and a specific movieId to the MovieDetailScreen
                    MovieDetailScreen(
                        viewModel = movieViewModel,
                        movieId = 550 // Example movieId; replace with the desired ID
                    )
                }
            }
        }
    }
}

