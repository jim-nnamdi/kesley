
sealed class UserDataUiEvent {
    data class NameEntered(val name:String) : UserDataUiEvent()
    data class AnimalEntered(val animal:String) : UserDataUiEvent()
}