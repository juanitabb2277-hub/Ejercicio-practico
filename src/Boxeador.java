public class Boxeador extends Atleta implements Evaluable{
    private int golpesacelerados;
    private int peleasganadas;

    public Boxeador(int golpesacelerados, int peleasganadas) {
        this.golpesacelerados = golpesacelerados;
        this.peleasganadas = peleasganadas;
    }

    public Boxeador(int edad, int horasdeentrenamiento, String nombre, int golpesacelerados, int peleasganadas) {
        super(edad, horasdeentrenamiento, nombre);
        this.golpesacelerados = golpesacelerados;
        this.peleasganadas = peleasganadas;
    }

    public int getGolpesacelerados() {
        return golpesacelerados;
    }

    public void setGolpesacelerados(int golpesacelerados) {
        this.golpesacelerados = golpesacelerados;
    }

    public int getPeleasganadas() {
        return peleasganadas;
    }

    public void setPeleasganadas(int peleasganadas) {
        this.peleasganadas = peleasganadas;
    }

    @Override
    public String toString() {
        return "Boxeador{" +
                "golpesacelerados=" + golpesacelerados +
                ", peleasganadas=" + peleasganadas +
                '}';
    }

    @Override
    public int calcularrendimiento() {
        int rendimiento= (int) ((golpesacelerados*0.5)+(peleasganadas*10));
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
