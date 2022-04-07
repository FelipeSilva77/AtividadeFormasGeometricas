package formasgeometricas;

public class CalcTriangulo implements InterfaceGeometrica{
double base;
    double alt;

    @Override
    public void CalcArea(double comp, double larg) {
        double result;
        result = ((comp * larg) * 2);
    }

    String imprimeDados(double base, double alt) {
        double area;
        this.base = base;
        this.alt = alt;
         area = ((base * alt) / 2);
        return ("Base: " + base + " Altura: " + alt + " Area: " + area);

    }

}
