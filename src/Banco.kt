
    class Banco(var nombre: String) {
        val  cuentaBancarias = mutableListOf<CuentaBancaria>()

        fun obtenerNumCta(nroCueta: Int): CuentaBancaria? {
            var cta: CuentaBancaria? = null
            for (c in cuentaBancarias){
                if (c.numCuenta == nroCueta){
                    cta = c
                }
            }
            return cta
        }
        fun transferir(nroCta1: Int, nroCta2:Int , monto:Double){
            obtenerNumCta(nroCta1)!!.transferir(obtenerNumCta(nroCta2)!!,monto)

        }
        fun retirar(nroCueta:Int,monto:Double){
            obtenerNumCta(nroCueta)!!.retirar(monto)
        }
        fun depositar(nroCueta: Int,monto: Double){
            obtenerNumCta(nroCueta)!!.depositar(monto)
        }

        fun imprimirMontoporDni(){
            val agruparPordni = HashSet<String>()

            for (c in cuentaBancarias){
                agruparPordni.add(c.dni)
            }

            for (dni in agruparPordni){
                var total = 0.0;

                for (c in cuentaBancarias) {
                if (c.dni.equals(dni)) {
                    total += c.monto
                }
            }
                println("DNI: $dni, Total: $total")
            }
            println("-------------------------------");
            println("-------------------------------");
        }


        fun montoporCuenta(){
            for (c in cuentaBancarias){
                println(c);
            }
            println("-------------------------------");
            println("-------------------------------");


        }
        fun totalBanco(){
            var total = 0.0;
            for ( c in cuentaBancarias){
                total += c.monto

            }
            println("Total Banco $nombre $$total")
            println("-------------------------------")
            println("-------------------------------")
        }

        fun abriCuenta(nroCueta: Int, dni: String, monto: Double){
            cuentaBancarias.add(CuentaBancaria(nroCueta,dni,monto))
        }
    }
