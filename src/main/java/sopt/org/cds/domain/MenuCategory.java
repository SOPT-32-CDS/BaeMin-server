package sopt.org.cds.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MenuCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "menuCategory")
    private List<Menu> menuList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Store store;

    public MenuCategory(String name, Store store) {
        this.name = name;
        this.store = store;
        menuList = new ArrayList<>();
        store.getMenuCategoryList().add(this);
    }

    public static MenuCategory createMenuCategory(String name, Store store) {
        return new MenuCategory(name, store);
    }
}
