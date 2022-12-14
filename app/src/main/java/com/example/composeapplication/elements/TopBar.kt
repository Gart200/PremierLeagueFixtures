package com.example.composeapplication.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.composeapplication.ui.theme.Dark
import com.example.composeapplication.ui.theme.LightPurple

@Composable
fun TopBar() {

    Box(modifier = Modifier.background(Dark)
        .fillMaxWidth()) {
        TopAppBar(
            title = {
                TextField(
                    value = "",
                    onValueChange = { /*TODO*/ },
                    label = { Text(text = "Enter your text") },

                    )
            },

            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Icon")
                }
            },

            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 10.dp)
                .clip(shape = RoundedCornerShape(16.dp)),
            backgroundColor = LightPurple,
            elevation = 8.dp
        )

    }
}