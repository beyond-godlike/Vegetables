package ui.main

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import vCalendar

@Composable
fun MainScreen(
    viewModel: MainViewModel,
) {
    Scaffold(Modifier.wrapContentSize()) {
        vCalendar()
    }
}