package pers.wangjun.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 工单Jpa仓储
 *
 * @author wangjun
 */
public interface ImeWorkOrderJpaRepository extends JpaRepository<ImeWorkOrderPo, String> {

    /**
     * 根据工单编码查询
     *
     * @param code 工单编码
     * @return 工单持久化实体
     */
    ImeWorkOrderPo findByCode(String code);
}
