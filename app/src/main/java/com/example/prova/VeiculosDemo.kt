package com.example.prova

open class Veiculo(
    private val marca: String,
    private val modelo: String,
    private val ano: Int,
    private val preco: Double
) {
    open fun exibirInformacoes() {
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Ano: $ano")
        println("Preço: R$ %.2f".format(preco))
    }
}

class Carro(
    marca: String,
    modelo: String,
    ano: Int,
    preco: Double,
    private val quantidadeDePortas: Int
) : Veiculo(marca, modelo, ano, preco) {
    override fun exibirInformacoes() {
        println("--- Carro ---")
        super.exibirInformacoes()
        println("Quantidade de portas: $quantidadeDePortas")
    }
}

class Moto(
    marca: String,
    modelo: String,
    ano: Int,
    preco: Double,
    private val cilindrada: Int
) : Veiculo(marca, modelo, ano, preco) {
    override fun exibirInformacoes() {
        println("--- Moto ---")
        super.exibirInformacoes()
        println("Cilindrada: $cilindrada cc")
    }
}

fun main() {
    val veiculos: List<Veiculo> = listOf(
        Carro("Toyota", "Corolla", 2022, 145000.00, 4),
        Moto("Honda", "CB 500F", 2023, 38900.00, 500)
    )

    veiculos.forEach { veiculo ->
        veiculo.exibirInformacoes()
        println()
    }
}
