package sopt.org.cds.controller.menu;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import sopt.org.cds.service.MenuService;

@RestController
@RequiredArgsConstructor
public class MenuController {
    private final MenuService menuService;

    @GetMapping("menu/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Long getMenuDetail(@PathVariable final Long id) {
        
        return id;
    }

}
