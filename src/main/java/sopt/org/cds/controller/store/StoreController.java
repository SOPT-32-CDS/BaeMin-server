package sopt.org.cds.controller.store;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import sopt.org.cds.service.StoreService;

@RestController
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;
}
