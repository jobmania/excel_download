package com.excel.exceldownload.service;

import com.excel.exceldownload.domain.dto.FrenDto;
import com.excel.exceldownload.repository.EduRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExcelService {
    private final EduRepository eduRepository;
    @Transactional(readOnly = true)
    public List<FrenDto> getRenderedData(String type){

        List<FrenDto> frenData = eduRepository.getFrenData();
        return frenData;
    }
}
