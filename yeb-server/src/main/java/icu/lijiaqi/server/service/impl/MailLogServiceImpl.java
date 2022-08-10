package icu.lijiaqi.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.lijiaqi.server.mapper.MailLogMapper;
import icu.lijiaqi.server.pojo.MailLog;
import icu.lijiaqi.server.service.IMailLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lijiaqi
 * @since 2022-05-01
 */
@Service
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
