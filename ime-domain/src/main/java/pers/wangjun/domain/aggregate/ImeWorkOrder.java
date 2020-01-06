package pers.wangjun.domain.aggregate;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import pers.wangjun.domain.types.*;

/**
 * 工单
 *
 * @author wangjun
 */
@Getter
@Setter(value = AccessLevel.PRIVATE)
public class ImeWorkOrder {

    /**
     * 工单Id
     */
    private ImeWorkOrderId imeWorkOrderId;

    /**
     * 工单产品
     */
    private ImeWorkOrderProduct imeWorkOrderProduct;

    /**
     * 工单数量
     */
    private ImeWorkOrderQty imeWorkOrderQty;

    /**
     * 工单计划时间
     */
    private ImeWorkOrderPlanTime imeWorkOrderPlanTime;

    /**
     * 工单状态
     */
    private ImeWorkOrderStatus imeWorkOrderStatus;

    public ImeWorkOrder(ImeWorkOrderId imeWorkOrderId, ImeWorkOrderProduct imeWorkOrderProduct,
                        ImeWorkOrderQty imeWorkOrderQty, ImeWorkOrderPlanTime imeWorkOrderPlanTime) {
        this.setImeWorkOrderId(imeWorkOrderId);
        this.setImeWorkOrderPlanTime(imeWorkOrderPlanTime);
        this.setImeWorkOrderProduct(imeWorkOrderProduct);
        this.setImeWorkOrderQty(imeWorkOrderQty);
        this.setImeWorkOrderStatus(ImeWorkOrderStatus.Created);
    }
}
