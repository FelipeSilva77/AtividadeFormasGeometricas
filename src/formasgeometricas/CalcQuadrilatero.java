package formasgeometricas;

public class CalcQuadrilatero implements InterfaceGeometrica{
double base;
double alt;
    @Override
    public void CalcArea(double comp, double larg) {
        double result;
        result = comp*larg;
    }
String imprimeQuadrilatero(double base, double alt) {
        this.base = base;
        this.alt = alt;
        double area = (base * alt);
        return ("Base: " + base + " Altura: " + alt + " Area: " + area);

    }
}
