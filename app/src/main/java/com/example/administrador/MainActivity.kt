package com.example.administrador

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.administrador.ui.theme.AdministradorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdministradorTheme {
                    Contenido()
            }
        }
    }
}

@Composable
fun Contenido() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        val tic = painterResource(R.drawable.ic_task_completed)

        Image(painter = tic, contentDescription = null)

        Text(
            text = "All tasks completed",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,

            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
        )
        
        Text(
            text = "Nice work!",
            fontSize = 18.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AdministradorPreview() {
    AdministradorTheme {
        Contenido()
    }
}