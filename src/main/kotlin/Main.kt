fun main(args: Array<String>) {
//remova os "//" do programa que você quiser usar.

    //triangulo()
    //anoBissexto()
    //detetive()
    //combustivel()
}

fun triangulo(): Unit {
    println("Digite o primeiro lado do triângulo: ")
    val primeiroLado = readLine()!!.toInt()
    println("Digite o segundo lado do triângulo: ")
    val segundoLado = readLine()!!.toInt()
    println("Digite o terceiro lado do triângulo: ")
    val terceiroLado = readLine()!!.toInt()

    if (primeiroLado == segundoLado && segundoLado == terceiroLado) {
        println("Triângulo Equilátero")
    } else if (primeiroLado == segundoLado && segundoLado != terceiroLado || primeiroLado != segundoLado && segundoLado == terceiroLado || primeiroLado != terceiroLado && segundoLado == terceiroLado || primeiroLado == terceiroLado && segundoLado != terceiroLado
    ) {
        println("Triângulo Isósceles")
    } else if (primeiroLado != segundoLado && segundoLado != terceiroLado)
        println("Triângulo Escaleno")
    else {
        println("Invalido!!!")
    }
}

fun anoBissexto(): Unit {

    println("Digite o ano: ")
    val ano = readLine()!!.toInt()

    if (ano % 4 == 0 && ano % 100 != 0)
        println("é um ano bissexto")
    else if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0)
        println("É um ano Bissexto")
    else
        println("Não é um ano bissexto")









    fun detetive(): Unit {
        println("Responda usando 0 ou 1 :\n0 = Não\n1 = Sim")
        println("Telefonou para a vítima?")
        val pergunta = readLine()!!.toInt()
        if (pergunta == 1)
        else if (pergunta == 0)
        else
            println("Resposta Invalida!!!")


        println("Esteve no local do crime?")
        val pergunta2 = readLine()!!.toInt()
        if (pergunta2 == 1)
        else if (pergunta2 == 0)
        else
            println("Reposta Invalida!!!")


        println("Mora perto da Vitima?")
        val pergunta3 = readLine()!!.toInt()
        if (pergunta3 == 1)
        else if (pergunta3 == 0)
        else
            println("Resposta invalida!!!")

        println("Devia para a vitima?")
        val pergunta4 = readLine()!!.toInt()
        if (pergunta4 == 1)
        else if (pergunta4 == 0)
        else
            println("Resposta Invalida!!!")


        println("Ja trabalhou com a vítima?")
        val pergunta5 = readLine()!!.toInt()

        if (pergunta5 == 1)
        else if (pergunta5 == 0)
        else
            println("Resposta Invalida")


        val media = (pergunta + pergunta2 + pergunta3 + pergunta4 + pergunta5)
        if (media <= 1)
            println("Você é Inocente!!!")
        else if (media == 2)
            println("Você é Suspeito(a)!!!")
        else if (media <= 4)
            println("Voce é Cumplice!!!")
        else if (media == 5)
            println("Voce é o assassino!!!")
        else
            println("Resposta Invalida!!!")

    }


}

fun detetive(): Unit {
    println("Responda usando 0 ou 1 :\n0 = Não\n1 = Sim")
    println("Telefonou para a vítima?")
    val pergunta = readLine()!!.toInt()
    if (pergunta == 1)
    else if (pergunta == 0)
    else
        println("Resposta inválida!!!")
    println("Esteve no local do crime?")
    val pergunta2 = readLine()!!.toInt()
    if (pergunta2 == 1)
    else if (pergunta2 == 0)
    else
        println("Reposta inválida!!!")
    println("Mora perto da Vitima?")
    val pergunta3 = readLine()!!.toInt()
    if (pergunta3 == 1)
    else if (pergunta3 == 0)
    else
        println("Resposta inválida!!!")
    println("Devia para a vitima?")
    val pergunta4 = readLine()!!.toInt()
    if (pergunta4 == 1)
    else if (pergunta4 == 0)
    else
        println("Resposta inválida!!!")
    println("Ja trabalhou com a vítima?")
    val pergunta5 = readLine()!!.toInt()
    if (pergunta5 == 1)
    else if (pergunta5 == 0)
    else
        println("Resposta inválida")


    val media = (pergunta + pergunta2 + pergunta3 + pergunta4 + pergunta5)
    if (media <= 1)
        println("Você é Inocente!!!")
    else if (media == 2)
        println("Você é Suspeito(a)!!!")
    else if (media == 3 || media == 4)
        println("Voce é cúmplice!!!")
    else if (media == 5)
        println("Voce é o assassino!!!")
    else
        println("Resposta inválida!!!")
}

fun combustivel(): Unit {

    println("Qual Combustível você vai querer?\nG - Gasolina\nA - Álcool")
    val tipoDoCombustivel = readLine()!!.toString()

    println("Quantos Litros você vai querer? ")
    val litros = readLine()!!.toInt()

    val preco = (litros * 6)

    if (tipoDoCombustivel.equals("a",true) && litros <= 20) {
        println("O valor total é: R$${preco - (preco * 3) / 100}")
    } else if (tipoDoCombustivel.equals("a",true) && litros >= 20){
        println("O valor total é: R$${preco - (preco * 5) / 100}")
    }else if (tipoDoCombustivel.equals("g",true) && litros <= 20){
        println("O valor total é: R$${preco - (preco * 4) / 100}")
    }else if (tipoDoCombustivel.equals("g",true) && litros >= 20) {
        println("O valor total é: R$${preco - (preco * 6) / 100}")
    }else{
        println("Algo deu errado!!!")
    }
}
