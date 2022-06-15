
    fun main(args: Array<String>) {

        val Bco = Banco("ICBC")

        Bco.abriCuenta(1, "11111111", 200.00)
        Bco.abriCuenta(3, "22222222", 300.0)
        Bco.abriCuenta(4, "11111111", 500.00)
        Bco.abriCuenta(5, "33333333", 350.0)
        Bco.abriCuenta(6, "33333333", 5.0)
        Bco.abriCuenta(7, "44444444", 25.0)
        Bco.abriCuenta(8, "44444444", 20.0)

        Bco.transferir(1,6,50.0)
        Bco.transferir(4,7,100.0)
        Bco.depositar(8,50.0)
        Bco.obtenerNumCta(5)!!.retirar(50.0)
        Bco.depositar(6,600.00)

        Bco.montoporCuenta()
        Bco.imprimirMontoporDni()
        Bco.totalBanco()

    }
