package com.example.empoweringthenation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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

class PlaceOrderActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EmpoweringTheNationTheme {
                val name = remember { mutableStateOf("") }
                val email = remember { mutableStateOf("") }
                val phone = remember { mutableStateOf("") }
                val message = remember { mutableStateOf("") }
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
                        text = "Place Your Order",
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
                        value = name.value,
                        onValueChange = { name.value = it },
                        placeholder = { Text("Full Name") },
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    TextField(
                        value = email.value,
                        onValueChange = { email.value = it },
                        placeholder = { Text("Email Address") },
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    TextField(
                        value = phone.value,
                        onValueChange = { phone.value = it },
                        placeholder = { Text("Phone Number") },
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Button(
                        onClick = {
                            if (name.value.isNotEmpty() && email.value.isNotEmpty() && phone.value.isNotEmpty()) {
                                message.value = "Thank you, ${name.value}! Your order has been placed."
                            } else {
                                message.value = "Please fill in all fields."
                            }
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF388E3C)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Submit Order", color = Color.White)
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                        text = message.value,
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.fillMaxWidth().padding(16.dp)
                    )
                }
            }
        }
    }
}
