package pers.wangjun.domain.aggregate;

import lombok.Getter;
import lombok.Setter;

/**
 * 工单产品
 *
 * @author wangjun
 */
@Getter
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
