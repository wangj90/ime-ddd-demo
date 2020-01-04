package pers.wangjun.domain.service;

import com.sun.media.sound.InvalidDataException;
import pers.wangjun.domain.types.ImeWorkOrderId;
import pers.wangjun.domain.types.ImeWorkOrderPlanTime;
import pers.wangjun.domain.types.ImeWorkOrderProduct;
import pers.wangjun.domain.types.ImeWorkOrderQty;

/**
 * 工单创建领域服务
 *
 * @author wangjun
 */
public interface CreateWorkOrderDomainService {

    /**
     * 创建工单
     *
     * @param imeWorkOrderId       工单Id
     * @param imeWorkOrderProduct  工单产品
     * @param imeWorkOrderQty      工单数量
     * @param imeWorkOrderPlanTime 工单计划时间
     * @return 工单
     */
    String create(ImeWorkOrderId imeWorkOrderId, ImeWorkOrderProduct imeWorkOrderProduct,
                  ImeWorkOrderQty imeWorkOrderQty, ImeWorkOrderPlanTime imeWorkOrderPlanTime)
            throws InvalidDataException;
}
