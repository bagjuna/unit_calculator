package unit.calculator.Area.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import unit.calculator.Area.entity.AreaConversionHistory;

public interface AreaHistoryRepository extends JpaRepository<AreaConversionHistory, Long> {

}
