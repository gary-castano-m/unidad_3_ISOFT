public class EmpleadoAsalariado extends Empleado {

    public EmpleadoAsalariado(String nombre,
                              String documento,
                              double salarioBase,
                              int aniosEmpresa) {

        super(nombre, documento, salarioBase, aniosEmpresa);
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioBase;
    }

    @Override
    public double calcularBeneficios() {

        double bono = 0;

        if(aniosEmpresa > 5){
            bono = salarioBase * 0.10;
        }

        return bono + 1000000;
    }
}
