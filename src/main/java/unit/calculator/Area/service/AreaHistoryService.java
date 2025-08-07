package unit.calculator.Area.service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import unit.calculator.Area.entity.AreaConversionHistory;
import unit.calculator.Area.repository.AreaHistoryRepository;

@RequiredArgsConstructor
public class AreaHistoryService {

	private final AreaHistoryRepository areaHistoryRepository;

	public List<AreaConversionHistory> findAll() {
		return areaHistoryRepository.findAll();
	}

}
