import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Menu> menus = new HashMap<>();

    public static Menu getMenu(Integer numeroPedido) {
        return menus.get(numeroPedido);
    }

    public static void addMenu(Menu menu) {
        menus.put(menus.getNumeroPedido(), menu);
    }
}
