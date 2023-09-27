package com.example.task1

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1.ui.theme.Task1Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var a by remember {
                        mutableStateOf("First name")
                    }
                    var b by remember {
                        mutableStateOf("Sur name")
                    }
                    var c by remember {
                        mutableStateOf("Mobile Number or Email Address")
                    }
                    var d by remember {
                        mutableStateOf("New Password")
                    }
                    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(20.dp)){
                        Text(
                            fontSize = 32.sp,
                            fontWeight = FontWeight(600),
                            color = Color.Black,
                            text = "Sign Up",
                            textAlign = TextAlign.Start,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Text(fontSize = 22.sp, color = Color.Black, text = "It's quick and easy.", textAlign = TextAlign.Start, modifier = Modifier.fillMaxWidth())
                        Divider(Modifier
                            .padding(top = 10.dp, bottom = 10.dp))

                        Row {
                            TextField(value = a, onValueChange = { a = it }, modifier = Modifier
                                .weight(1f)
                                .padding(10.dp))
                            TextField(value = b, onValueChange = { b = it }, modifier = Modifier
                                .weight(1f)
                                .padding(10.dp))

                        }
                        TextField(value = c, onValueChange = {c=it}, modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp))
                        TextField(value = d, onValueChange = {c=it}, modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp))
                        Text(text = "People who use our service may have uploaded your contact information to Facebook. Learn more.", modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp))
                        Text(text = "By clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy. You may receive SMS notifications from us and can opt out at any time.", modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp))
                        Button(onClick = {}, colors= ButtonDefaults.buttonColors(Color(0xFF358856))) {
                            Text(text = "Sign Up", color = Color.White)
                        }
                    }

                }
            }
        }
    }
}

