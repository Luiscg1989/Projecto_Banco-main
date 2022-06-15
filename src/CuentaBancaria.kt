
    class CuentaBancaria( val numCuenta: Int, val dni: String, var monto: Double) {

        fun transferir(destino: CuentaBancaria, montoDestino: Double){
            destino.monto = (destino.monto + montoDestino)
            monto -= montoDestino

        }

        fun retirar(montoReiro: Double){
            monto-=montoReiro
        }

        fun depositar(montoDeposito: Double) {
            monto += montoDeposito
        }

        override fun toString(): String {
            return "CuentaBancaria(numCuenta=$numCuenta, dni='$dni', monto=$monto)"
        }

    }
