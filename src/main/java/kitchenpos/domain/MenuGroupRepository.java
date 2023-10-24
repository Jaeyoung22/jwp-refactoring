package kitchenpos.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuGroupRepository extends JpaRepository<MenuGroup, Long> {

    default MenuGroup getById(Long id) {
        return findById(id).orElseThrow(() -> new MenuGroupException("해당하는 메뉴 그룹이 없습니다."));
    }
}
