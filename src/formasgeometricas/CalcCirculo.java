package formasgeometricas;

public class CalcCirculo implements InterfaceGeometrica{
double pi;
double raio;
    @Override
    public void CalcArea(double comp, double larg) {
        double result;
        result = (comp*(larg*larg));
    }
String imprimeDadosCirculo(double pi, double raio) {
        this.pi = pi;
        this.raio = raio;
        double area = pi * (raio*2) ;
        return ("pi: " + pi + " raio: " + raio + " Area: " + area);

    }
}
