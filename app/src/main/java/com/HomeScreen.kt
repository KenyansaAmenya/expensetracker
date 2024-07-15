package com

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun HomeScreen(){
    Surface (
        modifier = Modifier.fillMaxSize()) {
        ConstraintLayout (
            modifier = Modifier.fillMaxSize()){
            val (nameRow, list, card, topBar) = createRefs()
        }
    }

}

@Composable
@Preview(showBackground = true)
fun PreviewHomeScreen(){
    HomeScreen()
}