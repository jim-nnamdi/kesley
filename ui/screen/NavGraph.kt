package androidx.Navgraph

@Composable
fun NavGraph(uvm:UserViewModel = viewModel()) {
    val controller = rememberNavController()
    NavHost(navController = controller, startDestination = Routes.WELCOME) {
        composable(Routes.WELCOME){BasicWelcome(uvm)}
        composable(Routes.HOME) {BasicHome()}
    }
}