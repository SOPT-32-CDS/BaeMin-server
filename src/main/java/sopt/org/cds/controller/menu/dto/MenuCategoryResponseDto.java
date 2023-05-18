package sopt.org.cds.controller.menu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategoryResponseDto {
    private Long id;
    private String name;
    private List<MenuResponseDto> menuList;
}
