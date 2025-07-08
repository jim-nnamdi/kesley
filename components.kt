
import androidx.foundation.layouts.Composable
import androidx.compose.setname
import androidx.compose.getname

@Composable
fun TextFieldComponent() {
    var currentValue by remember {
        mutableStateOf("")
    }

    /* some of the parameters are composable which */
    /* implies that they're stand alone lambdas .. */
    
    OutlineTextField(
        modifier = Modifier.fillMaxWidth()
        value = currentValue,
        placeholder = { Text("Enter name ")}
        onValueChange = {}
    )
}

@Preview
@Composable 
fun TextFieldComponentPreview(){
    TextFieldComponent()
}