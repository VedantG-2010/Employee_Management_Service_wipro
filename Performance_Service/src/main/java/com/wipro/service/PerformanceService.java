package com.wipro.service;

import java.util.List;
import com.wipro.dto.PerformanceDto;

public interface PerformanceService {

    PerformanceDto createPerformance(PerformanceDto performanceDto);

    List<PerformanceDto> getAllPerformances();

    PerformanceDto getPerformanceById(Long id);

    PerformanceDto updatePerformance(Long id, PerformanceDto performanceDto);

    String deletePerformance(Long id);
}