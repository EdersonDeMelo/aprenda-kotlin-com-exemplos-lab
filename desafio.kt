// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val nome: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val (formacao1, formacao2, formacao3) = triple()
    imprimirDados(formacao1)
    imprimirDados(formacao2)
    imprimirDados(formacao3)
}

private fun triple(): Triple<Formacao, Formacao, Formacao> {
    val conteudoEducacional1 = ConteudoEducacional("Introdução ao Kotlin", 60)
    val conteudoEducacional2 = ConteudoEducacional("Kotlin Intermediario", 90)
    val conteudoEducacional3 = ConteudoEducacional("Kotlin Avançado", 120)

    val listaConteudoEducacional1 = listOf(conteudoEducacional1, conteudoEducacional2)
    val listaConteudoEducacional2 = listOf(conteudoEducacional1, conteudoEducacional2, conteudoEducacional3)
    val listaConteudoEducacional3 = listOf(conteudoEducacional1, conteudoEducacional2, conteudoEducacional3)

    val formacao1 = Formacao("Kotlin para iniciantes", listaConteudoEducacional1, Nivel.BASICO)
    val formacao2 = Formacao("Kotlin para iniciantes", listaConteudoEducacional2, Nivel.INTERMEDIARIO)
    val formacao3 = Formacao("Kotlin para iniciantes", listaConteudoEducacional3, Nivel.AVANCADO)

    val usuario = Usuario("João", "joao@email.com")
    val usuario2 = Usuario("Maria", "maria@email.com")
    val usuario3 = Usuario("Ana", "maria@email.com")
    val usuario4 = Usuario("Paulo", "maria@email.com")
    val usuario5 = Usuario("Tex", "maria@email.com")
    val usuario6 = Usuario("Via", "maria@email.com")
    val usuario7 = Usuario("Rou", "maria@email.com")
    val usuario8 = Usuario("Two", "maria@email.com")

    formacao1.matricular(usuario)
    formacao1.matricular(usuario2)
    formacao2.matricular(usuario3)
    formacao2.matricular(usuario4)
    formacao3.matricular(usuario5)
    formacao3.matricular(usuario6)
    formacao3.matricular(usuario7)
    formacao1.matricular(usuario8)
    return Triple(formacao1, formacao2, formacao3)
}

fun imprimirDados(formacao: Formacao) {
    println("Formação: ${formacao.nome} - Nivel: ${formacao.nivel}")
    for (conteudo in formacao.conteudos) {
        println("Conteudo: ${conteudo.nome} - Duração: ${conteudo.duracao}")
    }
    for (inscrito in formacao.inscritos) {
        println("Inscrito: ${inscrito.nome}")
    }
}