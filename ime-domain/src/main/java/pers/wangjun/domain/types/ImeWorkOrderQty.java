package pers.wangjun.domain.types;

import lombok.Getter;
import lombok.Value;
import pers.wangjun.types.Measurement;

import java.math.BigDecimal;

/**
 * 工单数量
 *
 * @author wangjun
 */
@Getter
@Value
public class ImeWorkOrderQty {

    /**
     * 工单数量数值
     */
    private BigDecimal qty;

    /**
     * 工单数量计量单位
     */
    private Measurement measurement;
}
