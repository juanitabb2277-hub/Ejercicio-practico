public abstract class Atleta {
    protected String nombre;
    protected int edad;
    protected int horasdeentrenamiento;

    public Atleta() {
    }

    public Atleta(int edad, int horasdeentrenamiento, String nombre) {
        this.edad = edad;
        this.horasdeentrenamiento = horasdeentrenamiento;
        this.nombre = nombre;
    }
    public void mostrardatos(){
        System.out.println("NOMBRE:"+nombre);
        System.out.println("EDAD:"+edad);
        System.out.println("HORAS DE ENTRENAMIENTO: "+horasdeentrenamiento);
    }
    public abstract int calcularrendimiento();

}
