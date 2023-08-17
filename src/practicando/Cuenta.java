package practicando;

public class Cuenta {
    private int num;
    private String nombre;
    private double saldo;
    private double ingreso;
    private double egreso;
    private double total;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getEgreso() {
        return egreso;
    }

    public void setEgreso(double egreso) {
        this.egreso = egreso;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    //metodos
    public void ingresarSaldo(double tot){
        this.saldo = this.saldo + tot;
    }
    public void retirando(double egreso){
        this.saldo = this.saldo - egreso;
    }
    
    public void ingresando(double ingreso){
        this.saldo = this.saldo + ingreso;
    }
}
