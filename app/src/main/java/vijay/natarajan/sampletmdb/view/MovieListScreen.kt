package vijay.natarajan.sampletmdb.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import androidx.lifecycle.viewmodel.compose.viewModel
import vijay.natarajan.sampletmdb.viewmodel.MovieViewModel

//@Composable
//fun MovieListScreen(viewModel: MovieViewModel = viewModel()) {
//    val movies by viewModel.movies.observeAsState(emptyList())
//
//    LaunchedEffect(Unit) {
//        viewModel.fetchPopularMovies(1)
//    }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        if (movies.isEmpty()) {
//            Text(text = "Loading...")
//        } else {
//            LazyColumn {
//                items(movies) { movie ->
//                    Column(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(8.dp)
//                    ) {
//                        Text(text = movie.title)
//                        Image(
//                            painter = rememberImagePainter("https://image.tmdb.org/t/p/w500${movie.poster_path}"),
//                            contentDescription = null,
//                            contentScale = ContentScale.Crop,
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .height(200.dp)
//                        )
//                        Text(text = movie.overview)
//                        Divider()
//                    }
//                }
//            }
//        }
//    }
//}
