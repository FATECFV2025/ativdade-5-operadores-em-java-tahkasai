package Models;

public class Operadores {
    private float p1;
    private float p2;

    // Construtor
    public Operadores(float p1, float p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Getter
    public float getP1() {
        return p1;
    }
    public float getP2() {
        return p2;
    }

    // operações
    public float adicao(float v1, float v2){
        return v1+v2;
    }
    public float subtracao(float v1, float v2){
        return v1-v2;
    }
    public float multiplicacao(float v1, float v2){
        return v1*v2;
    }
    public float divisao(float v1, float v2){
        return v1/v2;
    }

}
