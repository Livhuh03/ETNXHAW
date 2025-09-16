package com.example.empoweringthenation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.empoweringthenation.ui.theme.EmpoweringTheNationTheme

class CalculatorActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EmpoweringTheNationTheme {
                val inputText = remember { mutableStateOf("") }
                val resultText = remember { mutableStateOf("") }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFFAF3E0))
                        .padding(32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Course Cost Calculator",
                        fontSize = 22.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFF4E342E))
                            .padding(24.dp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    TextField(
                        value = inputText.value,
                        onValueChange = { inputText.value = it },
                        placeholder = { Text("Enter number of courses") },
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Button(
                        onClick = {
                            val courses = inputText.value.toIntOrNull()
                            if (courses != null && courses > 0) {
                                val costPerCourse = 750
                                val total = courses * costPerCourse
                                resultText.value = "Total Cost: R$total"
                            } else {
                                resultText.value = "Please enter a valid number of courses."
                            }
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF388E3C)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Calculate Cost", color = Color.White)
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                        text = resultText.value,
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.fillMaxWidth().padding(16.dp)
                    )
                }
            }
        }
    }
}
