package pers.wangjun.application.requestdto;

import lombok.Getter;
import lombok.Setter;
import pers.wangjun.domain.types.ImeWorkOrderStatus;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 创建工单Dto
 *
 * @author wangjun
 */
@Getter
@Setter
public class CreateWorkOrderDto {

    /**
     * 工单编码
     */
    private String code;

    /**
     * 计划开始时间
     */
    private Date imeWorkOrderPlanBeginTime;

    /**
     * 计划结束时间
     */
    private Date imeWorkOrderPlanEndTime;

    /**
     * 工单数量数值
     */
    private BigDecimal qty;

    /**
     * 工单状态
     */
    private ImeWorkOrderStatus imeWorkOrderStatus;
}
