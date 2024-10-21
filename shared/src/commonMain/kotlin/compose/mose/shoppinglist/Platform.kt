package compose.mose.shoppinglist

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform