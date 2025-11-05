import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidadorTest {

    @Test
    public void testeCPFValido() {
        String resultado = ValidadorNovo.validarCPF("12345678909");
        assertEquals("Este CPF e valido! (12345678909)", resultado);
    }

    @Test
    public void testeCPFInvalidoComLetras() {
        String resultado = ValidadorNovo.validarCPF("12345abc901");
        assertEquals("O CPF nao pode conter simbolos, espacos ou letras. Digite apenas numerais", resultado.trim());
    }
}