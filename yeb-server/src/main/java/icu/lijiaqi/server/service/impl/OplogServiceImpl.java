package icu.lijiaqi.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.lijiaqi.server.mapper.OplogMapper;
import icu.lijiaqi.server.pojo.Oplog;
import icu.lijiaqi.server.service.IOplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
