package sopt.org.cds.controller.menu;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import sopt.org.cds.service.MenuService;

@RestController
@RequiredArgsConstructor
public class MenuController {
    private final MenuService menuService;

}
