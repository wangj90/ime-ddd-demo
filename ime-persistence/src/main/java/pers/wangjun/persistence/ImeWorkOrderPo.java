package pers.wangjun.persistence;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import pers.wangjun.domain.types.ImeWorkOrderStatus;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 工单持久化
 *
 * @author wangjun
 */
@Getter
@Setter
@Entity
@DynamicUpdate
public class ImeWorkOrderPo extends BasePo {

    /**
     * 工单编码
     */
    @NotBlank(message = "工单编码必填")
    private String code;

    /**
     * 计划开始时间
     */
    @NotNull(message = "计划开始时间必填")
    private Date imeWorkOrderPlanBeginTime;

    /**
     * 计划结束时间
     */
    @NotNull(message = "计划结束时间必填")
    private Date imeWorkOrderPlanEndTime;

    /**
     * 工单数量数值
     */
    @NotNull(message = "工单数量必填")
    @DecimalMin(message = "工单数量不正确", value = "0", inclusive = false)
    private BigDecimal qty;

    /**
     * 工单状态
     */
    @NotNull(message = "工单状态必填")
    @Enumerated(EnumType.STRING)
    private ImeWorkOrderStatus imeWorkOrderStatus;
}
