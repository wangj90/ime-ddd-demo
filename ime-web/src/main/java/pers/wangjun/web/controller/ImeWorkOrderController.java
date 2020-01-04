package pers.wangjun.web;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.wangjun.application.ImeWorkOrderApplicationService;
import pers.wangjun.domain.types.ImeWorkOrderStatus;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wangjun
 */
@RestController
@RequestMapping("/imeWorkOrder")
public class ImeWorkOrderController {

    private ImeWorkOrderApplicationService imeWorkOrderApplicationService;

    public ImeWorkOrderController(ImeWorkOrderApplicationService imeWorkOrderApplicationService) {
        this.imeWorkOrderApplicationService = imeWorkOrderApplicationService;
    }

    @PutMapping
    public String create() {
        return imeWorkOrderApplicationService.create(String code, Date imeWorkOrderPlanBeginTime, Date imeWorkOrderPlanEndTime, BigDecimal qty, ImeWorkOrderStatus imeWorkOrderStatus;)
        ;
    }
}
