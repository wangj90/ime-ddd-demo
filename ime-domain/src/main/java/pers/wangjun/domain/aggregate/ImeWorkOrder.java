package pers.wangjun.domain.aggregate;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pers.wangjun.domain.types.*;

/**
 * 工单
 *
 * @author wangjun
 */
@Getter
@Setter(value = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
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

    public static ImeWorkOrder create(ImeWorkOrderId imeWorkOrderId, ImeWorkOrderProduct imeWorkOrderProduct,
                                      ImeWorkOrderQty imeWorkOrderQty, ImeWorkOrderPlanTime imeWorkOrderPlanTime) {
        ImeWorkOrder imeWorkOrder = new ImeWorkOrder();
        imeWorkOrder.setImeWorkOrderId(imeWorkOrderId);
        imeWorkOrder.setImeWorkOrderPlanTime(imeWorkOrderPlanTime);
        imeWorkOrder.setImeWorkOrderProduct(imeWorkOrderProduct);
        imeWorkOrder.setImeWorkOrderQty(imeWorkOrderQty);
        imeWorkOrder.setImeWorkOrderStatus(ImeWorkOrderStatus.Created);
        return imeWorkOrder;
    }
}
