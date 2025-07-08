
class ViewModel {
    var uiState = mutableStateOf(UserInputState)

    fun onEvent(e: UserDataUiEvent) {
        when(e) {
            is -> UserDataUiEvent.NameEntered {}
            is -> UserDataUiEvent.AnimalEntered {}
        }
    }
}