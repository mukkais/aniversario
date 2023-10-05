package com.example.cartaodeaniversario

import android.graphics.fonts.FontFamily
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodeaniversario.ui.theme.CartaoDeAniversarioTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeAniversarioTheme {
                TextoCartao()


            }
        }
    }
}
@Preview (showSystemUi = true)
@Composable
fun TextoCartao() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription =null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
            alpha =0.9F
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.fillMaxSize()
        ) {

            Text(
                text = "parabens happy birthday Feliz cumpleaños お誕生日おめでとう",
                fontSize = 40.sp,
                color = Color.White,
                lineHeight = 100.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .width(300.dp)
                    .padding(top = 50.dp),
                fontStyle = FontStyle.Italic,
                fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
                fontWeight = FontWeight.Medium,
            )
            Dedicatoria(text = "de muka")
            Dedicatoria(text = "para du")
        }
    }
}

@Composable
fun Dedicatoria(text:String){
    Text(
        text = text,
        fontSize = 25.sp,
        fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
        color = Color.Blue,
        textAlign = TextAlign.End,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 8.dp)
    )
}