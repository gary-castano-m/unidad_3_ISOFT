public class EmpleadoPorComision extends Empleado {

    private double ventas;
    private double porcentajeComision;

    public EmpleadoPorComision(String nombre,
                               String documento,
                               double salarioBase,
                               int aniosEmpresa,
                               double ventas,
                               double porcentajeComision) {

        super(nombre, documento, salarioBase, aniosEmpresa);

        if(ventas < 0){
            throw new IllegalArgumentException(
                    "Las ventas no pueden ser negativas");
        }

        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalarioBruto() {

        double comision =
                ventas * porcentajeComision;

        return salarioBase + comision;
    }

    @Override
    public double calcularBeneficios() {

        double beneficios = 1000000;

        if(ventas > 20000000){

            beneficios += ventas * 0.03;
        }

        return beneficios;
    }
}