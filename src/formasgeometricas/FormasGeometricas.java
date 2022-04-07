package formasgeometricas;

import java.util.Scanner;

public class FormasGeometricas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;
        double calc, base, alt, pi, raio, base1, alt1, base2, alt2;

        CalcTriangulo t = new CalcTriangulo();
        CalcCirculo c = new CalcCirculo();
        CalcQuadrado q = new CalcQuadrado();
        CalcQuadrilatero qq = new CalcQuadrilatero();

        
        System.out.println("-----FIGURAS GEOMETRICAS-----");
        System.out.println("Digite 1 para calcular a area do Triangulo");
        System.out.println("Digite 2 para calcular a area circulo");
        System.out.println("Digite 3 para calcular a area do quadrado");
        System.out.println("Digite 4 para calcular a area do quadrilatero");
        System.out.println("Digite 0 para sair!");

        opcao = in.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor da base");
                base = in.nextDouble();
                System.out.println("Digite o valor da altura");
                alt = in.nextDouble();
                t.CalcArea(t.base, t.alt);
                System.out.println(t.imprimeDados(base, alt));
                break;

            case 2:
                System.out.println("Digite o valor de pi");
                pi = in.nextDouble();
                System.out.println("Digite o valor do raio");
                raio = in.nextDouble();
                c.CalcArea(c.pi, c.raio);
                System.out.println(c.imprimeDadosCirculo(pi, raio));
                break;
            case 3:
                System.out.println("Digite o valor da base");
                base1 = in.nextDouble();
                System.out.println("Digite o valor da altura");
                alt1 = in.nextDouble();

                q.CalcArea(q.base, q.altura);
                System.out.println(q.imprimeDadosQuadrado(base1, alt1));
                break;
            case 4:
                System.out.println("Digite o valor da base");
                base2 = in.nextDouble();
                System.out.println("Digite o valor da altura");
                alt2 = in.nextDouble();

                qq.CalcArea(qq.base, qq.alt);
                System.out.println(qq.imprimeQuadrilatero(base2, alt2));

            case 0:
                System.out.println("-----SAINDO-----");
            default:
                break;
        }
    
    }
}
