package pers.wangjun.persistence.repository.impl;

import org.springframework.stereotype.Repository;
import pers.wangjun.domain.aggregate.ImeWorkOrder;
import pers.wangjun.domain.repository.ImeWorkOrderRepository;
import pers.wangjun.domain.types.ImeWorkOrderId;
import pers.wangjun.persistence.ImeWorkOrderBuilder;
import pers.wangjun.persistence.ImeWorkOrderJpaRepository;
import pers.wangjun.persistence.ImeWorkOrderPo;

/**
 * 工单仓储实现
 *
 * @author wangjun
 */
@Repository
public class ImeWorkOrderRepositoryImpl implements ImeWorkOrderRepository {

    private ImeWorkOrderJpaRepository imeWorkOrderJpaRepository;

    private ImeWorkOrderBuilder imeWorkOrderBuilder;

    public ImeWorkOrderRepositoryImpl(ImeWorkOrderJpaRepository imeWorkOrderJpaRepository,
                                      ImeWorkOrderBuilder imeWorkOrderBuilder) {
        this.imeWorkOrderJpaRepository = imeWorkOrderJpaRepository;
        this.imeWorkOrderBuilder = imeWorkOrderBuilder;
    }

    public ImeWorkOrder findById(ImeWorkOrderId imeWorkOrderId) {
        ImeWorkOrderPo imeWorkOrderPo = imeWorkOrderJpaRepository.findByCode(imeWorkOrderId.getCode());
        return imeWorkOrderBuilder.toWorkOrder(imeWorkOrderPo);
    }

    public String save(ImeWorkOrder imeWorkOrder) {
        ImeWorkOrderPo imeWorkOrderPo = imeWorkOrderBuilder.fromWorkOrder(imeWorkOrder);
        imeWorkOrderJpaRepository.save(imeWorkOrderPo);
        return imeWorkOrderPo.getId();
    }
}
