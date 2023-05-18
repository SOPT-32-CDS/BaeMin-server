package sopt.org.cds.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.cds.controller.menu.dto.MenuResponseDto;
import sopt.org.cds.infrastructure.MenuRepository;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final MenuRepository menuRepository;

    public MenuResponseDto getMenuDetail() {
        MenuResponseDto response = new MenuResponseDto();
        return response;
    }
}
