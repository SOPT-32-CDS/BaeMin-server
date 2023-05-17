package sopt.org.cds.infrastructure;

import org.springframework.data.repository.Repository;
import sopt.org.cds.domain.Store;

import java.util.Optional;

public interface StoreRepository extends Repository<Store, Long> {
    Optional<Store> findById(Long id);
}
