class Temperature {
    // TODO: Declarar campo privado para celsius (double)
    private double celsius;

    // TODO: Declarar campo privado para valid (boolean)
    private boolean valid;

    // TODO: Implementar o getter getCelsius()
    public double getCelsius() {
        return this.celsius;
    }

    // TODO: Implementar o setter setCelsius()
    // - Aceitar apenas valores iguais ou acima do zero absoluto (-273.15)
    // - Se for válido, defina celsius e defina valid como true
    // - Se for inválido, não altere celsius e defina valid como false
    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
            this.valid = true;
        } else {
            this.valid = false;
        }
    }
    
    // TODO: Implementar o getter isValid() (getters booleanos usam o prefixo "is")
    public boolean isValid() {
        return this.valid;
    }
    
    // TODO: Implementar o getter getFahrenheit()
    // - Converter celsius para Fahrenheit usando: (celsius * 9/5) + 32
    public double getFahrenheit() {
        return (this.celsius * 9/5) + 32;
    }
}
