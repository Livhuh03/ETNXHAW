package com.example.empoweringthenation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.empoweringthenation.ui.theme.EmpoweringTheNationTheme

class AboutUsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EmpoweringTheNationTheme {
                val scrollState = rememberScrollState()

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFFAF3E0))
                        .padding(32.dp)
                        .verticalScroll(scrollState),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "About Us",
                        fontSize = 22.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFF4E342E))
                            .padding(24.dp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = """
                            Welcome to Empowering the Nation!

                            We provide affordable short courses and six-month programs to equip individuals with practical skills for everyday life and employment. 

                            Our mission is to empower communities by offering accessible training in fields such as First Aid, Sewing, Cooking, Child Minding, Landscaping, and more.

                            Whether you're looking to upskill or start a new career, we are here to help you succeed!
                        """.trimIndent(),
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    )
                }
            }
        }
    }
}
