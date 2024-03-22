package com.example.penugasan_4
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.penugasan_4.ui.theme.Penugasan_4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Penugasan_4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BackgroundImage(
                        pesan = stringResource(id = R.string.pesan),
                        doa = getString(R.string.doa),
                        pengirim = stringResource(id = R.string.pengirim)
                    )
                }
            }
        }
    }
}

@Composable
fun UcapanSelamat(pesan: String, doa: String, pengirim: String, modifier: Modifier = Modifier){
    val gambar2 = painterResource(id = R.drawable.frame)

    Column (
        horizontalAlignment = Alignment.End,
    ){
        Text(
            text = "\n\n\n\n~Selamat & Sukses~",
            color = Color.Black,
            fontFamily = FontFamily.Serif,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(30.dp)
        )
        Box(contentAlignment = Alignment.Center){
            Image(
                painter = gambar2,
                contentDescription = null,
                alpha = 0.4f
            )
            Column (
                verticalArrangement = Arrangement.Center
            ){

                Text(
                    text = pesan,
                    color = Color.Black,
                    fontSize = 80.sp,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold,
                    style = TextStyle(
                        shadow = Shadow(
                            color = Color.Gray,
                            offset = Offset(5.0f,10.0f),
                            blurRadius = 7.0f
                        )
                    ),
                    lineHeight = 70.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(bottom = 40.dp)
                )
                Text(
                    text = doa,
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    lineHeight = 28.sp,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                )
            }
        }
        Column(
            modifier = Modifier.padding(end=20.dp)
        ) {
            Text(
                text = "salam hangat",
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp,
                modifier = Modifier
                    .align(alignment = Alignment.End)


            )
            Text(
                text = pengirim,
                color = Color.Black,
                fontFamily = FontFamily.Cursive,
                fontSize = 42.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(alignment = Alignment.End)


            )
        }
    }









}

@Composable
fun BackgroundImage(pesan: String, doa: String, pengirim: String, modifier: Modifier = Modifier){
    val gambar1 = painterResource(id = R.drawable.background)

        Image(
            painter = gambar1,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            alpha = 0.9f
        )
        UcapanSelamat(
            pesan = pesan,
            doa = doa,
            pengirim = pengirim,
            modifier = Modifier
                .fillMaxSize()
            )




}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Penugasan_4Theme {
        BackgroundImage(
            pesan = stringResource(R.string.pesan),
            doa = stringResource(R.string.doa),
            pengirim = stringResource(R.string.pengirim),
        )

    }
}