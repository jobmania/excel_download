package com.excel.exceldownload.domain;

import com.lannstark.ExcelColumn;

public class FrenDto {

    @ExcelColumn(headerName = "가맹점명"
    )
    private String shopName;

    @ExcelColumn(headerName = "주문수")
    private int orderCount;

    @ExcelColumn(headerName = "주문금액")
    private int orderPrice;

    @ExcelColumn(headerName = "지사수수료")
    private int orderCommission;

    @ExcelColumn(headerName = "입금금액")
    private int asdfl;

}
