package com.laze.yuni.ui.page.todo

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.laze.yuni.ui.theme.YuNi_TodoTheme


@Composable
fun TodoPage(modifier: Modifier = Modifier) {
    Text(
        text = "Hello Todo!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    YuNi_TodoTheme {
        TodoPage()
    }
}