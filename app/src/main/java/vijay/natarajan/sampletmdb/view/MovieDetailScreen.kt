package vijay.natarajan.sampletmdb.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import vijay.natarajan.sampletmdb.model.api.repository.Movie
import vijay.natarajan.sampletmdb.model.api.repository.ProductionCompany
import vijay.natarajan.sampletmdb.viewmodel.MovieViewModel

//@Composable
//fun MovieDetailScreen(viewModel: MovieViewModel, movieId: Int) {
//    val movie by viewModel.movie.observeAsState()
//
//    LaunchedEffect(movieId) {
//        viewModel.fetchMovieDetails(movieId)
//    }
//
//    movie?.let { movieDetails ->
//        LazyColumn(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp)
//        ) {
//            item {
//                Image(
//                    painter = rememberImagePainter("https://image.tmdb.org/t/p/w500${movieDetails.poster_path}"),
//                    contentDescription = null,
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(200.dp)
//                )
//                Box(
//                    modifier = Modifier.fillMaxWidth(),
//                    contentAlignment = Alignment.Center
//                ) {
//                    Text(
//                        text = movieDetails.title,
//                        modifier = Modifier
//                            .padding(top = 10.dp),
//                        fontSize = 22.sp
//                    )
//                }
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(text = movieDetails.tagline ?: "")
//                Text(text = "Release Date: ${movieDetails.release_date}")
//                Text(text = "Runtime: ${movieDetails.runtime} minutes")
//                Text(text = "Budget: $${movieDetails.budget}")
//                Text(text = "Revenue: $${movieDetails.revenue}")
//                Text(text = "Status: ${movieDetails.status}")
//
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(text = "Genres:")
//                movieDetails.genres.forEach { genre ->
//                    Text(text = genre.name)
//                }
//
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(
//                    text = "Overview:",
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 22.sp,
//                    color = Color.Red,
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier.padding(top = 8.dp, bottom = 10.dp)
//                )
//                Text(text = movieDetails.overview)
//
//                Spacer(modifier = Modifier.height(8.dp))
//
//
//                Text(
//                    text = "Production Companies:",
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 22.sp,
//                    color = Color.Red,
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier.padding(top = 8.dp,bottom = 10.dp)
//                )
//            }
//
//            item {
//                LazyRow(
//                    modifier = Modifier.padding(vertical = 4.dp)
//                ) {
//                    items(movieDetails.production_companies) { company ->
//                        Card(
//                            modifier = Modifier
//                                .width(200.dp)
//                                .height(140.dp)
//                                .padding(horizontal = 4.dp),
//                            shape = MaterialTheme.shapes.medium,
//
//                        ) {
//                            Column(
//                                modifier = Modifier
//                                    .padding(8.dp)
//                                    .background(Color.Red)
//                                    .fillMaxSize(),
//                                verticalArrangement = Arrangement.Center,
//                                horizontalAlignment = Alignment.CenterHorizontally                            ) {
//                                company.logo_path?.let { logoPath ->
//                                    Image(
//                                        painter = rememberImagePainter("https://image.tmdb.org/t/p/w500$logoPath"),
//                                        contentDescription = company.name,
//                                        modifier = Modifier
//                                            .fillMaxWidth()
//                                            .height(50.dp),
//                                        contentScale = ContentScale.Fit
//                                    )
//                                }
//                                Spacer(modifier = Modifier.height(4.dp))
//                                Text(
//                                    text = company.name,
//                                    fontWeight = FontWeight.Bold,
//                                    fontSize = 16.sp,
//                                    color = Color.Black,
//                                    textAlign = TextAlign.Center,
//                                    modifier = Modifier.padding(top = 8.dp)
//                                )
//                                Spacer(modifier = Modifier.height(4.dp))
//                                Text(
//                                    text = company.origin_country,
//                                    fontWeight = FontWeight.Bold,
//                                    fontSize = 16.sp,
//                                    color = Color.Black,
//                                    textAlign = TextAlign.Center,
//                                    modifier = Modifier.padding(top = 8.dp)
//                                )
//                            }
//                        }
//                    }
//                }
//
//                Spacer(modifier = Modifier.height(8.dp))
//            }
//
//            item {
//                movieDetails.homepage?.let { url ->
//                    Text(text = "Homepage: $url", color = Color.Blue)
//                }
//
//                Divider()
//            }
//        }
//    } ?: run {
//        Text(text = "Loading...")
//    }
//}

@Composable
fun MovieDetailScreen(viewModel: MovieViewModel, movieId: Int) {
    val movie by viewModel.movie.observeAsState()

    LaunchedEffect(movieId) {
        viewModel.fetchMovieDetails(movieId)
    }

    movie?.let { movieDetails ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            item {
                MoviePoster(imageUrl = "https://image.tmdb.org/t/p/w500${movieDetails.poster_path}")
                CenteredText(text = movieDetails.title, fontSize = 22.sp, paddingTop = 10.dp)
                Spacer(modifier = Modifier.height(8.dp))

                Text(text = movieDetails.tagline ?: "")
                MovieInfo(movieDetails = movieDetails)

                Spacer(modifier = Modifier.height(8.dp))

                Text(text = "Genres:")
                movieDetails.genres.forEach { genre ->
                    Text(text = genre.name)
                }

                Spacer(modifier = Modifier.height(8.dp))

                SectionHeader(text = "Overview")
                Text(text = movieDetails.overview)

                Spacer(modifier = Modifier.height(8.dp))

                SectionHeader(text = "Production Companies")
            }

            item {
                ProductionCompaniesRow(productionCompanies = movieDetails.production_companies)
                Spacer(modifier = Modifier.height(8.dp))
            }

            item {
                movieDetails.homepage?.let { url ->
                    Text(text = "Homepage: $url", color = Color.Blue)
                }
                Divider()
            }
        }
    } ?: run {
        Text(text = "Loading...")
    }
}

@Composable
fun MoviePoster(imageUrl: String) {
    Image(
        painter = rememberImagePainter(imageUrl),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    )
}

@Composable
fun CenteredText(text: String, fontSize: TextUnit, paddingTop: Dp = 0.dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = paddingTop),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            fontSize = fontSize
        )
    }
}

@Composable
fun MovieInfo(movieDetails: Movie) {
    Text(text = "Release Date: ${movieDetails.release_date}")
    Text(text = "Runtime: ${movieDetails.runtime} minutes")
    Text(text = "Budget: $${movieDetails.budget}")
    Text(text = "Revenue: $${movieDetails.revenue}")
    Text(text = "Status: ${movieDetails.status}")
}

@Composable
fun SectionHeader(text: String) {
    Text(
        text = "$text:",
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        color = Color.Red,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(top = 8.dp, bottom = 10.dp)
    )
}

@Composable
fun ProductionCompaniesRow(productionCompanies: List<ProductionCompany>) {
    LazyRow(
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        items(productionCompanies) { company ->
            ProductionCompanyCard(company = company)
        }
    }
}

@Composable
fun ProductionCompanyCard(company: ProductionCompany) {
    Card(
        modifier = Modifier
            .width(200.dp)
            .height(140.dp)
            .padding(horizontal = 4.dp),
        shape = MaterialTheme.shapes.medium,
        colors = CardDefaults.cardColors(
            containerColor = Color.Red,
        )
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            company.logo_path?.let { logoPath ->
                Image(
                    painter = rememberImagePainter("https://image.tmdb.org/t/p/w500$logoPath"),
                    contentDescription = company.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    contentScale = ContentScale.Fit
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = company.name,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 8.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = company.origin_country,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

