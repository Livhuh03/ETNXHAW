package com.example.empoweringthenation

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.empoweringthenation.ui.theme.EmpoweringTheNationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EmpoweringTheNationTheme {
                val context = LocalContext.current

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFFAF3E0))
                        .padding(32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Empowering the Nation",
                        fontSize = 24.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFF4E342E))
                            .padding(24.dp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = { context.startActivity(Intent(context, ShortCoursesActivity::class.java)) },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF388E3C)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("View Short Courses", color = Color.White)
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Button(
                        onClick = { context.startActivity(Intent(context, SixMonthCoursesActivity::class.java)) },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF388E3C)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("View Six-Month Courses", color = Color.White)
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Button(
                        onClick = { context.startActivity(Intent(context, CalculatorActivity::class.java)) },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF388E3C)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Cost Calculator", color = Color.White)
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Button(
                        onClick = { context.startActivity(Intent(context, AboutUsActivity::class.java)) },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6A1B9A)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("About Us", color = Color.White)
                    }
                }
            }
        }
    }
}
