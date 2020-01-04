package pers.wangjun.domain.types;

import lombok.Getter;
import lombok.Value;

/**
 * 工单产品
 *
 * @author wangjun
 */
@Getter
@Value
public class ImeWorkOrderProduct {

    /**
     * 工单Bom
     */
    private ImeWorkOrderBom imeWorkOrderBom;

    /**
     * 工单工艺路线
     */
    private ImeWorkOrderRouting imeWorkOrderRouting;
}
