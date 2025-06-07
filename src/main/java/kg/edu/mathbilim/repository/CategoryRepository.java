package kg.edu.mathbilim.repository;

import kg.edu.mathbilim.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Optional<Category> findByNameIgnoreCase(String name);

    boolean existsByNameIgnoreCase(String name);
}
