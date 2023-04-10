enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val username: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivelamento: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    val nivel = nivelamento
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        
        println(inscritos)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
	
    val lamenkazu = Usuario("lamenkazu")
    val chatata = Usuario("chatata")
    
    
    val conteudoIntroTeorico = mutableListOf<ConteudoEducacional>()
    conteudoIntroTeorico.add(ConteudoEducacional(nome = "Apresentação e Objetivos"))
    
    val conteudoIntroPratico = mutableListOf<ConteudoEducacional>()
    conteudoIntroPratico.add(ConteudoEducacional(nome="Apresentação Introdução e Objetivos"))
   
    val listIntroTeorico : List<ConteudoEducacional> = conteudoIntroTeorico
    val listIntroPratico : List<ConteudoEducacional> = conteudoIntroPratico
    
    
    
    val introTeorico = Formacao("Conhecendo Kotlin e Sua Documentação Oficial", listIntroTeorico, Nivel.BASICO)
    val introPratico = Formacao("INtrodução Prática à Linguagem de Programação Kotlin", listIntroPratico, Nivel.BASICO)
    
    introTeorico.matricular(lamenkazu)
    introPratico.matricular(lamenkazu)
    
    introTeorico.matricular(chatata)
    
    
    
    
}