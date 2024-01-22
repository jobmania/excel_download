package com.excel.exceldownload.repository;

import com.excel.exceldownload.domain.dto.FrenDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EduRepository extends JpaRepository<FrenDto, Long> {

    @Query(value = "select * from view_table", nativeQuery = true)
    public List<FrenDto> getFrenData();
}
