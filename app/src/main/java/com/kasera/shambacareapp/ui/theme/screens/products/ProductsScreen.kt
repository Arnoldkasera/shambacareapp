package com.kasera.shambacareapp.ui.theme.screens.products
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kasera.shambacareapp.R
import com.kasera.shambacareapp.navigation.ROUTE_LAWNMOWER
import com.kasera.shambacareapp.navigation.ROUTE_PLOUGH
import com.kasera.shambacareapp.navigation.ROUTE_SPRINKLER
import com.kasera.shambacareapp.navigation.ROUTE_TRACTOR

@Composable
fun Products(navController: NavHostController) {

    val context= LocalContext.current

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp)
        // .background(color = Color.Gray)
        //.background(color = Color.shape)
    ){
        Text(text = "Shambacare Products",
            color = Color.Gray,
            fontFamily = FontFamily.Monospace,
            fontSize = 30.sp,
        )

        Image(painter = painterResource(id = R.drawable.farmequi),
            contentDescription = "equipmentlogo")
        Text(text = "AVAILABLE SUPPLIES", fontFamily= FontFamily.Cursive)


        Button(onClick = {
            navController.navigate(ROUTE_LAWNMOWER)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "LAWNMOWER")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUTE_PLOUGH)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "PLOUGH")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUTE_SPRINKLER)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "SPRINKLER")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUTE_TRACTOR)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "TRACTOR")
        }




        Text(text = "WE APPRECIATE AND COME AGAIN", fontFamily= FontFamily.Cursive)
    }
}



@Preview(name = "Dark Mode")

@Preview( uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Light Mode")
@Composable
fun Productsprev() {
    Products(rememberNavController())
}