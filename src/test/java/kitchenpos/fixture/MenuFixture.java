package kitchenpos.fixture;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import kitchenpos.core.menu.domain.Menu;
import kitchenpos.core.menu.domain.MenuProduct;
import kitchenpos.core.menugroup.domain.MenuGroup;

public class MenuFixture {

    public static Menu getMenuRequest(final Long menuGroupId) {
        return getMenuRequest("후라이드+후라이드", 17000, menuGroupId, Arrays.asList(getMenuProductRequest(1L)));
    }

    public static Menu getMenuRequest(final int price) {
        return getMenuRequest("후라이드+후라이드", price, 1L, Arrays.asList(getMenuProductRequest(1L)));
    }

    public static Menu getMenuRequest(final int price, final List<MenuProduct> menuProducts) {
        return getMenuRequest("후라이드+후라이드", price, 1L, menuProducts);
    }

    public static Menu getMenuRequest(final String name,
                                      final int price,
                                      final Long menuGroupId,
                                      final List<MenuProduct> menuProducts) {
        return Menu.of(name, BigDecimal.valueOf(price), menuGroupId, menuProducts);
    }

    public static Menu getMenu(final Long id) {
        return Menu.of(id, "후라이드+후라이드", BigDecimal.valueOf(17000), null, Arrays.asList(getMenuProduct(1L), getMenuProduct(1L)));
    }

    public static MenuProduct getMenuProductRequest(final Long productId) {
        return getMenuProductRequest(productId, 1L, 2, BigDecimal.valueOf(10000));
    }

    public static MenuProduct getMenuProductRequest(final Long productId, final Long menuId, final long quantity, final BigDecimal price) {
        return MenuProduct.of(menuId, productId, quantity, price);
    }

    public static MenuProduct getMenuProduct(final Long id) {
        return getMenuProduct(id, 1L, 1L, 1L, BigDecimal.valueOf(10000));
    }

    public static MenuProduct getMenuProduct(final Long id,
                                             final Long productId,
                                             final Long menuId,
                                             final long quantity,
                                             final BigDecimal price) {
        return MenuProduct.of(id, menuId, productId, quantity, price);
    }

    public static MenuGroup getMenuGroupRequest() {
        return new MenuGroup("추천메뉴");
    }

    public static MenuGroup getMenuGroup(final Long id) {
        return new MenuGroup(id, "추천메뉴");
    }
}
