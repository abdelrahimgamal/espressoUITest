package myapp.uitest.espreso.data.source

import com.myapp.uitest.espreso.data.Movie

interface MoviesDataSource {

    fun getMovie(movieId: Int): Movie?
}