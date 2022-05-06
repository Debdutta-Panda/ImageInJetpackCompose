package com.debduttapanda.imageinjetpackcompose

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.debduttapanda.imageinjetpackcompose.ui.theme.ImageInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageInJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.dog),
                            contentDescription = "",
                            modifier = Modifier
                                .size(100.dp)
                                .border(width = 1.dp, color = Color.Blue),
                            contentScale = ContentScale.None,
                            alpha = 1f,
                            colorFilter = ColorFilter.tint(color = Color.Red, blendMode = BlendMode.Multiply)
                        )
                    }
                }
            }
        }
    }

    fun createBitmap(): Bitmap {
        val width = 200
        val height = 200
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)

        val paint = Paint()
        paint.setColor(android.graphics.Color.BLACK)
        paint.setStyle(Paint.Style.FILL)
        //canvas.drawPaint(paint)

        //paint.setColor(android.graphics.Color.WHITE)
        paint.setAntiAlias(true)
        paint.setTextSize(100f)
        paint.setTextAlign(Paint.Align.CENTER)
        canvas.drawText("H", width / 2f, height / 2f, paint)
        return bitmap
    }
}
