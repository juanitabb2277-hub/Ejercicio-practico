public class Ciclista extends Atleta implements Evaluable{
    private int KilometrosRecoridos;
    private int tiempohoras;

    public Ciclista(int kilometrosRecoridos, int tiempohoras) {
        KilometrosRecoridos = kilometrosRecoridos;
        this.tiempohoras = tiempohoras;
    }

    public Ciclista(int edad, int horasdeentrenamiento, String nombre, int kilometrosRecoridos, int tiempohoras) {
        super(edad, horasdeentrenamiento, nombre);
        KilometrosRecoridos = kilometrosRecoridos;
        this.tiempohoras = tiempohoras;
    }

    public int getKilometrosRecoridos() {
        return KilometrosRecoridos;
    }

    public void setKilometrosRecoridos(int kilometrosRecoridos) {
        KilometrosRecoridos = kilometrosRecoridos;
    }

    public int getTiempohoras() {
        return tiempohoras;
    }

    public void setTiempohoras(int tiempohoras) {
        this.tiempohoras = tiempohoras;
    }


    @Override
    public String toString() {
        return "Ciclista{" +
                "KilometrosRecoridos=" + KilometrosRecoridos +
                ", tiempohoras=" + tiempohoras +
                '}';
    }

    @Override
    public int calcularrendimiento() {
        int rendimiento=KilometrosRecoridos/tiempohoras;
        System.out.println(rendimiento);
        return 0;
    }

    @Override
    public int clasificarnivel() {
        int rendimiento = calcularrendimiento();

        if (rendimiento < 30) {
            return 1;
        } else if (rendimiento <= 70) {
            return 2;
        } else {
            return 3;
        }
    }

    @Override
    public int calcularbono() {
        return 0;
    }
}
