package com.excel.exceldownload.domain.dto;

import com.lannstark.DefaultHeaderStyle;
import com.lannstark.ExcelColumn;
import com.lannstark.ExcelColumnStyle;
import com.lannstark.style.DefaultExcelCellStyle;

@DefaultHeaderStyle(
        style = @ExcelColumnStyle(excelCellStyleClass = DefaultExcelCellStyle.class, enumName = "BLUE_HEADER")
)
public class FrenDto {
    @ExcelColumn(headerName = "가맹점명")
    private String name;
    @ExcelColumn(headerName = "주문수")
    private int count;
    @ExcelColumn(headerName = "주문금액")
    private int orderPrice;
    @ExcelColumn(headerName = "자사수수료")
    private int commission;
    @ExcelColumn(headerName = "입금금액")
    private int Input;
    @ExcelColumn(headerName = "결제일자")
    private String orderDate;

}
