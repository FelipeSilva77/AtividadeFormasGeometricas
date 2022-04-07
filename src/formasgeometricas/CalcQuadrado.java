package formasgeometricas;

public class CalcQuadrado implements InterfaceGeometrica{
double base;
double altura;

    @Override
    public void CalcArea(double base, double alt) {
         double result;
        result = (base * alt);
    }
String imprimeDadosQuadrado(double base, double alt) {
        this.base = base;
        this.altura = alt;
        double area = (base * alt);
        return ("Base: " + base + " Altura: " + alt + " Area: " + area);

    }
}
