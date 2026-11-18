// TODO: Defina a interface Adjustable
// Esta interface deve:
// - Declarar um método setLevel(int level)
// - Incluir uma constante MAX_LEVEL com valor 100
// Lembre-se: constantes em interfaces são implicitamente public static final

public interface Adjustable {
    int setLevel(int level);
    public static final int MAX_LEVEL = 100;
}