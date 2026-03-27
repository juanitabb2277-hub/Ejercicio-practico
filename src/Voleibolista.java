public class Voleibolista extends Atleta implements Evaluable{
    private int saquesefectivos;
    private int bloqueos;

    public Voleibolista(int bloqueos, int saquesefectivos) {
        this.bloqueos = bloqueos;
        this.saquesefectivos = saquesefectivos;
    }

    public Voleibolista(int edad, int horasdeentrenamiento, String nombre, int bloqueos, int saquesefectivos) {
        super(edad, horasdeentrenamiento, nombre);
        this.bloqueos = bloqueos;
        this.saquesefectivos = saquesefectivos;
    }

    public int getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(int bloqueos) {
        this.bloqueos = bloqueos;
    }

    public int getSaquesefectivos() {
        return saquesefectivos;
    }

    public void setSaquesefectivos(int saquesefectivos) {
        this.saquesefectivos = saquesefectivos;
    }

    @Override
    public String toString() {
        return "Voleibolista{" +
                "bloqueos=" + bloqueos +
                ", saquesefectivos=" + saquesefectivos +
                '}';
    }

    @Override
    public int calcularrendimiento() {
        int rendimiento=(saquesefectivos*2)+(bloqueos*3);
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
