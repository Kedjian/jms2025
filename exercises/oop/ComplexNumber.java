public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void add(double real, double imag) {
        this.real += real;
        this.imag += imag;
    }

    public void subtract(double real, double imag) {
        this.real -= real;
        this.imag -= imag;
    }

    public void subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.real;
        this.imag -= complexNumber.imag;
    }
}

