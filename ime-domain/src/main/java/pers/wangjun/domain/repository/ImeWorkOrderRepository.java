package pers.wangjun.domain.repository;

import pers.wangjun.domain.aggregate.ImeWorkOrder;
import pers.wangjun.domain.types.ImeWorkOrderId;

/**
 * 工单仓储
 *
 * @author wangjun
 */
public interface ImeWorkOrderRepository {

    /**
     * 根据工单Id查询工单
     *
     * @param imeWorkOrderId 工单Id
     * @return 工单聚合
     */
    ImeWorkOrder findById(ImeWorkOrderId imeWorkOrderId);

    /**
     * 保存工单
     *
     * @param imeWorkOrder 工单聚合
     */
    String save(ImeWorkOrder imeWorkOrder);
}
