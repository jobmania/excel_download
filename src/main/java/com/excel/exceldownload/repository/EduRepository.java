package com.excel.exceldownload.repository;

import com.excel.exceldownload.domain.dto.FrenDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class EduRepository {
    private final DataMapper mapper;
    public List<FrenDto> getFrenData(){
        List<FrenDto> frenData = mapper.findFrenData();
        return frenData;
    }
}
