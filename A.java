public class A {
    private int A1;
    private float A2;

    // Construtor
    public A(int A1, float A2) {
        this.A1 = A1;
        this.A2 = A2;
    }

    // Getters e Setters
    public int getA1() {
        return A1;
    }

    public void setA1(int A1) {
        this.A1 = A1;
    }

    public float getA2() {
        return A2;
    }

    public void setA2(float A2) {
        this.A2 = A2;
    }

    // Método MA1
    public void MA1() {
        System.out.println("Executando o método MA1");
    }

    // Método MA2
    public void MA2() {
        System.out.println("Executando o método MA2");
    }

    // Método MA3
    public void MA3() {
        System.out.println("Alteração a classe A partir do clone");
    }

    //Método GetSoma
    public Integer GetSoma(Integer A, Integer B) {
        return A + B;
    }
}
