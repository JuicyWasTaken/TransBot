import io.github.cdimascio.dotenv.dotenv

object Vault {
    val discordBotToken = dotenv.get("TRANSBOT_DISCORD_BOT_TOKEN") ?: throw EnvError("TRANSBOT_DISCORD_BOT_TOKEN")

    val deeplAuthKey = dotenv.get("TRANSBOT_DEEPL_AUTH_KEY") ?: throw EnvError("TRANSBOT_DEEPL_AUTH_KEY")

    val testGuildId = dotenv.get("TRANSBOT_TEST_GUILD")?.toLongOrNull()

    val dbHost = dotenv.get("TRANSBOT_DB_HOST") ?: throw EnvError("TRANSBOT_DB_HOST")
    val dbName = dotenv.get("TRANSBOT_DB_NAME") ?: throw EnvError("TRANSBOT_DB_NAME")
    val dbUsername = dotenv.get("TRANSBOT_DB_USERNAME") ?: throw EnvError("TRANSBOT_DB_USERNAME")
    val dbPassword = dotenv.get("TRANSBOT_DB_PASSWORD") ?: throw EnvError("TRANSBOT_DB_PASSWORD")

    val translationCacheSize = dotenv.get("TRANSBOT_CACHE_SIZE")?.toIntOrNull() ?: 10000
}

class EnvError(name: String) : Error("Variable '$name' could not be loaded.")


private val dotenv = dotenv()
