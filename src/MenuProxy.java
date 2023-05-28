import java.util.List;

public class MenuProxy implements IMenu {

    private Menu menu;

    private Integer numeroPedido;

    public MenuProxy(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    @Override
    public List<String> obterDadosMenu() {
        if (this.menu == null) {
            this.menu = new Menu(this.numeroPedido);
        }
        return this.menu.obterDadosMenu();
    }

    @Override
    public List<Float> obterPedido(Funcionario funcionario) {
        if (!funcionario.isAdministrador()) {
            throw new IllegalArgumentException("Pedido não realizado");
        }
        if (this.menu == null) {
            this.menu = new Menu(this.numeroPedido);
        }
        return this.menu.obterPedido(funcionario);
    }
}
