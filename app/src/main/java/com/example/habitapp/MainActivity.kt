package com.example.habitapp

import android.graphics.Color.BLUE
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.habitapp.ui.theme.HabitAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HabitAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    AppBar();
                    actionButton();
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    HabitAppTheme {
        AppBar()
        actionButton()
    }
}

@Composable
fun AppBar() {
    Scaffold(
        floatingActionButtonPosition = FabPosition.End
    ) {
            TopAppBar(
                title = {
                    Text(
                        text = "Habit App",
                        color = Color.White
                    )
                },
                backgroundColor = colorResource(id = R.color.purple_700),
                contentColor = Color.White,
                elevation = 12.dp,
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.Add, contentDescription = "Localized description")
                    }
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.Settings, contentDescription = "Localized description")
                    }
                }
            )
//        FloatingActionButton(
//            onClick = { /*TODO*/ },
//            backgroundColor = Color.Red,
//            shape = MaterialTheme.shapes.small.copy(CornerSize(percent = 50)),
//            content = {
//                Icon(
//                    Icons.Filled.Add,
//                    contentDescription = null,
//                    tint = Color.White
//                )
//            }
//        )


    }
}

@Composable
fun actionButton(){

    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ExtendedFloatingActionButton(
            modifier = Modifier.padding(16.dp),
            icon = { Icon(Icons.Filled.Add, contentDescription = null) },
            text = { Text("Add a Task") },
            onClick = { /*do something*/ }
        )
    }

}
