import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composetest.R

@Composable
fun BlurredImage(imageId:Int) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .border(width = 0.5.dp, color = colorResource(id = R.color.mainColor02), shape = RoundedCornerShape(40.dp)) .shadow(
                elevation = 100.dp,
                spotColor = Color.Black,
                shape = RoundedCornerShape(8.dp)
            ),
    ) {
        Image(painter = painterResource(id = imageId), contentDescription = "img",contentScale = ContentScale.Crop, modifier = Modifier.blur(radiusX = 8.dp, radiusY = 8.dp))
    }
}
