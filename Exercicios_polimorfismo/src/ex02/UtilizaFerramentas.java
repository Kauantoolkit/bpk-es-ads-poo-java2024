package ex02;
import java.util.List;

public class UtilizaFerramentas {
    private List<Ferramenta> ferramentas;


    public UtilizaFerramentas(List<Ferramenta> ferramentas) {
        this.ferramentas = ferramentas;
    }


    public void usarFerramentas() {
        for (Ferramenta ferramenta : ferramentas) {
            ferramenta.usar();
        }
    }
}
