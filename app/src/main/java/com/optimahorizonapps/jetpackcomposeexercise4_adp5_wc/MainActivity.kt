package com.optimahorizonapps.jetpackcomposeexercise4_adp5_wc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.optimahorizonapps.jetpackcomposeexercise4_adp5_wc.ui.theme.JetpackComposeExercise4_ADP5_wCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeExercise4_ADP5_wCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCardTop(modifier: Modifier) {
    val image = painterResource(R.drawable.donald_duck_pic)

        Column(
            Modifier
                .fillMaxSize(0.5f),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(width = 150.dp, height = 150.dp),
            )
            Text(
                text = "Donald Duck",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 12.dp))
            Text(
                text = "Professional cartoon actor")
        }
}

@Composable
fun BusinessCardBottom(modifier: Modifier) {
    val homeIcon = painterResource(R.drawable.ic_baseline_home_24)
    val phoneIcon = painterResource(R.drawable.ic_baseline_phone_24)
    val emailIcon = painterResource(R.drawable.ic_baseline_mail_outline_24)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 0.dp, 0.dp, 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, 2.dp, 20.dp, 2.dp)
        ) {
            Icon(
                painter = phoneIcon,
                contentDescription = "Phone number",
                modifier = Modifier
                    .padding(5.dp)
                    .wrapContentWidth(Alignment.Start)
            )
            Text(
                text = "003851234567",
                modifier = Modifier
                    .padding(10.dp, 0.dp, 10.dp, 0.dp)
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.End)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, 2.dp, 20.dp, 2.dp)
        ) {
            Icon(
                painter = emailIcon,
                contentDescription = "Email address",
                modifier = Modifier
                    .padding(5.dp)
                    .wrapContentWidth(Alignment.Start)
            )
            Text(
                text = "donaldduck@somemail.dom",
                modifier = Modifier
                    .padding(10.dp, 0.dp, 10.dp, 0.dp)
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.End)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, 2.dp, 20.dp, 2.dp)
        ) {
            Icon(
                painter = homeIcon,
                contentDescription = "Home address",
                modifier = Modifier
                    .padding(5.dp)
                    .wrapContentWidth(Alignment.Start)
            )
            Text(
                text = "Bugs Bunny Street 15, Disneyland",
                modifier = Modifier
                    .padding(10.dp, 0.dp, 10.dp, 0.dp)
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.End)
            )
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        BusinessCardTop(modifier = Modifier.weight(3f))
        BusinessCardBottom(modifier = Modifier.weight(2f))
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    JetpackComposeExercise4_ADP5_wCTheme {
        BusinessCard()
    }
}