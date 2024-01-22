package com.excel.exceldownload.controller;

import com.excel.exceldownload.domain.dto.FrenDto;
import com.excel.exceldownload.service.ExcelService;
import com.lannstark.excel.ExcelFile;
import com.lannstark.excel.onesheet.OneSheetExcelFile;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class TestController {

    private final ExcelService excelService;

    @GetMapping("/excel")
    public void settleExcel(@RequestParam("data") String requestData, HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        List<FrenDto> renderedData = excelService.getRenderedData(requestData);
        ExcelFile excelFile = new OneSheetExcelFile<>(renderedData, FrenDto.class);
        excelFile.write(response.getOutputStream());
    }

}
