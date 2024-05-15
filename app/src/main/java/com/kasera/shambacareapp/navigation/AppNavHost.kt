package com.kasera.shambacareapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kasera.shambacareapp.ui.theme.screens.home.home
import com.kasera.shambacareapp.ui.theme.screens.lawnmower.lawnmower
import com.kasera.shambacareapp.ui.theme.screens.login.Login
import com.kasera.shambacareapp.ui.theme.screens.ploughs.plough
import com.kasera.shambacareapp.ui.theme.screens.products.Products
import com.kasera.shambacareapp.ui.theme.screens.register.Register
import com.kasera.shambacareapp.ui.theme.screens.sprinkler.sprinkler
import com.kasera.shambacareapp.ui.theme.screens.tractor.tractor

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String= ROUTE_SPLASH) {

    NavHost(navController = navController, modifier=modifier,
        startDestination = startDestination ){


        composable(ROUTE_LOGIN){
            Login(navController)
        }
        composable(ROUTE_REGISTER){
            Register(navController)
        }
        composable(ROUTE_HOME){
            home(navController)
        }
        composable(ROUTE_PRODUCTS){
            Products(navController)
        }
        composable(ROUTE_LAWNMOWER){
            lawnmower(navController)
        }
        composable(ROUTE_PLOUGH){
            plough(navController)
        }
        composable(ROUTE_SPRINKLER){
            sprinkler(navController)
        }
        composable(ROUTE_TRACTOR){
            tractor(navController)
        }
    }
}