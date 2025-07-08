

@Composable
fun Welcome(uvm:UserViewModel){
    Text()
    TextField(onTextChanged = {
        uvm.onEvent(
            UserDataUiEvent.NameEntered(it)
        )
    })
}