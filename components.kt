
import androidx.foundation.layouts.Composable
import androidx.compose.setname
import androidx.compose.getname

@Composable
fun TextFieldComponent(
    onTextChanged:(name:String) -> Unit
) {
    var currentValue by remember {
        mutableStateOf("")
    }

    /* some of the parameters are composable which */
    /* implies that they're stand alone lambdas .. */

    OutlineTextField(
        modifier = Modifier.fillMaxWidth()
        value = currentValue,
        placeholder = { Text("Enter name ")}
        onValueChange = {
            /* keyboard inactive if this isn't added */
            currentValue = it
            onTextChanged(it)
        }
    )
}

@Preview
@Composable 
fun TextFieldComponentPreview(){
    TextFieldComponent()
}