package androidx.Navgraph

@Composable
fun NavGraph() {
    val controller = rememberNavController()
    NavHost(navController = controller, startDestination = Routes.WELCOME) {
        composable(Routes.WELCOME){BasicWelcome()}
        composable(Routes.HOME) {BasicHome()}
    }
}