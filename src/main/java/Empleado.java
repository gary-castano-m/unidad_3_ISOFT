
public abstract class Empleado {

    protected String nombre;
    protected String documento;
    protected double salarioBase;
    protected int aniosEmpresa;

    public Empleado(String nombre, String documento,
                    double salarioBase, int aniosEmpresa) {

        this.nombre = nombre;
        this.documento = documento;
        this.salarioBase = salarioBase;
        this.aniosEmpresa = aniosEmpresa;
    }

    public abstract double calcularSalarioBruto();

    public abstract double calcularBeneficios();

    public double calcularDeducciones() {
        return calcularSalarioBruto() * 0.04;
    }

    public double calcularSalarioNeto() {

        double neto =
                calcularSalarioBruto()
                        + calcularBeneficios()
                        - calcularDeducciones();

        if(neto < 0){
            throw new IllegalArgumentException(
                    "El salario neto no puede ser negativo");
        }

        return neto;
    }
}
