import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import ui.value.R

@Composable
fun vCalendar() {
    Column {
        mRow(R.string.month)
        R.string.vegetables.forEach { it ->
            vRow(it)
        }
    }
}

@Composable
fun mRow(month: Array<String>) {
    val imageModifier = Modifier
        .height(50.dp)
        .width(50.dp)
        .clip(RoundedCornerShape(12.dp))
        .padding(5.dp)
    Row {
        Image(
            painter = painterResource("empty.png"),
            contentDescription = "image",
            imageModifier,
            contentScale = ContentScale.Fit
        )
        month.forEach { it ->
            Text(
                it,
                modifier = imageModifier
            )
        }
    }
}

@Composable
fun vRow(vegetable: Array<String>) {

    val imageModifier = Modifier
        .height(50.dp)
        .width(50.dp)
        .clip(RoundedCornerShape(12.dp))
        .padding(5.dp)

    Row {
        vegetable.forEach { it ->
            Image(
                painter = painterResource(it),
                contentDescription = "image",
                imageModifier,
                contentScale = ContentScale.Fit
            )
        }
    }
}
