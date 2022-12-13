interface dbConnection {
    fun establishmentConnection()
}

// When we use the keyword 'object' we are saying that this class uses the singleton pattern
object doConnection: dbConnection {
    override fun establishmentConnection() {
        TODO("Not yet implemented")
    }
}