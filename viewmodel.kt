
class UserViewModel: ViewModel() {
    var uiState = mutableStateOf(UserInputState())

    fun onEvent(e: UserDataUiEvent) {
        when(e) {
            is -> UserDataUiEvent.NameEntered {
                uiState.value = uiState.value.copy(
                    nameEntered = e.name
                )
            }
            is -> UserDataUiEvent.AnimalEntered {}
        }
    }
}