package pers.wangjun.persistence.impl;

import pers.wangjun.domain.aggregate.ImeWorkOrder;
import pers.wangjun.domain.types.*;
import pers.wangjun.persistence.ImeWorkOrderBuilder;
import pers.wangjun.persistence.ImeWorkOrderPo;
import pers.wangjun.types.Measurement;

/**
 * 工单创建者实现
 *
 * @author wangjun
 */
public class ImeWorkOrderBuilderImpl implements ImeWorkOrderBuilder {

    @Override
    public ImeWorkOrder toWorkOrder(ImeWorkOrderPo imeWorkOrderPo) {
        if (imeWorkOrderPo == null) {
            return null;
        }
        return new ImeWorkOrder(new ImeWorkOrderId(imeWorkOrderPo.getCode()),
                new ImeWorkOrderProduct(new ImeWorkOrderBom(), new ImeWorkOrderRouting()),
                new ImeWorkOrderQty(imeWorkOrderPo.getQty(), new Measurement()),
                new ImeWorkOrderPlanTime(imeWorkOrderPo.getImeWorkOrderPlanBeginTime(), imeWorkOrderPo.getImeWorkOrderPlanEndTime()));
    }

    @Override
    public ImeWorkOrderPo fromWorkOrder(ImeWorkOrder imeWorkOrder) {
        ImeWorkOrderPo imeWorkOrderPo = new ImeWorkOrderPo();
        imeWorkOrderPo.setCode(imeWorkOrder.getImeWorkOrderId().getCode());
        imeWorkOrderPo.setImeWorkOrderPlanBeginTime(imeWorkOrder.getImeWorkOrderPlanTime().getImeWorkOrderPlanBeginTime());
        imeWorkOrderPo.setImeWorkOrderPlanEndTime(imeWorkOrder.getImeWorkOrderPlanTime().getImeWorkOrderPlanEndTime());
        imeWorkOrderPo.setQty(imeWorkOrder.getImeWorkOrderQty().getQty());
        imeWorkOrderPo.setImeWorkOrderStatus(imeWorkOrder.getImeWorkOrderStatus());
        return imeWorkOrderPo;
    }
}
