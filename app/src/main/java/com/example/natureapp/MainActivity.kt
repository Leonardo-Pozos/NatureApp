package com.example.natureapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.natureapp.models.NatureItem
import com.example.natureapp.ui.theme.NatureAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NatureAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyCard(paddingValues = PaddingValues(15.dp))
                }
            }
        }
    }
}

@Composable
fun MyCard(paddingValues: PaddingValues){
    val natureList = NatureItem.natureItems
    Column (
        modifier = Modifier.padding(paddingValues)
    ){
        Text(text = "Lugares Naturales",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 25.dp),
            fontSize = 30.sp
        )
        LazyColumn (
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .padding(top = 15.dp)
        ){
            items(natureList) { item ->
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(350.dp)
                        .padding(bottom = 15.dp)
                ){
                    Column{
                        Image(
                            painter = rememberAsyncImagePainter(model = item.imagen),
                            contentDescription = "Nature Picture",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = item.titulo,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(top = 10.dp),
                            fontSize = 20.sp
                        )
                        Text(text = item.descripcion, modifier = Modifier.padding(start = 15.dp, end = 15.dp))
                    }
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_7A
)
@Composable
fun CardPreview() {
    NatureAppTheme {
        MyCard(paddingValues = PaddingValues(15.dp))
    }
}