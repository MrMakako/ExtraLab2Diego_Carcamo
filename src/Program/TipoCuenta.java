package Program;

public enum TipoCuenta {




    NORMAL(0.02,500),PlANILLA(0,200),VIP(0.04,100);

    double tasaInterez;
    double miniSaldo;

    TipoCuenta(double tasa,double miniSaldo){

        tasaInterez=tasa;
        this.miniSaldo=miniSaldo;


    }

    public double getTasaInterez() {
        return tasaInterez;
    }

    public double getMiniSaldo() {
        return miniSaldo;
    }
}

