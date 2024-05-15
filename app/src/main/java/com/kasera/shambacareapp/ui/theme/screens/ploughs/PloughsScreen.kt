package com.kasera.shambacareapp.ui.theme.screens.ploughs

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kasera.shambacareapp.R

@Composable
fun plough(navController: NavHostController) {
    val items = listOf("Ploughs ")

    LazyColumn {
        items(items) { item ->
            // Customize the appearance of each item
            Text(text = item)



            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(25.dp)

            )
            {
                Text(
                    text = "SHAMBACARE",
                    color = Color.Gray,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 30.sp,
                )
                Text(
                    text = "PLOUGHS",
                    color = Color.Gray,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 30.sp,
                )


                Image(
                    painter = painterResource(id = R.drawable.ploughfieldking),
                    contentDescription = "Field King Plough",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )


                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0797630636")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hi", "I would like to buy a Fieldking Plough")

                        //  context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "BUY ",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }
                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0797630636")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hi", "I would like to rent a FieldKing Plough")

                        //   context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "RENT",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }
                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0797630636")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hi", "I would like to repair my FieldKing Plough")

                        // context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "REPAIR",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }

                Image(
                    painter = painterResource(id = R.drawable.ploughmealie),
                    contentDescription = "Mealie Plough",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )
                //Text(text = "Audi Q7", fontFamily= FontFamily.Cursive)

                //Spacer(modifier = Modifier.height(40.dp))

                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0797630636")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hi", "I would like to fix my Mealie Plough")

                        //  context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "BUY",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }
                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0797630636")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hi", "I would like to rent a mealie plough")

                        //   context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "RENT",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }
                OutlinedButton(
                    onClick = {
                        val uri = Uri.parse("smsto:0797630636")

                        val intent = Intent(Intent.ACTION_SENDTO, uri)

                        intent.putExtra("Hi", "I would like to repair my mealie plough")

                        // context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    shape = RoundedCornerShape(10.dp),


                    // modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "REPAIR",
                        color = Color.White,

                        fontSize = 15.sp
                    )


                }

            }



        }
    }

}


@Preview( uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Light Mode")
@Composable
fun Ploughprev() {
    plough(rememberNavController())
}