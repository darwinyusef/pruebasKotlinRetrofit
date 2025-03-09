import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ItemRow(name: String, price: String) {
    Column(
        modifier = Modifier.padding(8.dp)
    ) {
        Text(text = "Nombre: $name", fontSize = MaterialTheme.typography.bodyLarge.fontSize)
        Text(text = "Precio: $price", fontSize = MaterialTheme.typography.bodyMedium.fontSize)
    }
}