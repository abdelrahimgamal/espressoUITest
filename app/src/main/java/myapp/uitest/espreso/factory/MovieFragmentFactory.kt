package com.myapp.uitest.espreso.factory


import androidx.fragment.app.FragmentFactory
import com.myapp.uitest.espreso.ui.movie.DirectorsFragment
import com.myapp.uitest.espreso.ui.movie.MovieDetailFragment
import com.myapp.uitest.espreso.ui.movie.StarActorsFragment

class MovieFragmentFactory : FragmentFactory(){

    private val TAG: String = "AppDebug"

    override fun instantiate(classLoader: ClassLoader, className: String) =

        when(className){

            MovieDetailFragment::class.java.name -> {
                MovieDetailFragment()
            }

            DirectorsFragment::class.java.name -> {
                DirectorsFragment()
            }

            StarActorsFragment::class.java.name -> {
                StarActorsFragment()
            }

            else -> {
                super.instantiate(classLoader, className)
            }
        }


}













