package ikhwan.binar.binarchallengedelapan.view.navigationcompose

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ikhwan.binar.binarchallengedelapan.view.screen.NowPlaying
import ikhwan.binar.binarchallengedelapan.view.screen.PopularScreen
import ikhwan.binar.binarchallengedelapan.model.popularmovie.Result
import ikhwan.binar.binarchallengedelapan.viewmodel.ViewModelUser

@ExperimentalFoundationApi
@Composable
fun BottomNavGraph(
    navController: NavHostController,
    listMovie : List<Result>,
    listNowPlaying : List<Result>,
    name: String,
    viewModelUser : ViewModelUser
) {

    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Popular.route
    ) {
        composable(route = BottomBarScreen.Popular.route) {
            PopularScreen(listMovie = listMovie, name, viewModelUser)
        }
        composable(route = BottomBarScreen.NowPlaying.route) {
            NowPlaying(listMovie = listNowPlaying, name, viewModelUser)
        }
    }
}