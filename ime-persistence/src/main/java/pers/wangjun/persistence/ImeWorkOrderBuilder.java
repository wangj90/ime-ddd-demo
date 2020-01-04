package pers.wangjun.persistence;

import pers.wangjun.domain.aggregate.ImeWorkOrder;

/**
 * 工单创建者
 *
 * @author wangjun
 */
public interface ImeWorkOrderBuilder {

    /**
     * 工单持久化对象转换成工单聚合
     *
     * @param imeWorkOrderPo 工单持久化对象
     * @return 工单聚合
     */
    ImeWorkOrder toWorkOrder(ImeWorkOrderPo imeWorkOrderPo);

    /**
     * 工单聚合转换成工单持久化对象
     *
     * @param imeWorkOrder 工单聚合
     * @return 工单持久化对象
     */
    ImeWorkOrderPo fromWorkOrder(ImeWorkOrder imeWorkOrder);
}
