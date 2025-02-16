public class CelsiusToFahrenheit {
    private double celsius;
    private double fahrenheit;

    public double getCelsius() {
        return celsius;
    }
    public double getFahrenheit() {
        return fahrenheit;
    }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void CTF(double cel, double fahrenheit) {
        this.celsius = cel;
        this.fahrenheit = fahrenheit;
    }

    public void describeCndF() {
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }

    public void convertCTF() {
        double convertedCTF = (double) 9 / 5 * celsius + 32;
        System.out.println("Converted Celsius of " + celsius + " to Fahrenheit " + convertedCTF);
    }

    public void convertFTC() {
        double convertedFTC = (double) (fahrenheit - 32) * 5/9;
        System.out.println("Converted Fahrenheit to Celsius " + convertedFTC);
    }
}
