package com.excel.exceldownload.domain.dto;

import com.lannstark.DefaultHeaderStyle;
import com.lannstark.ExcelColumn;
import com.lannstark.ExcelColumnStyle;
import com.lannstark.style.DefaultExcelCellStyle;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.Immutable;

@DefaultHeaderStyle(
        style = @ExcelColumnStyle(excelCellStyleClass = DefaultExcelCellStyle.class, enumName = "BLUE_HEADER")
)
@Entity
@Immutable // 해당 Entity에 매핑되는 것은 View이기 때문에 조회만 하고 수정은 존재하지 않는다.
public class FrenDto {

    @Id
    private Long id;
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
