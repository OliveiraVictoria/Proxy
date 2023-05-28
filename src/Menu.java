import java.util.Arrays;
import java.util.List;

public class Menu implements IMenu{

    private Integer numeroPedido;
    private String nome;
    private String pedido;
    private Float valorSemana;
    private Float valorFinalSemana;

    public Menu(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        Menu objeto = BD.getMenu(numeroPedido);
        this.nome = objeto.nome;
        this.pedido = objeto.pedido;
        this.valorSemana = objeto.valorSemana;
        this.valorFinalSemana = objeto.valorFinalSemana;
    }

    public Menu(Integer numeroPedido, String nome, String pedido, Float valorSemana, Float valorFinalSemana) {
        this.numeroPedido = numeroPedido;
        this.nome = nome;
        this.pedido = pedido;
        this.valorSemana = valorSemana;
        this.valorFinalSemana = valorFinalSemana;
    }

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    @Override
    public List<String> obterDadosMenu() {
        return Arrays.asList(this.nome, this.pedido);
    }

    @Override
    public List<Float> obterPedido(Funcionario funcionario) {
        return Arrays.asList(this.valorSemana, this.valorFinalSemana);
    }
}
