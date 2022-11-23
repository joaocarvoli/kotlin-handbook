val teams = listOf("Brazil", "Germany", "England", "Croatia", "Argentina")

fun main(){
    val rTeams = teams.filter {it[1] == 'r'} // "" -> string & '' -> char
    println(rTeams) // [Brazil, Croatia, Argentina]

    val map = teams.asSequence().map {
        println("access $it")
        it+it
    }
    println(map.toList()) // [BrazilBrazil, GermanyGermany, EnglandEngland, CroatiaCroatia, ArgentinaArgentina]
}

main()