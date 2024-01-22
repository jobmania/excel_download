package com.excel.exceldownload.repository;


import com.excel.exceldownload.domain.dto.FrenDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DataMapper {

    @Select("select * from viewtable;")
    List<FrenDto> findFrenData();
}
