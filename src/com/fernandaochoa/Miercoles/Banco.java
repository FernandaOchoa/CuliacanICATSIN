package com.fernandaochoa.Miercoles;
//Tasa de interes bancaria por override
public class Banco {
    float rangoDeInteres(){
        return 0f;
    }
}
class BanCoppel extends Banco {
    float rangoDeInteres(){
        return 7f;
    }
}
class Bancomer extends Banco {
    float rangoDeInteres(){
        return 9f;
    }
}
class HSBC extends Banco {
    float rangoDeInteres() {
        return 8f;
    }
}
class PruebaBanco {
    public static void main(String[] args) {
        BanCoppel b = new BanCoppel();
        Bancomer bn = new Bancomer();
        HSBC h = new HSBC();

        System.out.println("La tasa de interes: "+b.rangoDeInteres());
        System.out.println("La tasa de interes: "+bn.rangoDeInteres());
        System.out.println("La tasa de interes: "+h.rangoDeInteres());
    }
}
