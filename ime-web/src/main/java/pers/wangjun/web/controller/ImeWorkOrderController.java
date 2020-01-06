package pers.wangjun.web.controller;

import com.sun.media.sound.InvalidDataException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.wangjun.application.requestdto.CreateWorkOrderRequestDto;
import pers.wangjun.application.responsedto.CreateWorkOrderResponseDto;
import pers.wangjun.application.service.ImeWorkOrderApplicationService;

import javax.validation.Valid;

/**
 * 工单Controller
 *
 * @author wangjun
 */
@RestController
@RequestMapping("/imeWorkOrder")
public class ImeWorkOrderController {

    private ImeWorkOrderApplicationService imeWorkOrderApplicationService;

    public ImeWorkOrderController(ImeWorkOrderApplicationService imeWorkOrderApplicationService) {
        this.imeWorkOrderApplicationService = imeWorkOrderApplicationService;
    }

    @PostMapping
    public CreateWorkOrderResponseDto create(@RequestBody @Valid CreateWorkOrderRequestDto dto) throws InvalidDataException {
        return imeWorkOrderApplicationService.create(dto);
    }
}
