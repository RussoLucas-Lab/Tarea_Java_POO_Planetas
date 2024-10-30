import javax.xml.stream.FactoryConfigurationError;

public class Planeta {

    private String planeta = null;
    private int cantidadSatelites = 0;
    private  double masa = 0.0;
    private double volumen = 0.0;
    private int diametro = 0;
    private  int distanciaSol;
    private boolean esObservable;
    private int periodoOrbital;
    private float periodoRotacion;

    //Consultar
    //private enum TipoPlaneta{GASEOSO, ENANO, TERRESTRE};

    //CONSTRUCTOR
    public Planeta(String planeta, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol, boolean esObservable,int periodoOrbital, float periodoRotacion) {
        this.planeta = planeta;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;

    }


    //GETTER Y SETTER
    public float getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(int periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public int getPeriodoOrbital() {
        return periodoOrbital;
    }

    public void setPeriodoOrbital(int periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public void setCantidadSatelites(int cantidadSatelites) {
        this.cantidadSatelites = cantidadSatelites;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public void setEsObservable(boolean esObservable) {
        this.esObservable = esObservable;
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public double getMasa() {
        return masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public int getDistanciaSol() {
        return distanciaSol;
    }

    public boolean isEsObservable() {
        return esObservable;
    }

    public String getPlaneta() {
        return planeta;
    }

    //MÉTODOS

    public double calcularDensidad(){
        double densidad = masa/volumen;
        return densidad;
    }

    public boolean esExterior(){
        boolean esExterior = false;
        long distancia = (3 * 149597870);
        if(distanciaSol > distancia){
            return esExterior = true;
        }else {return esExterior;}
        }

    public void mostrarPlaneta(){
        System.out.println("Nombre del planeta = " + planeta);
        System.out.println("cantidad de Satélites = " + cantidadSatelites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diametro);
        System.out.println("Distancia al sol = " + distanciaSol);
        System.out.println("Es observable = " + esObservable);
        System.out.println("El periodo oribital del planeta = " + periodoOrbital);
        System.out.println("El periodo rotacional del planeta = " + periodoRotacion);
        System.out.println("Densidad del planeta = " + calcularDensidad());
        System.out.println("Es planeta exterior = " + esExterior());

        ;
    }
}
