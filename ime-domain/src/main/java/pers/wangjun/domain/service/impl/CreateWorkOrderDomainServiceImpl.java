package pers.wangjun.domain.service.impl;

import com.sun.media.sound.InvalidDataException;
import pers.wangjun.domain.aggregate.ImeWorkOrder;
import pers.wangjun.domain.repository.ImeWorkOrderRepository;
import pers.wangjun.domain.service.CreateWorkOrderDomainService;
import pers.wangjun.domain.types.ImeWorkOrderId;
import pers.wangjun.domain.types.ImeWorkOrderPlanTime;
import pers.wangjun.domain.types.ImeWorkOrderProduct;
import pers.wangjun.domain.types.ImeWorkOrderQty;

/**
 * 工单创建领域服务实现
 *
 * @author wangjun
 */
public class CreateWorkOrderDomainServiceImpl implements CreateWorkOrderDomainService {

    private ImeWorkOrderRepository imeWorkOrderRepository;

    public CreateWorkOrderDomainServiceImpl(ImeWorkOrderRepository imeWorkOrderRepository) {
        this.imeWorkOrderRepository = imeWorkOrderRepository;
    }

    @Override
    public String create(ImeWorkOrderId imeWorkOrderId, ImeWorkOrderProduct imeWorkOrderProduct,
                         ImeWorkOrderQty imeWorkOrderQty, ImeWorkOrderPlanTime imeWorkOrderPlanTime)
            throws InvalidDataException {
        ImeWorkOrder imeWorkOrder = imeWorkOrderRepository.findById(imeWorkOrderId);
        if (imeWorkOrder != null) {
            throw new InvalidDataException("相同编码[" + imeWorkOrderId.getCode() + "]的工单已存在");
        }
        ImeWorkOrder newWorkOrder = new ImeWorkOrder(imeWorkOrderId, imeWorkOrderProduct,
                imeWorkOrderQty, imeWorkOrderPlanTime);
        return imeWorkOrderRepository.save(newWorkOrder);
    }
}
