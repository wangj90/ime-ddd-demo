package pers.wangjun.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pers.wangjun.application.service.impl.ImeWorkOrderApplicationServiceImpl;
import pers.wangjun.domain.service.impl.CreateWorkOrderDomainServiceImpl;

/**
 * 工单配置
 *
 * @author wangjun
 */
@Configuration
@Import({CreateWorkOrderDomainServiceImpl.class, ImeWorkOrderApplicationServiceImpl.class})
public class ImeWorkOrderConfig {
}
