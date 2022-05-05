package myapp.uitest.espreso

import com.myapp.uitest.espreso.ui.movie.StarActorsFragmentTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MovieDetailFragmentTest::class,
    DirectorsFragmentTest::class,
    StarActorsFragmentTest::class
)
class MovieFragmentTestSuite